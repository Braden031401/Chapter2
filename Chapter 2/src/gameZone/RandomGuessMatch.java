package gameZone;

import java.util.Scanner;

public class RandomGuessMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random;
		int guess;		
		
		Scanner input = new Scanner(System.in);

		System.out.print("Guess a number between 1 and 100 >>>");
		guess = input.nextInt();

		random = 1 + (int)(Math.random() * 100);
		
		System.out.print("The number is "+ random );	

		if (random == guess) {
	
		System.out.print(" You guessed correctly!");
		} else { System.out.print(" You guessed incorrectly!");
	
		}
	}
}
	
