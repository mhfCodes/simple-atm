import java.util.Scanner;

public class ATM {

	String name;
	int cardNumber;
	private int balance = 0;
	
	ATM(String name, int cardNumber) {
		this.name = name;
		this.cardNumber = cardNumber;
	}
	
	public void checkBalance() {
		System.out.println("Your Balance is " + this.balance);
	}
	
	public void showMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello " + this.name + " With Card Number " + this.cardNumber);
		System.out.println("Check Balance ==> B");
		System.out.println("Deposit ==> D");
		System.out.println("Withdraw ==> W");
		System.out.println("Previous Transaction ==> T");
		System.out.println("Exit ==> E\n");
		
		System.out.println("**************************************");
		System.out.println("Please Choose Your Option: ");
		System.out.println("**************************************");
		char c = scanner.next().charAt(0);
		c = Character.toUpperCase(c);
		System.out.println("");
		switch (c) {
			case 'B':
				System.out.println("----------------------------------");
				this.checkBalance();
				System.out.println("----------------------------------\n");
				break;
			default:
				System.out.println("Invalid Option");
		}
		
		System.out.println("GoodBye :)");
		scanner.close();
	}
	
	
	
}
