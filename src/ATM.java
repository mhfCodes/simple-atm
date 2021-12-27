import java.util.Scanner;

public class ATM {

	String name;
	int cardNumber;
	private int balance = 0;
	private int previousTransaction;
	
	ATM(String name, int cardNumber) {
		this.name = name;
		this.cardNumber = cardNumber;
	}
	
	public void checkBalance() {
		System.out.println("Your Balance is " + this.balance);
	}
	
	public void deposit(int value) {
		this.balance += (value > 0) ? value : 0; // add only if entered value is more than 0 
		this.previousTransaction = value; // keep track of deposit transactions
	}
	
	public void withdraw(int value) {
		this.balance -= (value > 0) ? value : 0; // subtract only if entered value is more than 0 
		this.previousTransaction = -value; // keep track of withdraw transactions
	}
	
	public void getPreviousTransaction() {
		if (this.previousTransaction > 0) {
			System.out.println("You Have Deposited " + this.previousTransaction);
		} else if (this.previousTransaction < 0) {
			System.out.println("You Have Withdrawn  " + Math.abs(this.previousTransaction));
		} else {
			System.out.println("No Transaction Occured");
		}
	}
	
	public void showMenu() {
		char c = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello " + this.name + " With Card Number " + this.cardNumber);
		System.out.println("Check Balance ==> B");
		System.out.println("Deposit ==> D");
		System.out.println("Withdraw ==> W");
		System.out.println("Previous Transaction ==> T");
		System.out.println("Exit ==> E\n");
		
		do {
			System.out.println("**************************************");
			System.out.println("Please Choose Your Option: ");
			System.out.println("**************************************");
			c = scanner.next().charAt(0);
			c = Character.toUpperCase(c);
			System.out.println("");
			switch (c) {
				case 'B':
					System.out.println("----------------------------------");
					this.checkBalance();
					System.out.println("----------------------------------\n");
					break;
				case 'D':
					System.out.println("----------------------------------");
					System.out.println("Enter an Amount to Deposit: ");
					System.out.println("----------------------------------");
					int dValue = scanner.nextInt();
					this.deposit(dValue);
					System.out.println("");
					break;
				case 'W':
					System.out.println("----------------------------------");
					System.out.println("Enter an Amount to Withdraw: ");
					System.out.println("----------------------------------");
					int wValue = scanner.nextInt();
					this.withdraw(wValue);
					System.out.println("");
					break;
				case 'T':
					System.out.println("----------------------------------");
					this.getPreviousTransaction();
					System.out.println("----------------------------------\n");
					break;
				case 'E':
					System.out.println("----------------------------------");
					System.out.println("You Have Pressed Exit");
					System.out.println("----------------------------------\n");
					break;
				default:
					System.out.println("Invalid Option");
			}
		} while(c != 'E');
		
		System.out.println("GoodBye :)");
		scanner.close();
	}
	
	
	
}
