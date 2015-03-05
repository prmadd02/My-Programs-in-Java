import javax.swing.JFrame;

public class TextStatDriver {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Tool for calculating basic statistic segment of text:");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new TextStatPanel());
		
		frame.pack();
		frame.setVisible(true);

	}

}
