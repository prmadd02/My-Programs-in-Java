import javax.swing.*;

public class FenceDemo {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame ("Fence");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Fence panel = new Fence();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}

}
