public class Question10_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Create array of 10 id numbers
		Question10_7[] accounts = new Question10_7[10];	
		for (int i = 0; i < accounts.length; i++){
			accounts[i] = new Question10_7();
		}		
		//Ask user to enter their id and then check to see if it is valid
		System.out.println("Enter an id: ");		
		int id = input.nextInt();
		while (id < 1 || id > 10){
			System.out.println("Enter a valid id");
			id = input.nextInt();
		}
		
		int balance = 100;
		int choice = 0;
		while (choice < 4){
			//Prints out menu and ask user what they would like to do
			System.out.println("");
			System.out.println("  ~Main menu~");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");	
			System.out.println("");
			System.out.println("Enter a choice: ");
			
			Scanner input1 = new Scanner(System.in);
			choice = input1.nextInt();
			
			//Use switch statements to show current balance, deposit or withdraw money, or exit.
			switch (choice){
				case 1: 
					System.out.println("The balance is $" + balance);
					break;
				case 2: 
					System.out.println("Enter amount to withdraw");
					int withdraw = input.nextInt();
					balance = balance - withdraw;
					break;
				case 3: 
					System.out.println("Enter amount to deposit");
					int deposit = input.nextInt();
					balance = balance + deposit;
					break;
				case 4: 
					System.out.println("Logging out");
					break;
			}
		}
	}		
}
