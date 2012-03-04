package mainwindow;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MenuBar;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import buttons.ButtonArea;

import menubar.GizmoMenu;

/**
 * 
 * @author Andew White - 200939787
 * 
 * ApplicationWindow
 * 
 * @version 1.0 Started development of the GizmoBall GUI.
 *
 */
public class ApplicationWindow extends JFrame {
	
	private GizmoMenu menu;
	private ButtonArea buttonArea;
	
	public ApplicationWindow(){
		super("Gizmoball");
		
		buttonArea = new ButtonArea();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		JPanel scrollPane = new JPanel();
		scrollPane.setPreferredSize(new Dimension(400, 400));
		scrollPane.setBackground(new Color(0));
		JPanel contentPane = new JPanel();
		
		menu = new GizmoMenu();
		
		contentPane.setLayout(new BorderLayout());
		contentPane.setPreferredSize(new Dimension(600, 400));
		
		contentPane.add(scrollPane, BorderLayout.WEST);
		contentPane.add(buttonArea.getButtonArea(), BorderLayout.EAST);
		setContentPane(contentPane);
		
		requestFocus();
	}
	
	public void paint(Graphics g) {
		super.paint(g);

		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

	}

	
	public boolean isFocusable(){
		return true;
	}
	
	public GizmoMenu getGizmoMenu(){
		return menu;
	}
	
	

}
