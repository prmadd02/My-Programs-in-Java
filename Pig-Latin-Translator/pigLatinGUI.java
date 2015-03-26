import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;


public class pigLatinGUI extends JFrame implements ActionListener {

	private JLabel Label1;
	private JTextArea englishText;
	private JButton b1;
	private JLabel Label2;
	private JTextArea latinText;
	
	
public pigLatinGUI(){
	
	this.setTitle("Pig Latin Translator");
	this.setSize(525, 600);
	this.setLocation(100, 100);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container panel = this.getContentPane();
	panel.setLayout(null);
	
	Label1 = new JLabel("English: ");
	Label2 = new JLabel("Pig Latin: ");
	
	englishText = new JTextArea();
	englishText.setEditable(true);
	englishText.setBorder(BorderFactory.createLoweredBevelBorder());
	englishText.setLineWrap(true);
	
	latinText = new JTextArea();
	latinText.setEditable(false);
	latinText.setBorder(BorderFactory.createRaisedBevelBorder());
	latinText.setLineWrap(true);
	
	b1 = new JButton("Translate");
	b1.addActionListener(this);
	
	panel.add(Label1);
	panel.add(englishText);
	panel.add(b1);
	panel.add(Label2);
	panel.add(latinText);
	
	Label1.setBounds(25,100,400,25);
	englishText.setBounds(50,130,400,100);
	b1.setBounds(200,260,100,40);
	Label2.setBounds(25,320,100,25);
	latinText.setBounds(50,350,400,100);
	
}

public static void main(String[] args){
	
	pigLatinGUI frame = new pigLatinGUI();
	frame.setVisible(true);
	
}

public static String translate (String sentence){
	
	String result = "";
	
	sentence = sentence.toLowerCase();
	
	Scanner scan = new Scanner (sentence);
	
	while (scan.hasNext()){
		result += translateWord (scan.next());
		result += " ";
	}
	
	return result;
}

private static String translateWord (String word){
	
	String result = "";
	
	if(beginsWithVowel(word))
		result = word + "yay";
	else if (beginsWithBlend(word))
		result = word.substring(2) + word.substring(0,2) + "ay";
	else
		result = word.substring(1) + word.charAt(0) + "ay";
	return result;
}

private static boolean beginsWithVowel (String word){
	
	String vowels = "aeiou";
	
	char letter = word.charAt(0);
	
	return (vowels.indexOf(letter) != -1);
}

private static boolean beginsWithBlend (String word){
	
	return
		(word.startsWith("bl") || word.startsWith("sc") ||
		 word.startsWith("br") || word.startsWith("sh") ||
		 word.startsWith("ch") || word.startsWith("sk") ||
		 word.startsWith("cl") || word.startsWith("sl") ||
		 word.startsWith("cr") || word.startsWith("sn") ||
		 word.startsWith("dr") || word.startsWith("sm") ||
		 word.startsWith("dw") || word.startsWith("sp") ||
		 word.startsWith("fl") || word.startsWith("sq") ||
		 word.startsWith("fr") || word.startsWith("st") ||
		 word.startsWith("gl") || word.startsWith("sw") ||
		 word.startsWith("gr") || word.startsWith("th") ||
		 word.startsWith("kl") || word.startsWith("tr") ||
		 word.startsWith("ph") || word.startsWith("tw") ||
		 word.startsWith("pl") || word.startsWith("wh") ||
		 word.startsWith("pr") || word.startsWith("wr") );
}

public void actionPerformed(ActionEvent event){
	
	if (event.getSource() == b1){
		String text = englishText.getText();
		text = text.trim();
		text = text.toLowerCase();
		
		latinText.setText(translate(text));
	}
	
}

}

