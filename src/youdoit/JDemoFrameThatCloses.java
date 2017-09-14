package youdoit;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class JDemoFrameThatCloses {
	static final Dimension FRAME_DIMENSIONS = new Dimension(250,100);
	static final FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel greeting = new JLabel("Good day");
		JLabel greeting2 = new JLabel("Who are you?");
		frame.setSize(FRAME_DIMENSIONS);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("JDemoFrame");
		frame.setLayout(layout);
		frame.add(greeting);
		frame.add(greeting2);
		frame.setVisible(true);
	}
}
