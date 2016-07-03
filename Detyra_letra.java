import javax.swing.JOptionPane;

public class Detyra_letra 
{
	public static void main (String[]args)
	{
		String shenja[] = new String[5];
		
		shenja [1]= "  me peme";
		shenja[2]=  "  me gjethe";
		shenja [3] ="  me katrorin";
		shenja [4] =" me zemer";
		int numri_i_lojtarve = new Integer(JOptionPane.showInputDialog("Sa lojtar jane duke luajtur ?" )) .intValue();
		for(int i = 0 ; i <numri_i_lojtarve ; i++)
		{
			System.out.println("Lojtari : " + (i+1));
			System.out.println("----------------");
			int j = 0 ;
			while(j<5)
			{
				int u = (int)(Math.random()*12+1);
				int b =(int)( Math.random()*4 +1);
				System.out.println(u + "   " + shenja[b]);
				j++;
			}
			System.out.println("---------------- ");
		}
		
	}

}

