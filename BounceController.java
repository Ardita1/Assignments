
public class BounceController
{ 
   private MovingBall ball;
   private MovingBall ball1;

   private AnimationWriter writer;
   
   public BounceController(MovingBall b, MovingBall b1 , AnimationWriter w) 
   {  ball = b;
      ball1 = b1;
      writer = w; 
   }

    public void runAnimation() 
   {  int timeUnit = 1; 
      int paintingDelay = 20;
      while ( true ) 
      { 
         delay(paintingDelay);
         ball.move(timeUnit);
         ball1.move(timeUnit);
         System.out.println(ball.xPosition() + ", " + ball.yPosition());
         writer.repaint(); 
      }
   }

   private void delay(int howLong) 
   {
      try { Thread.sleep(howLong); } 
      catch (InterruptedException e) { } 
   }
}