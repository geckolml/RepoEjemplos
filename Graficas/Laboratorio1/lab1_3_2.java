package Laboratorio1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

/**
 * Created by geckolml on 4/24/16.
 */
public class lab1_3_2 extends JApplet {

    GeneralPath p;
    int h,w;
    int d = 40;
    int lx,ly;
    public void init(){

        setSize(400,400);

    }
    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D)g;
        super.paint(g);
        h = getHeight();
        w=getWidth();
        lx = w - 2*d;
        ly = h-2*d;
        p = new GeneralPath();

        p.moveTo(d,d+ly);
        p.lineTo(d + lx/2,d);
        p.lineTo(d+lx,d + ly);
        p.closePath();
        g2.draw(p);

        p.moveTo(d+lx/4,d + ly/2);
        p.lineTo( d + 3*lx/4 , d + ly/ 2);
        p.lineTo( d + lx/2,d+ly);
        p.closePath();
        g2.draw(p);
//        repaint();




    }
}
