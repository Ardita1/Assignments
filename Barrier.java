public class Barrier
{ 
   private int t;
   private int v;
   private int width; 
   private int height; 

   public Barrier(int x, int y, int w,int h)
   {
      t = x;
      v = y;
      
      width = w;
      height = h;
   }
   public int xPosition2() 
   { 
      return t; }
   
   public int yPosition2()
   { 
      return v; }
   public int width()
   { 
      return width; }
   public int height()
   { 
      return height; }
      
       
   
   public boolean inHorizontalContact(int xPosition, int ballWidth)
   {
      return (xPosition + ballWidth >= t && xPosition <= t + width); 
     }
      


}