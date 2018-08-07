import java.io.*;

class repeatstring{
public static void main(String[] args)throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String s = br.readLine();
	
		char c = s.charAt(0);
		int count = 0,i=0;
		for(i=0; i<s.length(); i++)
		{
			if(c == s.charAt(i))
			{
				count++;
			}
			else
			{
				System.out.print(count);
				System.out.print(s.charAt(i-1));
				count = 1;
				c = s.charAt(i);
			}
		}
			System.out.print(count);
			System.out.print(s.charAt(i-1));
	}	


}