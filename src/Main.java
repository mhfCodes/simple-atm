import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("***** Welcome To The Best ATM in The World *****\n");
		// Ask User's Name
		Scanner scanner = new Scanner(System.in);
		System.out.println("**************************************");
		System.out.println("Please Enter Your Name: ");
		System.out.println("**************************************");
		String name = scanner.next();
		System.out.println("");
		
		// Ask User's Card Number		
		System.out.println("**************************************");
		System.out.println("Please Enter You'r Card Number: ");
		System.out.println("**************************************");
		int cardNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("");
		
		ATM person = new ATM(name, cardNumber);
		person.showMenu();
		
		scanner.close();
	}

}
