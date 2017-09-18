package gamezone;

import javax.swing.JCheckBox;

public class CalculateScore {
	/**
	 * Calculates the score given based on how many boxes the user has checked
	 * @param answers An Array of all the answer options
	 * @param answer A String that is equal to the actual answer to the question
	 * @return Returns the amount of points the user gets on the question
	 */
	public static int Calculate(JCheckBox[] answers, String answer) {
		int boxesChecked = totalChecked(answers);
		for (int i = 0; i < answers.length; i++) {
			String answerSelected = answers[i].getText().toLowerCase();
			if (answers[i].isSelected() && answer.equalsIgnoreCase(answerSelected)) {
				System.out.println(answers[i].getText());
				if (boxesChecked == 1) {
					return 5;
				} else if (boxesChecked == 2) {
					return 2;
				} else {
					return 1;
				}
			}
		}
		return 0;
	}
	
	/**
	 * Checks how many boxes are checked
	 * @param answer An array of all of the check boxes
	 * @return Returns how many boxes are checked
	 */
	private static int totalChecked(JCheckBox[] answer) {
		int check = 0;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i].isSelected()) {
				check += 1;
			}
		}
		return check;
	}
}
