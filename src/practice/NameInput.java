package practice;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NameInput extends JFrame implements ActionListener{
	// Important Things
	private static final long serialVersionUID = 1L;
	final Dimension FRAME_DIMENSIONS = new Dimension(275,250);
	
	// JFrame Elements
	Font bigFont = new Font("Arial", Font.BOLD, 16);
	JLabel greeting = new JLabel("What is your name?");
	JTextField nameInput = new JTextField(12);
	JButton enter = new JButton("Enter");
	
	public NameInput() {
		super("Hello Frame");
		setSize(FRAME_DIMENSIONS);
		setLayout(new FlowLayout());
		greeting.setFont(bigFont);
		add(greeting);
		add(nameInput);
		add(enter);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		enter.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == enter) {
			System.out.println("Enter button pressed");
			greeting.setText("Hello " + nameInput.getText());
		}
	}
}
