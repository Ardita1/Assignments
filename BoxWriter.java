import java.awt.*;

public class BoxWriter 
{
   private Box box; 
   public BoxWriter(Box b)
   { box = b; }

   public void paint(Graphics g)
   {
      int size = box.sizeOf();
      g.setColor(Color.white);
      g.fillRect(0, 0, size, size);
      g.setColor(Color.black);
      g.drawRect(0, 0, size, size);
   }
}
