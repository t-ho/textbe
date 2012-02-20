/*
 * @author tmyers
 * @version 0.1
 * @created 07.05.2010
 * 
 */

package org.be.textbe.beviz;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class RefreshFileAction implements IViewActionDelegate {
	
	private BEView view;

	public void init(IViewPart view) {
		this.view = (BEView) view;
	}

	public void run(IAction action) {	
		new RefreshViewJob(view).schedule();
	}
	
	private class RefreshViewJob extends Job {
		
		private BEView view;

		public RefreshViewJob(BEView view) {
			super("Refresh View job");
			this.view = view;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			monitor.beginTask("refreshing view", 100);
			//getJobManager().beginRule(AbstractGraphicalContentProvider.CONTENT_LOADING_RULE, monitor);
			try {
				view.refreshSVG();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				//getJobManager().endRule(AbstractGraphicalContentProvider.CONTENT_LOADING_RULE);
				monitor.done();
			}
			return Status.OK_STATUS;
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// don't care
	}

}
