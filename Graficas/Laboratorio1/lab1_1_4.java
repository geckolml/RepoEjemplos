package Laboratorio1;

/**
 * Created by geckolml on 4/24/16.
 */

import javax.swing.*;
import java.awt.*;

/**
 * Created by geckolml on 4/24/16.
 */
public class lab1_1_4 extends JApplet
    {
        int h,w;
        int iden=20;
        int x=iden,y,x0,y0;
        int dx=20,dy=20;
        public void paint(Graphics g){
            h=getHeight();
            w=getWidth();
            x=iden;
            y=h-iden;
            x0=iden;
            y0=iden;
            g.setColor(Color.red);
            for(int i=0 ; y >= iden ; i++  ){
                g.drawLine(x0,y0,x,y);
                if( x < w  - iden ){
                    x+=dx;
                }
                else{
                    y-=dy;
                }

            }
            x0 = w - iden;
            y0 = h - iden;
            x = w - iden;
            y = iden;

            g.setColor(Color.blue);
            for(int i=0 ; y <= h - iden ; i++  ){
                g.drawLine(x0,y0,x,y);
            if( x > iden ){
                    x-=dx;
                }
                else{
                    y+=dy;
                }

            }

        }

    }




