package Laboratorio3;

import javax.swing.*;
import java.awt.*;

/**
 * Created by geckolml on 4/24/16.
 */
public class lab3_1 extends JApplet {
    int x,y;
    int rx,ry;
    public void paint(Graphics g){
        x = 40;
        y = getHeight()/4;

        rx = 300;
        ry = 100;

        super.paint(g);
        g.setColor(Color.green);
        g.fillArc(x,y,rx,ry,0,90);
        g.fillArc(x,y,rx,ry,180,90);
        g.setColor(Color.red);
        g.fillArc(x,y,rx,ry,90,90);
        g.fillArc(x,y,rx,ry,270,90);

    }
}
