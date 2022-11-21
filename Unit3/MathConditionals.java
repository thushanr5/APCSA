import java.util.Scanner;
import java.math.*;
import java.math.*;
import java.math.*;

public class Decisions {
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		double squareRoot = Math.sqrt(2);
		double squareVal = squareRoot * squareRoot;
		if(squareVal == 2.0) {
			System.out.println("The value of the squareRoot of 2 * 2 is 2.0");
		}else {
			System.out.println("The value of the squareRoot of 2*2 is not 2.0");
		}
		//Outputs the else
		
		if(Math.sqrt(2) ==  2.0) {
			System.out.println("The value of the squareRoot of 2 * 2 is 2.0");
		}else {
			System.out.println("The value of the squareRoot of 2*2 is not 2.0");
		}
		//Outputs the else
		
		if(Math.sqrt(2) ==  Math.sqrt(2)) {
			System.out.println("The value of the squareRoot of 2 * 2 is 2.0");
		}else {
			System.out.println("The value of the squareRoot of 2*2 is not 2.0");
		}
		//Outputs the if statement
		
	}

}
