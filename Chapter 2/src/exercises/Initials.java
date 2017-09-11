package exercises;

import java.util.Scanner;

public class Initials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String initials;
		
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.print("Please enter your initials, seperate them with a period. >>> ");
		initials = inputDevice.nextLine();
		
		System.out.print("Your initials are "+ initials );
		

	}

}
