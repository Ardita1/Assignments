/**Author : Ardita Morina**/

import javax.swing.*;
public class Detyra_3
{
private long factorial1 =1 ;
private long i = 1 ;
public long factorial(int n)
{
while (i <= n)
{
factorial1  =factorial1 * i;
i++;
}
return factorial1 ; 
}


public static void main(String[]args)
{
 Detyra_3 a = new Detyra_3();
 int number = new Integer(JOptionPane.showInputDialog("Type an positive integer ")).intValue();
JOptionPane.showMessageDialog(null,"The factorial of number  " + number + " is  = " + a.factorial(number));
}
}
