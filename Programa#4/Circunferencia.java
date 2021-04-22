import java.awt.*;
import java.math.MathContext;

import javax.swing.JApplet;
import javax.swing.JFrame;

public class Circunferencia extends JApplet {

  public void paint (Graphics g) {
  int r=100;
  int N=2*r;
  int x,y;

    for (int i=1; i<N; i++){
      for (int j=1; j<N; j++){
        x=i-r;
        y=j-r;
        if (x*x+y*y<=r*r){
          g.drawString (".",i+100,j+75);
        }
      }
      g.drawString (" ",100,75);
    }
  }

  public static void main (String[] args){
    JFrame frame = new JFrame ("CIRCUNFERENCIA");
    Circunferencia circunferenciaApplet = new Circunferencia();
    circunferenciaApplet.init();
    frame.getContentPane().add(circunferenciaApplet);
    frame.setSize(400,400);
    frame.setVisible(true);
  }
}