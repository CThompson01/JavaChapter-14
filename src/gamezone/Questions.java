package gamezone;

public class Questions {
	public static int nextQuestion(Window frame, int questionOn, String answer) {
		switch (questionOn) {
			case 0: 
				questionOne(frame, answer);
				break;
			case 1:
				questionTwo(frame, answer);
				break;
		}
		
		return questionOn + 1;
	}
	
	private static void questionOne(Window frame, String answer) {
		frame.question.setText("Who was the first President?");
		frame.answerOne.setVisible(true);
		frame.answerTwo.setVisible(true);
		frame.answerThree.setVisible(true);
		frame.submit.setText("Next");
		answer = "George Washington";
	}
	
	private static void questionTwo(Window frame, String answer) {
		frame.question.setText("What monument has president heads on it?");
		frame.answerOne.setText("Mount Rushmoore");
		frame.answerTwo.setText("Yellowstone");
	}
}
