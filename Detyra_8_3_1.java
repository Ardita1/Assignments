import javax.swing.JOptionPane;

public class Detyra_8_3_1
{ public static void main(String[] args)
	{
	int seed = new Integer(JOptionPane.showInputDialog("Cili eshte qelsi ?" )).intValue();
	int[] vargu  = new int[27];
	vargu [0]= seed ;
	char [] vargu1  = new char[27];
	vargu1 [0]=' ';
	vargu1 [1]= 'a';
	int s = 0 ;
	int save =-1;
	for (int i = 1 ; i<vargu.length ; i++ )
	{
		vargu[i]= (vargu [i-1]*2)+1;
		if (i==1)
		{
			
		}
		else {
			vargu1[i]=(char)(vargu1[i-1]+1);
		}
		
		System.out.println(vargu[i]+ " " + vargu1[i]);
	}
	
	int karakteret = new Integer(JOptionPane.showInputDialog("Sa karaktere  i ka fjalia ?")).intValue();
	for ( int j = 0  ; j < karakteret ; j++)
	{
		int numri  = new Integer(JOptionPane.showInputDialog("Shkruani numrin ?")).intValue();
		while(s < vargu.length )
		{
		if(numri == vargu[s])
		{
			save = s ;//3
		}
		s++;
		
	}
	
	
	
	if(save==-1)
	{
		System.out.println(" " + "Numri i dhene nuk paraqet asnje karakter");}
	
	else { System.out.print(vargu1[save]);} 
	
	s = 0;
	save =-1;
	}
	}
}
