
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class BarChartComponent extends JComponent {
Rectangle c1=new Rectangle(0,100,200,40) ;   
Rectangle c2=new Rectangle(0,200,300,40) ;
Rectangle c3=new Rectangle(0,300,400,40) ;
Rectangle c4=new Rectangle(0,400,500,40) ;

    
   public void paintComponent(Graphics g){
      Graphics2D g2 = (Graphics2D) g;
      g2.draw(c1);
      g2.draw(c2);
      g2.draw(c3);
      g2.draw(c4);
      g2.drawString("Golden Name ",50 ,125 );
      g2.drawString("Brooklyn ",50 ,225 );
      g2.drawString("Delaware Memorial ",50 ,325 );
      g2.drawString("Mackinace",50 ,425 );
}  
}
