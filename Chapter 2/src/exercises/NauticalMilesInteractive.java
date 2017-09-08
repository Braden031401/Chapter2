package exercises;

import java.util.Scanner;

public class NauticalMilesInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Kilometers;
		double Miles;
		double Nautical;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please specify the number of Nautical Miles >>> ");
		Nautical = input.nextInt();
		
		Miles = Nautical * 1.150779;
		Kilometers = Nautical * 1.852;
		
		
		
		System.out.println(" there are "+ Kilometers +" Kilometers, and "+ Miles +" Miles in "+ Nautical +" Nautical Mile(s).");

	}

}
