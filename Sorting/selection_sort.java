public class selection_sort 
{
	public static void swap(int[] x, int i, int j) 
	{
		int temp = x[i];
		x[i] = x[j];
		x[j] = temp;
	}
	
	public static void selection_sort(int[] x) 
	{
		for (int i = 0; i < x.length - 1; i++)
		{
			int minimum = i;
			for (int j = i + 1; j < x.length; j++)
			{
				if (x[j] < x[minimum]) 
				{
					minimum = j;
				}
			}
			swap(x, minimum, i);
		}
	}

	public static void main(String[] args) 
	{
		int x[] = {1, 3, 6, 3, 8, 9, 7, 4};
		selection_sort(x);
		System.out.println(Arrays.toString(x));
	}
}
