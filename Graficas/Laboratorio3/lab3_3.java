package Laboratorio3;

import javax.swing.*;
import java.awt.*;

/**
 * Created by geckolml on 4/24/16.
 */
public class lab3_3 extends JApplet {

    int n= 8;
    int l=80;
    int r;
    int constante= 10;
    int d = 180;
    int x = 0, y = 0 ;
    int x2,y2,d2,dx;
    public void init(){

        setSize(420,420);
    }
    public void paint(Graphics g){
        super.paint(g);
        x=0;y=0;
        d=420-80;
        y2=40;x2=40;dx=20;d2=Math.min(getHeight(),getWidth() ) - 40 ;
        constante = d/8 - 20;
        x2 = 40 ;
        y2 = 40 ;
        d2 = 420-80;
        dx = 20;
        for(int i= 0 ; i < n ; i++) {

                g.setColor(Color.blue);
            if(i!=0)
                g.fillRect(x2, y2, d2, d2);
                x2 += constante;
                y2 += constante;
                d2 -= 2 * constante;


            g.setColor(Color.red);
            g.fillOval(x + 40, y + 40, d, d);// dibujar varios circulos
            g.setColor(Color.black);
            g.drawOval(x + 40, y + 40, d, d);// dibujar varios circulos7


            x = x + constante;
            y = y + constante;

            d = d - 2 * constante;

        }





    }
}
