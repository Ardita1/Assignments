import javax.swing.JOptionPane;

public class Isprime 
{
public static void main (String[]args)
{
	int numri  = new Integer(JOptionPane.showInputDialog("Shkruani numrin ?")).intValue();
	boolean [] isPrime = new boolean [numri];
	isPrime[0]=false;
	
	for(int i = 1 ; i < numri ; i++)
	{
		isPrime[i]=true;
		
	}
	
	for(int j = 2 ; j<numri; j++ )
	{
		
		if (isPrime[j-1])
		{
			System.out.println(j);
		}

		for (int c = j*j ; c< numri ; c+=j)
		{
			isPrime[c-1]=false;
		}
	}
}
}
