//given limited range array of size n find the duplicate number

public class find_duplicate 
{	
	public static int find_duplicate(int[] x) 
	{		
		boolean y[] = new boolean[x.length + 1];
		
		for (int i = 0; i < x.length; i++) 
		{			
			if (y[x[i]]) 
			{				
				return x[i];
			}
			y[x[i]] = true;
		}
		//no duplicate found
		return -1;
	}
	
	public static void main(String[] args) 
	{

		int[] x = {1, 4, 6, 6, 7, 9};
		
		System.out.println(find_duplicate(x));
	}

}
