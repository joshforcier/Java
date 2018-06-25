public class Project_1 {

	public static void main(String[] args) {
		boolean[] lockers = new boolean[100]; //creates array of 100 lockers

        for (int student = 1; student <= 100; student++) { //
            shuffle(lockers, student);
        }
        display(lockers);
    	}
		
public static void shuffle(boolean[] lockersOpenState,  int start) {

        int nextLocker = start;
        for (int i = start - 1; i < lockersOpenState.length; i += nextLocker) {
                lockersOpenState[i] = !lockersOpenState[i]; // changes locker state
        }
}


public static void display(boolean[] lockers) {
		System.out.print("Lockers ");
        int lockerCount = 0;
        for (int i = 0; i < lockers.length; i++) {
        	
            if (lockers[i]) { // if locker open print locker number           	
                System.out.print(i+1 + ", ");                
                lockerCount++;              
                
            } 
        }
        System.out.print("are open.");   
	}
}
