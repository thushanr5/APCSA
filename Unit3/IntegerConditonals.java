import java.util.Scanner;

public class Variables {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int PK1STRENGTH = 17;
		final String PK1NAME = "Pikachu";
		int PK1HP = 100;
		
		final int PK2STRENGTH = 20;
		final String PK2NAME = "Charzard";
		int PK2HP = 100;
		
		System.out.println(PK1NAME);
		System.out.println(PK2NAME);
		
		System.out.println("\nWelcome to the game " + PK1NAME + ", " + PK2NAME);
	
		if(PK1STRENGTH > PK2STRENGTH)
			System.out.println(PK1NAME + " is stronger than " + PK2NAME);
		else
			System.out.println(PK2NAME + " is stronger than " + PK1NAME);
		
	}

}
