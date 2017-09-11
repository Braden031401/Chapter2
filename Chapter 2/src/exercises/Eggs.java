package exercises;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double PriceDozen;
		double PriceSingle;
		int Dozen;
		int Single;
		int Eggs;
		double FinalPrice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many eggs do you want? >>> ");
		Eggs = input.nextInt();
		
		Dozen = Eggs / 12 ;
		Single = Eggs % 12;
		
		PriceDozen = Dozen * 3.25;
		PriceSingle = Single * .45;
		
		FinalPrice = PriceDozen + PriceSingle;
		
		System.out.print("For "+ Dozen +" dozen and "+ Single +" eggs, you will need to pay "+ FinalPrice +" dollars.");
		
		
		
		
		
		
		
		
		
		

	}

}
