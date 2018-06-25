public class Project_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 100: ");
		int number = input.nextInt();
				
		int[] randomList = new int[10]; 	
		for (int i = 0; i < 10; i++){			
			randomList[i] = (int)(Math.random()*100);
		}
	
		
	int index = recursiveBinarySearch(randomList, number); 
	
	if (index == -1) { 
		System.out.printf("%d is NOT in random numbers.", number); 
	} 
	else { 
		System.out.printf("%d is in random numbers.", number);
	}
	}
	
	public static int recursiveBinarySearch(int[] randomList, int number) { 
		return binarySearch(randomList, 0, randomList.length - 1, number); 
		} 
	
	private static int binarySearch(int[] array, int start, int end, int target) { 
		int middle = (start + end) / 2; 
		if (end < start) { return -1; } 
			if (target == array[middle]) { 
				return middle; } 
			else if (target < array[middle]) { 
				return binarySearch(array, start, middle - 1, target); 
			} else { return binarySearch(array, middle + 1, end, target); 
		}
	}
}
