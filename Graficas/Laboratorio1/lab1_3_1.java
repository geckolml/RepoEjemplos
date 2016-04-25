package Laboratorio1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

/**
 * Created by geckolml on 4/24/16.
 */
public class lab1_3_1 extends JApplet {

        GeneralPath p;
        int h,w;
        int d = 40;
        public void init(){

            setSize(400,400);

        }
        public void paint(Graphics g){
            Graphics2D g2=(Graphics2D)g;
            super.paint(g2);
            h = getHeight();
            w=getWidth();

            p = new GeneralPath();

            p.moveTo(d,d);
            p.lineTo(w-d,h-d);
            p.lineTo(w-d,d);
            p.lineTo(d,h-d);
            p.closePath();
            g2.draw(p);

        }
    }
