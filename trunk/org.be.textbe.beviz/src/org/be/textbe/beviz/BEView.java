/*
 * @author tmyers
 * @version 0.1
 * @created 07.05.2010
 * 
 */

package org.be.textbe.beviz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jet.BodyContentWriter;
import org.eclipse.jet.BufferedJET2Writer;
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2TemplateManager;
import org.eclipse.jet.JET2TemplateManager.ITemplateRunner;
import org.eclipse.jet.transform.TransformContextExtender;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import com.abstratt.graphviz.GraphViz;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.jdt.internal.ui.packageview.PackageExplorerPart;
import org.eclipse.ui.editors.text.TextEditor;
import org.osgi.framework.Bundle;
import org.eclipse.m2m.atl.common.ATLExecutionException;

public class BEView extends ViewPart {

	private static IInjector injector;
	private static IExtractor extractor;
	private static IReferenceModel inMetamodel;	
	private static IReferenceModel outMetamodel;
	private static URL btASMURL;
	private static URL ctASMURL;
	private static URL stASMURL;
	private static ModelFactory factory; 
	private SVGComposite svg;
	private File dotFile;
	private File svgFile;
	private BEWindowListener listener;
	

	static {
		try {
			Bundle bundle = Platform.getBundle("org.be.textbe.beviz");
			btASMURL = bundle.getEntry("transformations/textBT2GV.asm");
			ctASMURL = null;
			stASMURL = null;
			
			injector = CoreService.getInjector("EMF"); //$NON-NLS-1$
			extractor = CoreService.getExtractor("EMF"); //$NON-NLS-1$
			
			factory = CoreService.createModelFactory("EMF");
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}		
	}

	public BEView() throws IOException {	
		dotFile = File.createTempFile("dotfile", ".dot");
		svgFile = File.createTempFile("svgfile", ".svg");
		listener = new BEWindowListener(this);
		PlatformUI.getWorkbench().addWindowListener(listener);
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout());

		svg = new SVGComposite(parent, SWT.NONE, false);

		parent.layout();

