import java.awt.*; 
import javax.swing.*;
public class BounceTheBall 
{
     public static void main(String[] args)
   {
      int boxSize = 200;
      int ballsRadius = 6;
      int barrierWidth = 6;
      int barrierHeight = 200;
      
     
      Box box = new Box(boxSize);
      MovingBall ball = new MovingBall( 10 , 10 , ballsRadius, box);
      MovingBall ball1 = new MovingBall(boxSize - 20 ,20, ballsRadius, box);
      
      
      Barrier  barrier = new Barrier((boxSize/2) - (barrierWidth/2),(boxSize/2)-(barrierHeight/2),barrierWidth,barrierHeight);
      box.setBarrier(barrier);
      
      
            
      
      
      BallWriter ballWriter = new BallWriter(ball, ball1 , barrier );
      
      BoxWriter boxWriter = new BoxWriter(box);
      
      AnimationWriter writer = new AnimationWriter(boxWriter, ballWriter, boxSize);
    
         
      new BounceController(ball , ball1, writer).runAnimation();
      
   }
}
