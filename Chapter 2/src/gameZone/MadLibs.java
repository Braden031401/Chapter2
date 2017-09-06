package gameZone;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String color;
String wordEst;
String bodyPartPlural;
String anAnimal, aNoun, PluralNoun;

int a, b, c;



Scanner input = new Scanner(System.in);

System.out.print("Enter a color>>");
color = input.nextLine();
System.out.print("Enter a word ending with est>>");
wordEst = input.nextLine();
System.out.print("Enter Plural Body Parts>>");
bodyPartPlural = input.nextLine();
System.out.print("Enter a plural Animal>>");
anAnimal = input.nextLine();
System.out.print("Enter a Noun>>");
aNoun = input.nextLine();
System.out.print("Enter a Plural Noun>>");
PluralNoun = input.nextLine();
System.out.print("Enter a number>>");
a = input.nextInt();
System.out.print("Enter a smaller number>>");
b = input.nextInt();

c = a - b;




System.out.println("The "+ color + " Dragon is the "+ wordEst +" Dragon of all. ");
System.out.println("Whenever it gets hungry it hunts " + anAnimal + " for food.");
System.out.println(" If the "+ color +" Dragon is tired it will take a nap in it's "+ aNoun +". Every dragon lays about "
		+ c + " eggs a year. ");
System.out.println("Dragon babies are always hungry and are usually found feeding around "+ PluralNoun +", It is recommended to stay away from these spots.");
System.out.println(" Baby dragons are not as dangerous as adult dragons because they are born without "
+ bodyPartPlural + ". Because of this many people try and tame the young dragons.");
System.out.println(" But we have yet to see any evidence of a domestic dragon.");


	}

}
