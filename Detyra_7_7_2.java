
public class Detyra_7_7_2 
{
	public String removeDuplicateLetters(String s )
	{
		String answer = "" ;
		for ( int i = 0 ; i != s.length() ; i=i+1 )
		{
			if (notFound (answer , s.charAt(i)))
			{
				answer = answer +s.charAt(i);
					
			}
			
			
		}
		return answer ;
		
	}
	

	public boolean notFound(String a , char c )
	{ boolean notFound = true;
	for ( int j = 0; j != a.length(); j = j + 1 )
	
	{ notFound = notFound && (c != a.charAt(j)); }
	return notFound;
}
	
	
	public static void main (String []args)
	{
		Detyra_7_7_2 t  = new Detyra_7_7_2 ();
		System.out.println(t.removeDuplicateLetters("Butterflies"));
	}
}