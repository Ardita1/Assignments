/*Autor :Ardita Morina */


import javax.swing.JOptionPane;

public class Nota_e_provimit
{ 
   public void Rezultatet_e_provimit()
   {
   
      String s =JOptionPane.showInputDialog("Shkruani piket qe keni marre ne provim ?");
      int piket = new Integer(s).intValue();
      int piket1 = (int)( piket/10);
     
     
      switch(piket1)
      {
         case 10: 
            { JOptionPane.showMessageDialog(null, "Ju keni noten A " );
               break ;}
          
          
         case 9:
            {JOptionPane.showMessageDialog(null, "Ju keni noten A" );
               break ;}
         
          
          
         case 8:
            {JOptionPane.showMessageDialog(null,"Ju keni noten    B");
               break ;}
         
          
         case 7:
            { JOptionPane.showMessageDialog(null, "Ju keni noten C");
               break ;}
         
          
         case 6:
            { JOptionPane.showMessageDialog(null, "Ju keni noten D");
               break ;}
         
         case 5 : 
            {JOptionPane.showMessageDialog(null,"Ju keni noten E " );
               break; }
          
          
         default :
            { JOptionPane.showMessageDialog(null,"Keni rene nga provimi "); }
         
      	 
      }
   		
   }
  
   public static void main (String[]args)
   { 
     Nota_e_provimit a = new Nota_e_provimit();
      
      a.Rezultatet_e_provimit();
   
   	
   	
   }
}

