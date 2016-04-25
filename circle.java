import javax.swing.*;
import java.awt.*;

/**
 * Created by geckolml on 4/25/16.
 */
public class circle extends JApplet{
    void circleMidpoint(Graphics g,int xc,int yc,int r){
        int x=0;
        int y=r;
        int p = 1 - r ;
        circlePlotPoints(g,xc,yc,x,y);

        while(x < y){
            x++;
            if( p< 0 ){
                p += 2*x +1;
            }
            else{
                y--;
                p+= 2*(x-y) + 1 ;

            }

            circlePlotPoints(g,xc,yc,x,y);

        }


    }

    public void circlePlotPoints(Graphics g, int xc, int yc, int x,int y){
        g.drawLine(xc+x,yc+y,xc+x,yc+y);
        g.drawLine(xc-x,yc+y,xc-x,yc+y);
        g.drawLine(xc+x,yc-y,xc+x,yc-y);
        g.drawLine(xc-x,yc-y,xc-x,yc-y);
        g.drawLine(xc+y,yc+x,xc+y,yc+x);
        g.drawLine(xc-y,yc+x,xc-y,yc+x);
        g.drawLine(xc+y,yc-x,xc+y,yc-x);
        g.drawLine(xc-y,yc-x,xc-y,yc-x);

    }
    public void init(){
        setSize(400,400);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Garamond", Font.BOLD , 20));
        g.drawString("MidPoint Circle Drawing",90,40);
        g.setColor(Color.red);
        circleMidpoint(g,200,200,100);

    }

}
