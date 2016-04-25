package Laboratorio2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by geckolml on 4/24/16.
 */
public class lab2_1_2 extends JApplet {
    int x0,y0,x,y;
    int dx=20;
    int dy=20;
    int d=20;
    int w=360,h=360;

    public void init(){
        setSize(400,400);

    }
    public void paint(Graphics g){
        super.paint(g);
        x0=d; y0=d;x=w-d;y=h-d;
        for (int i = 0; i <  16 ; i++) {
            if(i %2 == 0)
                g.setColor(Color.blue);
            else
                g.setColor(Color.red);
            g.drawLine(x0,y0,x,y);
            x0+=dx;
            x-= dx;
        }
        x0 =d; y0 = h-d; x=w-d;y=d;
        for (int i = 0; i < 16 ; i++) {

            if(i %2 == 0)
                g.setColor(Color.blue);
            else
                g.setColor(Color.red);
            g.drawLine(x0,y0,x,y);
            y0-=dy;
            y+=dy;

        }


    }
}
