import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class lab01_01_1 extends JApplet{
	int n=10;
	int d=10;
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		
		for(int i=1 ; i <= n ; i++ )
			g2d.drawLine(50 + i*d,30,150 + i*d,getHight());
		
		
	}

}


