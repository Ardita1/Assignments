/**Author  : Ardita Morina **/
import javax.swing.*;
public class Detyra_2
{

   public int product(int INTEGER1, int INTEGER2)
   { int total = 1;
      if ( INTEGER1 <= INTEGER2 )
      { total = INTEGER1;
         int numeration =  INTEGER1;
         while ( numeration != INTEGER2)
         
         { numeration = numeration+ 1;
            total = total * numeration;
         }
      
      }
      return total;
   }
   public static void main (String[]args)
   {
   
      Detyra_2 a = new Detyra_2();
   
      int INTEGER1 = new Integer(JOptionPane.showInputDialog("Type first integer : " )).intValue();
      int INTEGER2 =new Integer(JOptionPane.showInputDialog("Type second integer : " )).intValue();
      JOptionPane.showMessageDialog(null,"The iterated product of " + INTEGER1 + " and " + INTEGER2 + " is = " + a.product(INTEGER1,INTEGER2));
   }
}
