package Laboratorio1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by geckolml on 4/24/16.
 */
public class lab1_2_2 extends JApplet {
    int x,y,d,dx,x1,y1,x2,y2;
    public void paint(Graphics g){
        super.paint(g);
        x = 40 ;
        y = 40 ;
        d = Math.min(getHeight(),getWidth() ) - 40 ;
        for (int i = 0; d >40 ; i++) {
            g.setColor(Color.red);
            dx = d / 4 ; // espacio entre figuras
            x += dx ;
            y += dx ;
            d -= 2*dx;
            g.drawRect(x,y,d,d);

            g.setColor(Color.blue);
            x1 = x ;
            y1 = y + d/2;

            x2 = x + d/2 ;
            y2 = y ;

            g.drawLine(x1,y1,x2,y2);
            g.drawLine(x2,y2,x+d,y+d/2);
            g.drawLine(x1,y1,x+d/2,y+d);
            g.drawLine(x+d/2, y+d , x+d,y + d/2);

        }

    }
}
