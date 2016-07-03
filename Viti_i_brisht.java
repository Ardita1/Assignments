/**Autor : Ardita Morina 
*Ne kete detyre eshte kerkuar , qe te shkruajm nje aplikacion ne ate menyre qe per cilin do vite qe e jep shfrytezuesi
*ne menyre interaktive te llogaritet nese eshte ose ka qen vite i brisht ose jo .
**/

import javax.swing.JOptionPane;

public class Viti_i_brisht {

   public void LLogarit_vitin()
   {
      String s = JOptionPane.showInputDialog("Shkruani nje vite : " );
      int viti = new Integer(s).intValue();
   		
   
   			//Viti i brisht eshte qdo 4 vite ,kshtu qe kushti fillestar eshte qe ky vite te cilin
   			// e jep shfrytezuesi te plotepjestohet me 4 ose 400, mirpo perjashtim bejne vitet para ketij shekulli
   			//qe plotepjstohen me 100 nuk jane vite te brishta .
   			
      if ( viti%100!=0 &&viti%4==0)
      			
         JOptionPane.showMessageDialog(null ,"Viti " + viti + " eshte vite i brisht .");
      		
      	
      else if ( viti%400 ==0)
      	
         JOptionPane.showMessageDialog(null ,"Viti " + viti + " eshte vite i brisht .");
      	
      else {
         JOptionPane.showMessageDialog(null ,"Viti " + viti + " nuk  eshte vite i brisht .");
      }
   }

   public static void main(String[] args) {
   
      Viti_i_brisht a = new Viti_i_brisht();
      a.LLogarit_vitin();
   
   
   
   }
}
