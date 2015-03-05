import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextStatPanel extends JPanel implements ActionListener{
	
	private JTextArea textArea;
	private JButton updateButton;
	private JLabel[] stats;
	
	public static final String[] statLabels = {
		
		"Number of Words: ",
		"Average word length: "
	};
	
	public TextStatPanel(){
		
		textArea = new JTextArea(" ");
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		
		updateButton = new JButton ("Update Text Statistics");
		updateButton.addActionListener(this);
		
		JPanel statPane = new JPanel();
		statPane.setBorder(BorderFactory.createTitledBorder("Text Statistics"));
		statPane.setPreferredSize(new Dimension(250, 120));
		statPane.setOpaque(false);
		
		int n = statLabels.length;
		statPane.add(updateButton);
		stats = new JLabel[n];
		for (int i = 0; i<n; ++i){
			JLabel l = new JLabel(statLabels[i]);
			statPane.add(l);
			stats[i] = new JLabel();
			statPane.add(stats[i]);
		}
		
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setPreferredSize(new Dimension(350, 400));
		scroll.setBorder(BorderFactory.createTitledBorder("Text Container(Enter the text below)"));
		
		add(scroll);
		add(statPane);
		setBackground(new Color(.33f, .45f, .65f));
		setPreferredSize(new Dimension(400, 600));
		updateStatistics();
	}
	
	public void actionPerformed(ActionEvent event){
		Object source = event.getSource();
		if (source == updateButton){
			updateStatistics();
		}
		
	}
	
	private void updateStatistics(){
		String text = textArea.getText();
		String[] words = text.split(" ");
		
		float ave = ((text.length()-words.length+0.0f)/words.length)-1;
		stats[0].setText(String.valueOf(words.length));
		stats[1].setText(String.valueOf(ave));
	}

}
