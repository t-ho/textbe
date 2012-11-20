package zest_experiment;

import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.SimpleRaisedBorder;
import org.eclipse.swt.graphics.Color;

public class BeNodeFigure extends RectangleFigure {
	
	public static Color orange = new Color(null, 255, 200, 20);
	public static Color nodeColor = orange;

	public BeNodeFigure() {
		super();

		setBackgroundColor(nodeColor);
		setOpaque(true);
		SimpleRaisedBorder raisedBorder = new SimpleRaisedBorder(2);
		setBorder(raisedBorder);

		GridLayout layout = new GridLayout(2, false);

		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 0;
		layout.marginHeight = 0;
		layout.marginWidth = 0;


		setLayoutManager(layout);

		addCell(layout, "R3");
		addCell(layout, "Train\n[wearing socks]");
		addCell(layout, "where (at)");
		addCell(layout, "STATION");
		addCell(layout, "why");
		addCell(layout, "Because there are rats");
		addCell(layout, "how");
		addCell(layout, "With great difficulty");

	}

	private void addCell(GridLayout layout, String labelText) {
		Label label = new Label(labelText);
		label.setLabelAlignment(Label.LEFT);
		layout.setConstraint(label, new GridData(GridData.FILL_BOTH));
		label.setBorder(new CompoundBorder(new LineBorder(), new MarginBorder(5)));
		add(label);
	}

}