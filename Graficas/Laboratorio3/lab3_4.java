package Laboratorio3;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

/**
 * Created by geckolml on 4/24/16.
 */
public class lab3_4 extends JApplet {
    GeneralPath p [];
    int w,h;
    int d=40;
    int x[]=new int[10];int y[]=new int[10];
    Polygon pol;
    int x0,y0;
    int k;
    public void init(){
        setSize(500,500);
        p=new GeneralPath[3];
        for (int i = 0; i <3 ; i++) {
            p[i] = new GeneralPath();
        }

    }
    public void paint(Graphics g){
        super.paint(g);

        h=getHeight() - 2*d;
        w=getWidth() - 2*d;
        x0=40; y0=40;
        for (int i = 0; i <3 ; i++) {
            if(i == 0)
                g.setColor(Color.green);
            else if (i==1)
                g.setColor(Color.red);
            else
                g.setColor(Color.yellow);

            //k = Math.min(getHeight(),getWidth());
            k = 20 - 5*i;
            if(i ==1){
                x0 = 85;
                y0 = 80;
            }
            if(i == 2){
                x0 = 130;
                y0 = 130;

            }
            x[0] = x0;   y[0] = y0 + 6*k;
            x[1] = x0 + 7*k;   y[1] = y0+6*k;
            x[2] = x0 + 9*k;   y[2] = y0;
            x[3] = x0 + 11*k;   y[3] = y0 + 6*k;
            x[4] = x0 + 18*k;   y[4] = y0+6*k;
            x[5] = x0 + 13*k;   y[5] = y0 + 10*k;
            x[6] = x0 + 17*k;   y[6] = y0 + 16*k;
            x[7] = x0 + 9*k;   y[7] = y0 + 12*k;
            x[8] = x0 + k;   y[8] = y0 + 16*k;
            x[9] = x0 + 5*k;   y[9] = y0 + 10*k;
            g.fillPolygon(x,y,x.length);

        }


    }
}
