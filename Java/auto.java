import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class auto extends JApplet{
	int d=100;
	int r = 30;
	public void paint(Graphics g){
		Graphics2D g2= (Graphics2D) g;
		
		g2.setColor(new Color ( 100,40,60));
		 	
		
		g2.fillArc(120,180 - d/2 ,d,d,0,180 );
		g2.fillRect(60,180,200,60);

		g2.fillOval(90,240-2 , r, r);
		g2.fillOval(200,240-2 , r, r);
	}
	
}
