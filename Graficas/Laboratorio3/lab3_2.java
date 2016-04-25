package Laboratorio3;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

/**
 * Created by geckolml on 4/24/16.
 */
public class lab3_2 extends JApplet {
    GeneralPath p[];
    int h,w;
    int d = 40;
    int dx = 30;
    public void init(){

        setSize(530,400);

    }
    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D)g;
        super.paint(g2);
        h = getHeight();
        w=getWidth();
        d=40;
        p = new GeneralPath[8];
        for (int i = 0; i <8 ; i++) {
            p[i]=new GeneralPath();
        }
    for(int i =0; i< 8; i++) {
            p[i].moveTo(d, 40);
            p[i].lineTo(w - d , h - 40);
            p[i].lineTo(w - d, 40);
            p[i].lineTo(d, h - 40);
            d+=dx;
            p[i].closePath();
        if( i%3 == 0)
            g2.setPaint(Color.yellow);
        else if (i%3 == 1)
            g2.setPaint(Color.red);
        else
            g2.setPaint(Color.green);

            g2.fill(p[i]);
       // g2.setPaint(Color.black);
        //g2.draw(p[i]);
        }
    }
}
