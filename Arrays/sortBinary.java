//You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array.

public class sortBinary 
{	
	public static void sort(int x[]) 
	{		
		//count # of zeros
		int zero = 0;
		for (int i = 0; i < x.length; i++) 
		{
			if (x[i] == 0) 
			{
				zero++;
			}			
		}
		
		//place zeros at beginning
		int z = 0;
		while (zero-- != 0) 
		{
			x[z++] = 0;
		}
		
		//fill rest with ones
		while (z < x.length) 
		{ 
			x[z++] = 1;
		}
	}

	public static void main(String[] args) 
	{
		int x[] = {1, 1, 0 , 0, 0, 0, 0, 1};
		
		sort(x);
		
		System.out.println(Arrays.toString(x));
	}
}
