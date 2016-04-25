package Laboratorio1;

/**
 * Created by geckolml on 4/24/16.
 */
import java.awt.*;
import javax.swing.*;
import java.applet.*;

public class lab1_1_2 extends JApplet{

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
        g.setColor(Color.red);
        h=getHeight();
        w=getWidth();

        x0 = 10;
        y0 = 10;
        x1 = 90;
        y1 = h-10;
        for(int i= 0 ; x1 < w  ; i++){
            g.setColor(Color.blue);
            g.drawLine( x0 , y0, x1  , y1 );
            g.setColor(Color.red);
            g.drawLine(x0,y1,x1,y0);
            x0 += d;
            x1 += d;
            //g.drawOval(80 +x , 80 +y , d , d );// dibujar varios circulos
            //x = x + constante;
            //y = y + constante;

            //d = d - 2*constante ;

        }

    }
}

