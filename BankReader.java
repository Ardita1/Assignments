import javax.swing.*;

public class BankReader
{ private String  hyrje_1;

 
   public BankReader()
   { hyrje_1 = ""; }



   public char LexoKomanden(String porosia)
   { 
        hyrje_1 = JOptionPane.showInputDialog(porosia).trim().toUpperCase();
      return hyrje_1.charAt(0); 
   }



   public int LexoShumen()
   {int pergjigje = 0;
 
      String s = hyrje_1.substring(1, hyrje_1.length());
      s = s.trim(); 
      if ( s.length() > 0 ) 
      {double euro_ne_cent = new Double(s).doubleValue();
         pergjigje = (int)(euro_ne_cent * 100); 
      }
      else {JOptionPane.showMessageDialog(null,"Gabim,transkasion pa vlere .");
      }
      return pergjigje ;
   }
}