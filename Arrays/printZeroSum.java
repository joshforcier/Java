//Given array of integers, print all sub-arrays with 0 sum.

public class printZeroSum 
{	
	public static void printZeroSum(int[] x) 
	{		
		for (int i = 0; i < x.length; i++) 
		{			
			int sum = 0;			
			for (int j = i; j < x.length; j++) 
			{				
				sum += x[j];				
				if (sum == 0) 
				{ 
					System.out.println("[" + i + " " + j + "]");
				}
			}
		}
	}

	public static void main(String[] args) 
	{		
		int[] x = { 3, 4, 1, 5, 8, -5, -7, 1, -3};
		
		printZeroSum(x);
	}
}
