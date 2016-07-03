public class Box 
{  private int boxSize;
   private Barrier barrier;
   public Box(int size)
    
   { boxSize = size;
    }
    public void setBarrier(Barrier which){
      barrier = which;
    }
   
   public boolean inHorizontalContact(int xPosition, int width)
   { 
      return barrier.inHorizontalContact(xPosition, width) || (xPosition <= 0 ) || (xPosition + width >= boxSize ); }

   public boolean inVerticalContact(int yPosition, int width ) 
   { 
      return(yPosition <= 0 ) || (yPosition + width >= boxSize ); }
    
   public int sizeOf() 
   { 
      return boxSize; }
}