import javax.swing.*;


public class BankAccount
{ private int balansi; 


public BankAccount(int shuma_fillestare  )
{ if ( shuma_fillestare >= 0 )
{ balansi = shuma_fillestare; }
else { balansi = 0; }
}



public boolean depozita(int shuma)
{ boolean rezultati = false;
if ( shuma >= 0 )
{ balansi = balansi + shuma ;
rezultati = true;
}
else {JOptionPane.showMessageDialog(null,"Gabim : depozita " +shuma );
}
return rezultati;
}




public boolean terheqja(int shuma)
{boolean rezultati = false;
if ( shuma < 0 )
{ JOptionPane.showMessageDialog(null,"Gabim : terheqja  " + shuma ); }
else if ( shuma > balansi )
{JOptionPane.showMessageDialog(null,"Gabim : terheqja tejkalon balansin ");
}
else { balansi = balansi  - shuma ;
rezultati  = true;
}
return rezultati;
}


public int kthe_balansin()
{ return balansi ;}
}