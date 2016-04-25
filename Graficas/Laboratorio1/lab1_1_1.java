package Laboratorio1; /**
 * Created by geckolml on 4/24/16.
 */

import java.awt.*;
import javax.swing.*;
import java.applet.*;

public class lab1_1_1 extends JApplet{

    int n= 6;
    int l=80;
    int r;
    int constante= 20;
    int d = 15;
    int x0 = 0, y0 = 20 ;
    int x1 = 180,y1= 180;
    int h,w;
    public void paint(Graphics g){
        super.paint(g);
//		for(int i=0;  i < n  ; i ++)
        //g.drawArc(100 - l/2 ,100 - l /2 ,80,80,0,180);
        g.setColor(Color.red);
        h=getHeight();
        w=getWidth();
        //g.drawArc(140,60,80,80,180,180);
        //g.drawArc(100,100 ,80,80 , -90,180);
        //g.drawArc(140,140,80,80,0,180);
        //g.drawArc(100,100,80,80,0,180);
        //g.drawArc(100,100,80,80,0,180);
        //g.drawArc(180,100,80,80,90,180);

        //g.drawOval(180,180,80,80);
        x0 = 10;
        y0 = 10;
        x1 = 180;
        y1 = h-10;
        //System.out.println(h + "  "+ w);
        for(int i= 0 ; x1 < w  ; i++){
            g.drawLine( x0 , y0, x1  , y1 );
            x0 += d;
            x1 += d;
            //g.drawOval(80 +x , 80 +y , d , d );// dibujar varios circulos
            //x = x + constante;
            //y = y + constante;

            //d = d - 2*constante ;

        }



    }
}
