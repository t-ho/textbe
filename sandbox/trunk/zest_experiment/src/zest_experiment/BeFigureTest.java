package zest_experiment;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * A test class to display a UMLFigure
 */
public class BeFigureTest {
	public static void main(String args[]) {
		Display d = new Display();
		final Shell shell = new Shell(d);
		shell.setSize(400, 400);
		shell.setText("BeFigure Test");
		LightweightSystem lws = new LightweightSystem(shell);
		Figure contents = new Figure();
		XYLayout contentsLayout = new XYLayout();
		contents.setLayoutManager(contentsLayout);

		BeNodeFigure beNodeFigure = new BeNodeFigure();

		contentsLayout.setConstraint(beNodeFigure,
				new Rectangle(10, 10, -1, -1));

		contents.add(beNodeFigure);

		lws.setContents(contents);
		shell.open();
		while (!shell.isDisposed())
			while (!d.readAndDispatch())
				d.sleep();
	}
}
