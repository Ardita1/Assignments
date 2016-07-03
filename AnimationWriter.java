import java.awt.*;
import javax.swing.*; 
 
public class AnimationWriter extends JPanel 
{
   private BoxWriter boxWriter; 
   private BallWriter ballWriter; 
   
   public AnimationWriter(BoxWriter b, BallWriter l, int size) 
   {
      boxWriter = b; 
      ballWriter = l;
      JFrame f = new JFrame();
      f.getContentPane().add(this);
      f.setTitle("Bounce"); 
      f.setSize(size, size);
      f.setVisible(true); }

   public void paintComponent(Graphics g) 
   {  boxWriter.paint(g);
      ballWriter.paint(g); 

      }
}