package org.be.textbe.beviz.be2gv;

import java.io.IOException;

import org.be.textbe.gv.Graph;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.m2m.atl.common.ATLExecutionException;

public class Be2Gv {

	public static String transformBt2Gv(final String resource) throws IOException {
	
		Graph graph;
		try {
			final NullProgressMonitor progressMonitor = new NullProgressMonitor();
			graph = Be2GvModel.transformBt2GvModel2(resource, progressMonitor);
		} catch (ATLExecutionException e) {
			throw new RuntimeException("ATL has failed. Internal error. Cannot translate source.");
		}
	
		/**
		 * Invoke the Jet conversion
		 */
		final String gvModel2Text = GvModel2Text.gvModel2Text(graph);
	
		/**
		 * Return the result
		 */
		return gvModel2Text;
	}

}
