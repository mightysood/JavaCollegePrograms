import java.util.*;
class cmdline
{
	public static void main(String[] args)
		{
		int n = args.length, sum=0;		
		for(int i=0; i<n; i++)
		{
			sum +=Integer.parseInt(args[i]);
		}

		System.out.println(sum);
		}
}
