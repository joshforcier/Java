//Given an unsorted array of integers, find a pair with given sum in it.

public class find_pair 
{	
	public static void find_pair(int[] x, int sum) 
	{		
		for (int i = 0; i < x.length -1; i++) 
		{			
			for (int j = 0; j < x.length; j++) 
			{				
				if (x[i] + x[j] == sum) 
				{					
					System.out.println("Found pair at " + i + " and " + j);
					
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		
		int x[] = {8, 5 , 4, 2, 7, 9, 1};
		int sum = 10;
		
		find_pair(x, sum);		

	}
}
