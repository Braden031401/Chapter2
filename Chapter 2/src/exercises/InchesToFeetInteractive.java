package exercises;

import java.util.Scanner;

public class InchesToFeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int feet;
		int inches;
		int ExtraInches;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Specify number of inches >>>");
		inches = input.nextInt();
		
		feet = inches / 12;
		ExtraInches = inches % 12;
		
		
		
		
	
		
		System.out.print("There are "+ inches +" inches in "+ feet +" feet "+ ExtraInches +" inches.");
		
		
		

	}

}
