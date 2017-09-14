package debugging;

// Creates a frame with a specified size
// Twice as tall as wide
// The size is a constructor argument
import javax.swing.*;
public class FixDebugFourteen1 extends JFrame {
	private static final long serialVersionUID = -347839001444616349L;
	
	public FixDebugFourteen1(int size) {
      super("This is my frame");
      setSize(size, size);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
   
	public static void main(String[] args) {
      FixDebugFourteen1 frame = new FixDebugFourteen1(200);
      frame.setVisible(true);
	} 
}
