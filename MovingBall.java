public class MovingBall 
{ 
   private int xPos;
   private int yPos;
   private int radius; 
   private int xVelocity = +5; 
   private int yVelocity = +2; 
   private Box container;
   

    public MovingBall(int xInitial, int yInitial, int r, Box box)
   {
      xPos = xInitial;
      yPos = yInitial;
      radius = r; 
      container = box;
       }
   public int xPosition() 
   { 
      return xPos; }
   
   public int yPosition()
   { 
      return yPos; }

   public int radiusOf() 
   { 
      return radius; }

   public void move(int timeUnits)
   {
      xPos = xPos + (xVelocity * timeUnits);
      if ( container.inHorizontalContact(xPos, 2*radius)) 
      { xVelocity = -xVelocity; } 
    
      yPos = yPos + (yVelocity * timeUnits);
      if ( container.inVerticalContact(yPos, 2*radius)) 
      { yVelocity = -yVelocity; }
      
  
        
      
       
  
  
   }
}