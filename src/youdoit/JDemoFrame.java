package youdoit;

import java.awt.Dimension;

import javax.swing.*;

public class JDemoFrame {
	static final Dimension FRAME_DIMENSIONS = new Dimension(400,400);
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(FRAME_DIMENSIONS);
		frame.setTitle("JDemoFrame");
		frame.setVisible(true);
	}
}
