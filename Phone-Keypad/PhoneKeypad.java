import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PhoneKeypad extends JPanel {
	
	private JPanel keypadPanel, numberPanel, clearPanel;
	private JLabel numbers;
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b11, b12, clear;
	
	public PhoneKeypad(){
		
		setPreferredSize(new Dimension(250,200));
		
		setLayout(new BorderLayout());
		
		numberPanel = new JPanel();
		
		keypadPanel = new JPanel(new GridLayout(4, 3));
		
		clearPanel = new JPanel();
		
		numbers = new JLabel("Number: ");
		
		numberPanel.add(numbers);
		
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		b11 = new JButton("*");
		b12 = new JButton("#");
		
		keypadPanel.add(b1);
		keypadPanel.add(b2);
		keypadPanel.add(b3);
		keypadPanel.add(b4);
		keypadPanel.add(b5);
		keypadPanel.add(b6);
		keypadPanel.add(b7);
		keypadPanel.add(b8);
		keypadPanel.add(b9);
		keypadPanel.add(b11);
		keypadPanel.add(b0);
		keypadPanel.add(b12);
		
		clear = new JButton("Clear");
		
		clearPanel.add(clear);
		
		numberPanel.setBorder(BorderFactory.createLineBorder(Color.red));
		
		keypadPanel.setBorder(BorderFactory.createLineBorder(Color.green));
		
		b1.addActionListener(new KeypadListener());
		b2.addActionListener(new KeypadListener());
		b3.addActionListener(new KeypadListener());
		b4.addActionListener(new KeypadListener());
		b5.addActionListener(new KeypadListener());
		b6.addActionListener(new KeypadListener());
		b7.addActionListener(new KeypadListener());
		b8.addActionListener(new KeypadListener());
		b9.addActionListener(new KeypadListener());
		b11.addActionListener(new KeypadListener());
		b0.addActionListener(new KeypadListener());
		b12.addActionListener(new KeypadListener());
		clear.addActionListener(new KeypadListener());
		
		add(numberPanel, BorderLayout.NORTH);
		add(keypadPanel, BorderLayout.WEST);
		add(clearPanel);
		
		
	}
	
private class KeypadListener implements ActionListener{
	
	public void actionPerformed(ActionEvent ae){
		
		String str = ae.getActionCommand();
		
		if(str.equals("Clear"))
			numbers.setText("Number: ");
		else
			numbers.setText(numbers.getText() + str);
			
			
		
	}
	
}

}
