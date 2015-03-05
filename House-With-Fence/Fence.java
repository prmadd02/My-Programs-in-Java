import java.awt.*;
import javax.swing.*;

public class Fence extends JPanel {

	private int x = 150;
	private int y = 120;
	private int width = 120;
	private int height = 80;
	private int p;
	private int q;
	
	public Fence(){
	
		p = 2;
		q = -225;
		
	setBackground(Color.lightGray);
	setPreferredSize(new Dimension(420, 320));
}

public void paintComponent(Graphics g){
	super.paintComponent(g);
	
	g.setColor(Color.black);
	g.drawRect(x, y, width, height);
	
	g.drawRect(198, 150, 24, 50);
	
	g.drawRect(165, 160, 18, 22);
	g.drawRect(235, 160, 18, 22);
	
	g.drawLine(210, 80, 120, 140);
	g.drawLine(210, 80, 300, 140);
	
	g.setColor(Color.darkGray);
	g.fillRect(40, 35, 30, 280);
	g.fillRect(350, 35, 30, 280);
	
	g.setColor(Color.white);
	for(int i = 0; i < 9; i++){
		g.fillRect(p, q, 415, 5);
		q += 30;
	}

}

}
