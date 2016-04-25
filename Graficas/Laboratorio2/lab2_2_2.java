package Laboratorio2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by geckolml on 4/24/16.
 */
public class lab2_2_2 extends JApplet {

    public void init(){

        setSize(350,350);
    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawArc(140,60,80,80,180,180);
        g.drawArc(100,100 ,80,80 , -90,180);
        g.drawArc(140,140,80,80,0,180);
        //g.drawArc(100,100,80,80,0,180);
        //g.drawArc(100,100,80,80,0,180);
        g.drawArc(180,100,80,80,90,180);

    }
}
