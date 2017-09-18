package gamezone;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1191777976666769608L;
	
	// Various variables
	int questFinished = 0;
	int totalScore = 0;
	
	// JFrame Components
	final Dimension FRAME_DIMENSIONS = new Dimension(400,275);
	String answerToQuestion = "George Washington";
	String[] breaking = {"                                                                                                                                                                 "};
	JLabel question = new JLabel("Click Continue To Begin");
	JCheckBox answerOne = new JCheckBox("Abraham Lincoln");
	JCheckBox answerTwo = new JCheckBox("George Washington");
	JCheckBox answerThree = new JCheckBox("Teddy Roosevelt");
	JButton submit = new JButton("Continue");
	
	/**
	 * Creates the window and adds all the needed components to it
	 */
	public Window() {
		super("Quizlet");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setSize(FRAME_DIMENSIONS);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		add(question);
		add(new JLabel(breaking[0]));
		add(answerOne);
		add(new JLabel(breaking[0]));
		add(answerTwo);
		add(new JLabel(breaking[0]));
		add(answerThree);
		add(new JLabel(breaking[0]));
		add(submit);
		submit.addActionListener(this);
		init();
		setVisible(true);
	}
	
	/**
	 * Makes the check boxes not visible at the start of the quiz
	 */
	private void init() {
		answerOne.setVisible(false);
		answerTwo.setVisible(false);
		answerThree.setVisible(false);
	}
	
	/**
	 * Gets triggered when an action happens
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submit) {
			JCheckBox[] answers = {answerOne, answerTwo, answerThree};
			totalScore += CalculateScore.Calculate(answers, answerToQuestion);
			System.out.println(totalScore);
			answerToQuestion = Questions.nextQuestion(this, questFinished, totalScore);
			questFinished += 1;
		}
	}
}