		new Action() {
			public void run() {
				svg.paintSVGFile();
			}
		};
	}

	@Override
	public void setFocus() {
		svg.setFocus();
	}

	public void dispose() {
		getViewSite().getPage().removeSelectionListener(svg);
		svg.dispose();
		super.dispose();
	}

	public File getDOTFile() {
		return dotFile;
	}

	public void setDOTFile(File dotFile){
		this.dotFile = dotFile;
	}

	public void refreshSVG() throws MalformedURLException{
		svg.setSVGFile(svgFile.toURI().toURL());
	}
	
	public void clear(){
		try {
			dotFile.delete();
			svgFile.delete();
			dotFile = File.createTempFile("dotfile", ".dot");
			svgFile = File.createTempFile("svgfile", ".svg");
			svg.setVisible(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void processGVModel(IFile file, BEView view, URL transformation){	
		/*try {
			TextBT2GV runner = new TextBT2GV();
			runner.loadModels(file.getFullPath().toPortableString());
			runner.doTextBT2GV(new NullProgressMonitor());
			runner.saveModels("outputModel.gv");
		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ATLExecutionException e) {
			e.printStackTrace();
		}*/
		
		IFile f = (IFile) file;
		IPath path = (IPath) f.getLocation();
		IModel outputModel = null;
		
		// Defaults
		try {
			// Metamodels
			inMetamodel = factory.newReferenceModel();
			outMetamodel = factory.newReferenceModel();
			injector.inject(inMetamodel, "http://org.be.textbe/textbt");	    
			injector.inject(outMetamodel, "http://org.be.textbe/gv");		    

			// Getting Launcher
			ILauncher launcher = null;
			launcher = CoreService.getLauncher("EMF-specific VM");
			launcher.initialize(Collections.<String, Object> emptyMap());

			// Creating Models
			IModel inputModel = factory.newModel(inMetamodel);
			outputModel = factory.newModel(outMetamodel);
			
			// Loading Existing Model
			injector.inject(inputModel, file.getFullPath().toPortableString());

			// DEBUG - Dump Input Model
			// extractor.extract(inputModel, file.getFullPath().toPortableString().substring(0,file.getFullPath().toPortableString().length()-3)+".textbt");
						
			// Launching
			launcher.addOutModel(outputModel, "GV", "OUT");
			launcher.addInModel(inputModel, "TEXTBT", "IN");

			launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), Collections.<String, Object> emptyMap(), transformation.openStream());

			// Saving Model
			extractor.extract(outputModel, "outputModel.gv");
		} catch (Exception e1) {
			e1.printStackTrace();
		} 
		
		try{
			final JET2Context context = createJETContext(((EMFModel)outputModel).getResource(), null);
			
			final BufferedJET2Writer out = new BodyContentWriter();				

			try {
				JET2TemplateManager.run(new String[] {"org.be.textbe.gv.gv2text"}, new JET2TemplateManager.ITemplateOperation() {
					public void run(ITemplateRunner templateRunner) {
						templateRunner.generate("templates/gv.jet", context, out);
					}
				});
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			FileWriter writer1 = new FileWriter(dotFile);
			writer1.write(out.getContent());
			writer1.close();

			GraphViz.runDot("svg", new Point(0, 0), dotFile, svgFile);
			
			FileReader input = new FileReader(svgFile);
			BufferedReader bufRead = new BufferedReader(input);

			String line = bufRead.readLine();
			if (line == null){
				svgFile.delete();
				dotFile.delete();
				dotFile = File.createTempFile("dotfile", ".dot");
				svgFile = File.createTempFile("svgfile", ".svg");
				svg.setVisible(false);
			}else{
				view.setDOTFile(dotFile);
				svg.setSVGFile(svgFile.toURI().toURL());
				svg.setVisible(true);
			}

			bufRead.close();
			input.close();
			
			outputModel = null;
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public static JET2Context createJETContext(Object modelRoot,
			final Map<String, ?> variables) {

		Map<String, Object> copiedVariables = new HashMap<String, Object>(
				variables != null ? variables : 
					Collections.<String, Object> emptyMap());

		// ensure that c:iterate can set the XPath context object
		copiedVariables.put("org.eclipse.jet.taglib.control.iterateSetsContext", Boolean.TRUE);	

		final JET2Context context = new JET2Context(modelRoot, copiedVariables);

		// this statement has the side effect of initializing tag handling
		TransformContextExtender.getInstance(context);
		return context;
	}
	
	private class BEPartListener implements IPartListener{
		BEView view;
		IWorkbenchPart currentPart;
		
		
		public BEPartListener(BEView view) {
			this.view = view;
			currentPart = null;
		}
		
		@Override public void partBroughtToTop(IWorkbenchPart part) {}
		@Override public void partDeactivated(IWorkbenchPart part) {}

		@Override
		public void partActivated(IWorkbenchPart part) {
			if (part instanceof TextEditor && part.getTitle().endsWith(".bt") && part != currentPart){
				part = currentPart;
				try{
					if (((TextEditor)currentPart).getEditorInput() != null){
						IFile file = (IFile)((IFileEditorInput)((TextEditor)currentPart).getEditorInput()).getFile();
						processGVModel(file,view, btASMURL);
					}
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}

		@Override
		public void partClosed(IWorkbenchPart part) {
			IWorkbenchPage page = null;
			if (PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null){
				if (PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage() != null){
					page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				}else{
					return;
				}
			}else{
				return;
			}
			
			// Check for an open editor
			for(IEditorReference e : page.getEditorReferences()){
				if (e.getTitle().endsWith(".bt")){
					return;
				}
			}
				
			// Check for active selection
			for(IViewReference v : page.getViewReferences()){
				if (v instanceof PackageExplorerPart){
					ISelection s = ((PackageExplorerPart)v).getTreeViewer().getSelection();
					org.eclipse.core.internal.resources.File file = (org.eclipse.core.internal.resources.File)((TreeSelection)s).getFirstElement();
					if (file.getFileExtension().equals("bt")){
						return;
					}
				}
			}
		}

		@Override
		public void partOpened(IWorkbenchPart part) {
			if (part instanceof TextEditor && part.getTitle().endsWith(".bt")){
				currentPart = part;
			}
		}
	}
	
	private class BESelectionListener implements ISelectionListener{
		private BEView view;
		private org.eclipse.core.internal.resources.File currentFile;

		public BESelectionListener(BEView view) {
			this.view = view;
			currentFile = null;
		}

		@Override
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			if (part instanceof PackageExplorerPart && selection instanceof TreeSelection){
				if (((TreeSelection)selection).getFirstElement() instanceof org.eclipse.core.internal.resources.File){
					org.eclipse.core.internal.resources.File file = (org.eclipse.core.internal.resources.File)((TreeSelection)selection).getFirstElement();
					if (file.getFileExtension().equals("bt")){
						if (!file.equals(currentFile)){
							currentFile = file;
							processGVModel(currentFile,view,btASMURL);
						}
					}else{
						view.clear();
						currentFile = null;
					}
				}else{
					return;
				}
			}else if (part instanceof TextEditor && part.getTitle().endsWith(".bt")){
				IFile file = (IFile)((IFileEditorInput)((TextEditor)part).getEditorInput()).getFile();
				currentFile = (org.eclipse.core.internal.resources.File) file;
				processGVModel(file,view,btASMURL);
			}
		}
	}


	private class BEWindowListener implements IWindowListener{
		private BEView view;
		private ISelectionListener selectionListener;
		private IPartListener partListener;

		
		public BEWindowListener(BEView btView) {
			this.view = btView;
		}

		@Override public void windowActivated(IWorkbenchWindow window) {}
		@Override public void windowClosed(IWorkbenchWindow window) {}
		@Override public void windowDeactivated(IWorkbenchWindow window) {}
		
		@Override
		public void windowOpened(IWorkbenchWindow window) {
			if (window.getActivePage() != null){
				IWorkbenchPage page = window.getActivePage();
				partListener = new BEPartListener(this.view);
				page.addPartListener(partListener);
				selectionListener = new BESelectionListener(this.view);
				page.addPostSelectionListener(selectionListener);		
				
				if (page.getActiveEditor() != null){
					IEditorPart e = page.getActiveEditor();
					IFile file;
					IEditorInput input = null;
					input = e.getEditorInput();
					if (input instanceof IFileEditorInput & e.getTitle().endsWith(".bt")){
						file = (IFile)((IFileEditorInput)input).getFile();
						processGVModel(file, view, btASMURL);
					}
				}
			}
		}
	}
}