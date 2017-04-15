
import javax.swing.JFrame;


public class BarChartViewer {
    public static void main(String[] args) {
        
      JFrame frame = new JFrame();
      frame.setSize(600, 600);
      frame.setTitle("BarCharViewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
      frame.add(new BarChartComponent());
      frame.setVisible(true);
    
    }
}
    
