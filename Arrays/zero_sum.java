//check if subarray with 0 sum exists or not

public class zero_sum 
{
	public static Boolean zero_sum(int[] x) 
	{
		Set<Integer> set = new HashSet<>();
		set.add(0);
		int sum = 0;
		
		for (int i = 0; i < x.length; i++) 
		{
			sum += x[i];
			
			if (set.contains(sum)) 
			{
				return true;
			}			
			set.add(sum);
		}
		return false;
	}
	public static void main(String[] args) 
	{
		
		int[] x = {3, 4, -6, 1, 3, -2, -2, 7, 8};
		
		if (zero_sum(x)) 
		{
			System.out.println("Exists");
		} else {
			System.out.println("Does not exist");
		}		
	}
}
