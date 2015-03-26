import javax.swing.*;

public class PhoneKeypadDemo {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Phone Keypad");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PhoneKeypad panel = new PhoneKeypad();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);

	}

}
