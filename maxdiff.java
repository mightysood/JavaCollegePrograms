import java.io.*;
/* constraints--
a[i]-a[j] such that i<j
using O(n) time and o(1) space complexity
*/
class maxdiff{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		int maxdiff = -1, max = arr[n-1];
		
		for(int i = n-2; i>=0; i--)
		{
			if(arr[i] > max)
				max = arr[i];
			else
			{
				int diff = max - arr[i];
				if(diff> maxdiff)
					maxdiff = diff;	
			}
		}
		System.out.println(maxdiff);
	}
}
