import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitPanel extends JPanel {
	
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField fahrenheit;
	private JButton celsius;
	
	public FahrenheitPanel(){
		
		inputLabel = new JLabel("Enter Fahrenheit Temperature: ");
		outputLabel = new JLabel("Temperature in Celsius: ");
		resultLabel = new JLabel("---");
		fahrenheit = new JTextField(5);
		fahrenheit.addActionListener(new TempListener());
		
		celsius = new JButton("PUSH");
		
		celsius.addActionListener(new TempListener());
		
		add(inputLabel);
		add(fahrenheit);
		add(celsius);
		add(outputLabel);
		add(resultLabel);
		
		setPreferredSize(new Dimension (320, 75));
		setBackground(Color.yellow);
	}
	
	private class TempListener implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			int fahrenheitTemp, celsiusTemp;
			
			String text = fahrenheit.getText();
			
			String str = event.getActionCommand();
				if (str.equals("PUSH"))
					text = fahrenheit.getText();
				fahrenheitTemp = Integer.parseInt(text);
				celsiusTemp = (fahrenheitTemp - 32) * 5/9;
				
				resultLabel.setText(Integer.toString(celsiusTemp));
		}
	}

}
