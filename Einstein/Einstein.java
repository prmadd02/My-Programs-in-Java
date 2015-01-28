// I was given this code for a class project and had to demostrate how to move the objects in the applet.


import javax.swing.JApplet;
import java.awt.*;

public class Einstein extends JApplet
{
    public void paint(Graphics page)
    {
        page.drawRect(50, 50, 40, 40); // square
        page.drawRect(60, 80, 225, 30); // rectangle
        page.drawOval(265, 90, 20, 20); // circle
        page.drawLine(35, 60, 100, 120); // line

        page.drawString("Out of clutter, find simplicity.", 110, 70);
        page.drawString("Albert Einstein", 130, 100);
    }
}
