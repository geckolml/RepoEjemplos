package Laboratorio1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by geckolml on 4/24/16.
 */
public class lab1_2_1 extends JApplet {
        int x,y,d,dx;

        public void paint(Graphics g){
            super.paint(g);
            x = 40 ;
            y = 40 ;
            d = Math.min(getHeight(),getWidth() ) - 40 ;
            dx = 20;
            for (int i = 0; d >40 ; i++) {
                x += dx ;
                y += dx ;
                d -= 2*dx;
                g.drawRect(x,y,d,d);
            }

        }

    }
