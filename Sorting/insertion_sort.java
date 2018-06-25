public class insertion_sort 
{	
	public static void insertion_sort(int[] x)
	{
		for (int i = 1; i < x.length; i++)
		{
			int v = x[i];
			int j = i;
			
			while (j > 0 && x[j - 1] > v)
			{
				x[j] = x[j - 1];
				j--;
			}
			x[j] = v;			
		}
	}
	
	public static void main(String[] args) 
	{
		int[] x = {3, 6, 4, 1, 2, 2, 7, -9};
		
		insertion_sort(x);
		
		System.out.println(Arrays.toString(x));
	}
}
