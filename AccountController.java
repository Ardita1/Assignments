
import javax.swing.*;
public class AccountController
{ private BankReader a;


   private BankAccount kontoja_pare;
   private BankWriter a1;


   private BankAccount kontoja_dyte ;
   private BankWriter a2;


   private BankAccount llogaria;
   private BankWriter t;



   public AccountController(BankReader r1, BankAccount s1 , BankWriter b1,
   BankAccount s2, BankWriter b2)
   { 
     a = r1;
     kontoja_pare = s1;
     a1 = b1;
    kontoja_dyte = s2;
     a2 = b2;
 
 llogaria= kontoja_pare;
      t=b1;
   }



   private void reseto_llogarin(BankAccount llogaria_re, BankWriter shenimet_e_reja)
   { t.transaksioni("Llogaria jo aktive ");
      llogaria = llogaria_re; 
      t = shenimet_e_reja;
     
      t.transaksioni("Llogaria aktive"); }
   public void procesi_i_transaksionit()
   { char komanda = a.LexoKomanden("Komanda(A,B ,D,T,N):");
      if ( komanda == 'N' )
      {}
      else { 
         if ( komanda == 'D' )
         { int  shuma = a.LexoShumen();
            llogaria.depozita(shuma);
            t.transaksioni("Deponimi ne euro = ",shuma );
         }
         else if ( komanda == 'T' ) 
         {int shuma = a.LexoShumen();
            boolean ok = llogaria.terheqja(shuma);
            if ( ok )
            { t.transaksioni("Terheqje ne euro =  " , shuma  ); }
            else { t.transaksioni (" Terheqje e pa lejuar ", shuma ); }
         }
         else if ( komanda == 'A' ) 
         { reseto_llogarin(kontoja_pare, a1); }
         else if ( komanda   == 'B' ) 
         { reseto_llogarin(kontoja_dyte, a2); }
         else { t.transaksioni("Komande e papranueshme "); }
         this.procesi_i_transaksionit(); 
      }
   }
}
