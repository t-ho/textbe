package org.be.textbe.gv.bt_view.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.zest.dot.DotGraph;

public class BT_View extends ViewPart {

	public static final String ID = "org.be.textbe.gv.bt_view.views.BT_View";

	public void createPartControl(Composite parent) {

		DotGraph graph = new DotGraph("digraph{ 1->2 }", parent, SWT.NONE);
		graph.add("2->3").add("2->4");
		graph.add("node[label=zested]; edge[style=dashed]; 3->5; 4->6");

	}

	@Override
	public void setFocus() {		
	}
}