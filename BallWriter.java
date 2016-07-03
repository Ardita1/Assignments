import java.awt.*;

public class BallWriter 
{
   private MovingBall ball; 
   private MovingBall ball1;
   private Barrier barrier;
   private Box box;
   private Color ballsColor; 
   private Color ballsColor1;
   private int red;
   private int green;
   private int blue;
  
   public BallWriter(MovingBall x,MovingBall y,Barrier z)
   { 
      ball = x;
      ball1 = y;
      barrier = z;
      
       }


   public void paint(Graphics g)
   {
      red = (int)(Math.random()*256);
      green = (int)(Math.random()*256);
      blue = (int)(Math.random()*256);
      Color color1 = new Color(red,green,blue);
      Color color2 = new Color(green,red,blue);

      
      g.setColor(new Color(red,green,blue));
      int radius = ball.radiusOf();
      g.fillOval(ball.xPosition() - radius, ball.yPosition() - radius, radius * 2, radius * 2);

      
      g.setColor(new Color(blue,green,red));
      int radius1 = ball1.radiusOf();
      g.fillOval(ball1.xPosition() - radius1, ball1.yPosition() - radius1, (radius1) * 2, (radius1) * 2);

      
      g.setColor(Color.black);
      g.fillRect(barrier.xPosition2(),barrier.yPosition2(), barrier.width(), barrier.height());
   }
}