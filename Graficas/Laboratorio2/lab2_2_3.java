package Laboratorio2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by geckolml on 4/24/16.
 */
public class lab2_2_3 extends JApplet {
    int x,y;
    int x0,y0;
    int d=40;
    int r;
    public void init(){
        setSize(400,400);
    }
    public void paint(Graphics g){
        super.paint(g);

        g.setColor(Color.red);
        r=Math.min(getHeight(),getWidth())-2*d;
        x0=d-r/2;y0=d;
        for (int i = 0; i < 4; i++) {

            g.drawArc(x0, y0, r, r, -90, 180);
            g.drawArc(x0+r,y0,r,r,90,180);
            g.drawArc(x0 +r/2,y0-r/2,r,r,180,180);
            g.drawArc(x0 +r/2,y0+r/2,r,r,0,180);

            x0+=2*d;
            y0+=d;
            r=r-2*d;
        }
    }
}
