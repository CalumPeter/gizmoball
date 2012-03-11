package view.window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import view.icons.*;

import controller.Controller;

public class ButtonArea {

	private JPanel buttonArea;
	private ButtonGroup group;

	private JToggleButton cb;
	private JToggleButton sb;
	private JToggleButton tb;
	private JToggleButton bb;
	private JToggleButton ab;
	private JToggleButton frg;
	private JToggleButton flg;

	private JToggleButton lk;
	private JToggleButton lg;
	private JToggleButton dg;
	private JToggleButton rg;

	private JButton mode;

	private boolean canEdit;

	public ButtonArea(Controller controller) {
		canEdit = true;
		group = new ButtonGroup();
		buttonArea = new JPanel();
		buttonArea.setPreferredSize(new Dimension(100, 400));

		Icon cbbs = new CBIcon(Color.green);
		cb = new JToggleButton(cbbs);
		cb.setPreferredSize(new Dimension(30, 30));
		cb.setActionCommand("Circle");
		cb.setToolTipText("While selected you can place CircleGizmos to the grid by clicking it.");

		Icon sbbs = new SBIcon(Color.red);
		sb = new JToggleButton(sbbs);
		sb.setPreferredSize(new Dimension(30, 30));
		sb.setActionCommand("Square");
		sb.setToolTipText("While selected you can place SquareGizmos to the grid by clicking it.");

		Icon tbbs = new TBIcon(Color.blue);
		tb = new JToggleButton(tbbs);
		tb.setPreferredSize(new Dimension(30, 30));
		tb.setActionCommand("Triangle");
		cb.setToolTipText("While selected you can place TriangleGizmos to the grid by clicking it. ");

		Icon bbbs = new BIcon(Color.blue);
		bb = new JToggleButton(bbbs);
		bb.setPreferredSize(new Dimension(30, 30));
		bb.setActionCommand("Ball");
		bb.setToolTipText("While selected you can place balls to the grid by clicking it. ");

		Icon abbs = new AIcon(Color.magenta);
		ab = new JToggleButton(abbs);
		ab.setPreferredSize(new Dimension(66, 30));
		ab.setActionCommand("Absorber");
		ab.setToolTipText("While selected you can place absorbers to the grid by clicking it (Click, hold and drag to add large absorbers). ");

		mode = new JButton("Play");
		mode.setPreferredSize(new Dimension(68, 30));
		mode.setActionCommand("Mode");
		mode.setToolTipText("Switches between Edit and Play mode.");

		Icon lkbs = new LKIcon(Color.gray);
		lk = new JToggleButton(lkbs);
		lk.setPreferredSize(new Dimension(68, 30));
		lk.setActionCommand("KeyLink");
		lk.setToolTipText("Allows you to link a gizmo to a key. ");

		Icon glbs = new LGIcon(Color.gray);
		lg = new JToggleButton(glbs);
		lg.setPreferredSize(new Dimension(68, 30));
		lg.setActionCommand("GizmoLink");
		lg.setToolTipText("Allows you to link two gizmos together");

		Icon dbbs = new DGIcon(Color.gray);
		dg = new JToggleButton(dbbs);
		dg.setPreferredSize(new Dimension(30, 30));
		dg.setActionCommand("Delete");
		dg.setToolTipText("While selected you can delete grid elements by clicking them. ");

		Icon rgbs = new RGIcon(Color.gray);
		rg = new JToggleButton(rgbs);
		rg.setPreferredSize(new Dimension(30, 30));
		rg.setActionCommand("Rotate");
		rg.setToolTipText("While selected you can rotate rotatable grid elements by clicking them. ");

		Icon frbs = new FRIcon(Color.gray);
		frg = new JToggleButton(frbs);
		frg.setPreferredSize(new Dimension(30, 30));
		frg.setActionCommand("FlipperRight");
		frg.setToolTipText("While selected you can place right flippers to the grid. ");

		Icon flbs = new FLIcon(Color.gray);
		flg = new JToggleButton(flbs);
		flg.setPreferredSize(new Dimension(30, 30));
		flg.setActionCommand("FlipperLeft");
		frg.setToolTipText("While selected you can place left flippers to the grid. ");

		group.add(cb);
		group.add(sb);
		group.add(tb);
		group.add(bb);
		group.add(frg);
		group.add(flg);
		group.add(ab);
		group.add(lk);
		group.add(lg);
		group.add(dg);
		group.add(rg);
		group.add(mode);

		toggleArea();

	}

	public JPanel getButtonArea() {
		return buttonArea;
	}

	public void addListeners(ActionListener listener) {
		cb.addActionListener(listener);
		sb.addActionListener(listener);
		tb.addActionListener(listener);
		bb.addActionListener(listener);
		ab.addActionListener(listener);
		mode.addActionListener(listener);
		lk.addActionListener(listener);
		lg.addActionListener(listener);
		dg.addActionListener(listener);
		rg.addActionListener(listener);
		frg.addActionListener(listener);
		flg.addActionListener(listener);
	}

	public void activateEditButtons() {
		canEdit = !canEdit;
		toggleArea();
		cb.setEnabled(canEdit);
		sb.setEnabled(canEdit);
		tb.setEnabled(canEdit);
		bb.setEnabled(canEdit);
		ab.setEnabled(canEdit);
		lk.setEnabled(canEdit);
		lg.setEnabled(canEdit);
		dg.setEnabled(canEdit);
		rg.setEnabled(canEdit);
		frg.setEnabled(canEdit);
		flg.setEnabled(canEdit);
	}

	private void toggleArea() {
		if (canEdit) {
			group.clearSelection();
			buttonArea.add(mode);
			buttonArea.add(cb);
			buttonArea.add(sb);
			buttonArea.add(tb);
			buttonArea.add(bb);
			buttonArea.add(frg);
			buttonArea.add(flg);
			buttonArea.add(ab);
			buttonArea.add(lk);
			buttonArea.add(lg);
			buttonArea.add(dg);
			buttonArea.add(rg);

		} else {
			buttonArea.remove(cb);
			buttonArea.remove(sb);
			buttonArea.remove(tb);
			buttonArea.remove(bb);
			buttonArea.remove(frg);
			buttonArea.remove(flg);
			buttonArea.remove(ab);
			buttonArea.remove(lk);
			buttonArea.remove(lg);
			buttonArea.remove(dg);
			buttonArea.remove(rg);
		}
	}

}
