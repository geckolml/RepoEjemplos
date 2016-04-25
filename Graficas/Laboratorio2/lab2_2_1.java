package Laboratorio2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by geckolml on 4/24/16.
 */
public class lab2_2_1 extends JApplet {
    int n= 8;
    int l=80;
    int r;
    int constante= 10;
    int d = 180;
    int x = 0, y = 0 ;

    public void init(){

        setSize(400,400);
    }
    public void paint(Graphics g){
        super.paint(g);
        x=0;y=0;
        d=Math.min(getWidth(),getHeight())-80;

        constante = d/8 - 20;
        for(int i= 0 ; i < n ; i++){
            g.setColor(Color.red);
            g.drawOval( x +40 , y+40 , d , d );// dibujar varios circulos
            x = x + constante;
            y = y + constante;

            d = d - 2*constante ;
        }

    }
}
