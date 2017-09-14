package practice;

import java.awt.Dimension;

import javax.swing.*;

@SuppressWarnings("serial")
public class JMyFrame extends JFrame{
	
	final Dimension FRAME_WIDTH_AND_HEIGHT = new Dimension(200, 120);
	
	public JMyFrame() {
		super("My frame");
		setSize(FRAME_WIDTH_AND_HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
