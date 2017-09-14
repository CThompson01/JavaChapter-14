package practice;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class OffAndOn extends JFrame implements ActionListener{
	// Important Things
	private static final long serialVersionUID = -6129165705132339145L;
	final Dimension FRAME_DIMENSIONS = new Dimension(225,100);
	
	// Other Variables
	String headingText = "This will be disabled and enabled";
	
	// Frame Elements
	Font header = new Font("Times New Roman", Font.BOLD, 20);
	JLabel heading = new JLabel(headingText);
	JButton enabled = new JButton("Enable");
	JButton disabled = new JButton("Disable");
	
	public OffAndOn() {
		super("Off and On");
		setSize(FRAME_DIMENSIONS);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setResizable(false);
		add(heading);
		add(enabled);
		add(disabled);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		enabled.addActionListener(this);
		disabled.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == enabled) {
			heading.setText(headingText);
			enabled.setEnabled(false);
			disabled.setEnabled(true);
		} else if (e.getSource() == disabled) {
			heading.setText("                                                    ");
			enabled.setEnabled(true);
			disabled.setEnabled(false);
		}
	}
}
