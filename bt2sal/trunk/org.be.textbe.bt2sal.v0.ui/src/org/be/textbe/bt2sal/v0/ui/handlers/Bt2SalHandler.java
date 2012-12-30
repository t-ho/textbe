package org.be.textbe.bt2sal.v0.ui.handlers;

import java.util.Iterator;

import org.be.textbe.bt2sal.v0.ui.builder.Bt2SalBuilder;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 *
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class Bt2SalHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public Bt2SalHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		final Bt2SalBuilder bt2SalBuilder = new Bt2SalBuilder();
		final ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection != null) {
			if (selection instanceof IStructuredSelection) {
				final IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
				if(iStructuredSelection!= null){
					final Iterator<?> iterator = iStructuredSelection.iterator();
					while (iterator.hasNext()) {
						Object object = (Object) iterator.next();
						if (object instanceof IAdaptable) {
							IAdaptable adaptable2 = (IAdaptable) object;
							final IFile iFile = (IFile) adaptable2.getAdapter(IFile.class);
							bt2SalBuilder.translateBt(iFile);
						}

					}
				}


			}

		}

		return null;

	}
}
