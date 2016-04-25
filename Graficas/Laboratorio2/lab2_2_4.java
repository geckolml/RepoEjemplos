package Laboratorio2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by geckolml on 4/24/16.
 */
public class lab2_2_4 extends JApplet {
    int x,y;
    int h,w;
    int d=40;
    int m;
    public void paint(Graphics g){
        super.paint(g);
        m=Math.min(getHeight(),getWidth());
        h=m-2*d; w= m-2*d;
        g.setColor(Color.blue);
        g.drawOval(d,d,w,h);
        g.drawArc(d - w/2,d - h/2 , w,h,-90,90);
        g.drawArc(d+w/2,d-h/2,w,h,180,90);
        g.drawArc(d+w/2,d+h/2,w,h,90,90);
        g.drawArc(d-w/2,d+h/2,w,h,0,90);
    }
}
