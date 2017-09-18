package gamezone;

import java.awt.Font;

import javax.swing.JLabel;

@SuppressWarnings("unused")
public class Questions {
	/**
	 * Decides which question the window is supposed to display
	 * @param frame Allows for access to various components of the window
	 * @param questionOn Represents what question the user is on
	 * @param totalScore Is the total score that the user has accumulated
	 * @return Returns a value of which the answer to the next question is equal to
	 */
	public static String nextQuestion(Window frame, int questionOn, int totalScore) {
		String newAnswer = "";
		switch (questionOn) {
			case 0: 
				newAnswer = questionOne(frame);
				break;
			case 1:
				newAnswer = questionTwo(frame);
				break;
			case 2:
				newAnswer = questionThree(frame);
				break;
			case 3:
				newAnswer = questionFour(frame);
				break;
			case 4:
				newAnswer = questionFive(frame);
				break;
			case 5:
				gameComplete(frame, totalScore);
				break;
		}
		return newAnswer;
	}
	
	/**
	 * Sets up question one
	 */
	private static String questionOne(Window frame) {
		clearSelection(frame);
		frame.question.setText("Who was the first President?");
		frame.answerOne.setVisible(true);
		frame.answerTwo.setVisible(true);
		frame.answerThree.setVisible(true);
		frame.submit.setText("Next");
		return "George Washington";
	}
	
	/**
	 * Sets up question one
	 */
	private static String questionTwo(Window frame) {
		clearSelection(frame);
		frame.question.setText("What monument has president heads on it?");
		frame.answerOne.setText("Mount Rushmoore");
		frame.answerTwo.setText("Yellowstone");
		frame.answerThree.setText("Statue of Liberty");
		return "Mount Rushmoore";
	}
	
	/**
	 * Sets up question one
	 */
	private static String questionThree(Window frame) {
		clearSelection(frame);
		frame.question.setText("What river is the Hoover Dam built on?");
		frame.answerOne.setText("The Ganges River");
		frame.answerTwo.setText("The Mississippi River");
		frame.answerThree.setText("The Colorado River");
		return "The Colorado River";
	}
	
	/**
	 * Sets up question one
	 */
	private static String questionFour(Window frame) {
		clearSelection(frame);
		frame.question.setText("When was the Declaration of Independence signed?");
		frame.answerOne.setText("1776");
		frame.answerTwo.setText("1786");
		frame.answerThree.setText("1886");
		return "1776";
	}
	
	/**
	 * Sets up question one
	 */
	private static String questionFive(Window frame) {
		clearSelection(frame);
		frame.question.setText("What do the letters ZIP stand for in the United States postal code?");
		frame.answerOne.setText("Zone Improvement Plan");
		frame.answerTwo.setText("Zero Interstate Policy");
		frame.answerThree.setText("Zone Improvement Policy");
		return "Zone Improvement Plan";
	}
	
	/**
	 * Sets up the final game screen
	 * Displays the ratio of the User Score compared to the maximum score
	 * Also Displays a specific encouragement message depending on what score the user received
	 * @param frame Allows access to various frame components
	 * @param totalScore Allows for the displaying of the score the user got
	 */
	private static void gameComplete(Window frame, int totalScore) {
		frame.question.setText("CONGRATULATIONS YOU FINISHED THE QUIZ");
		frame.add(new JLabel("You finished with a score of " + totalScore + "/25!"));
		if (totalScore > 21) {
			frame.add(new JLabel("Fantastic!"));
		} else if (totalScore > 15) {
			frame.add(new JLabel("Very Good!"));
		} else {
			frame.add(new JLabel("You could use some improvement!"));
		}
		frame.question.setFont(new Font("Arial", Font.BOLD, 16));
		frame.answerOne.setVisible(false);
		frame.answerTwo.setVisible(false);
		frame.answerThree.setVisible(false);
		frame.submit.setVisible(false);
	}
	
	/**
	 * Makes the check boxes reset to default check position
	 */
	private static void clearSelection(Window frame) {
		frame.answerOne.setSelected(false);
		frame.answerTwo.setSelected(false);
		frame.answerThree.setSelected(false);
	}
}
