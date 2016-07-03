/**Author : Ardita Morina*/

import javax.swing.*;
public class Detyra_1
{
private int number ;

public Detyra_1()
{

}

public int summation (int x)
{
 int total = 0;
int numeration = 0; 

while ( numeration  != x )
{ numeration = numeration +1  ; 

total = total + numeration ;
}
return total;
}

public static void main (String[]args)
{
Detyra_1 a =new Detyra_1();
int x = new Integer(JOptionPane.showInputDialog("Type an integer : ")).intValue();
JOptionPane.showMessageDialog(null, "Summation of ("+ x + ")"+ "=" +a.summation(x));

}
}