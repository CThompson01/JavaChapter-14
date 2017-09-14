package practice;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFrameWithManyComponents extends JFrame{
	private static final long serialVersionUID = 1680703771122675198L;
	final Dimension FRAME_DIMENSIONS = new Dimension(300, 150);
	
	public JFrameWithManyComponents() {
		super("Demonstrating many components");
		setSize(FRAME_DIMENSIONS);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel heading = new JLabel("This frame has many components");
		JLabel namePrompt = new JLabel("Enter your name: ");
		JTextField nameField = new JTextField(12);
		JButton button = new JButton("Click to continue");
		heading.setFont(new Font("Arial", Font.BOLD, 16));
		setLayout(new FlowLayout());
		add(heading);
		add(namePrompt);
		add(nameField);
		add(button);
	}
}
