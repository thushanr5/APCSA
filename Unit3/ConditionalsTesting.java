import java.util.Scanner;

public class Variables {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String PASSWORD = "CSA19952022";
		Scanner input = new Scanner(System.in);
		System.out.println("\nPlease enter your password for this computer: ");
		String inputPassword = input.nextLine();
		
		//Incorrect Way
		/*
		if(inputPassword == password) {
			System.out.println("The password for the computer is indeed \" password");
		}else {
			System.out.println("The password of the computer is incorrect, please try again");
		}
		*/
		
		//Correct Way when checking two objects
		if(inputPassword.equals(PASSWORD)) {
			System.out.println("The password for the computer is indeed\t" + PASSWORD);
		}else {
			System.out.println("The password of the computer is incorrect, please try again");
		}
		
	}

}
