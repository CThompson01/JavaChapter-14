package gamezone;

import javax.swing.JCheckBox;

public class CalculateScore {
	public static int Calculate(JCheckBox ansOne, JCheckBox ansTwo, JCheckBox ansThree, String answer) {
		JCheckBox[] answers = {ansOne,ansTwo,ansThree};
		int boxesChecked = 0;
		totalChecked(boxesChecked, answers);
		for (int i = 0; i < 3; i++) {
			System.out.println("for loop");
			if (answers[i].isSelected() && answer.equalsIgnoreCase(answers[i].getText())) {
				System.out.println("Correct");
				if (boxesChecked == 1) {
					System.out.println("correct");
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
	
	private static void totalChecked(int check, JCheckBox[] answer) {
		System.out.println("total checked");
		for (int i = 0; i < 3; i++) {
			if (answer[i].isSelected()) {
				check += 1;
			}
		}
	}
}
