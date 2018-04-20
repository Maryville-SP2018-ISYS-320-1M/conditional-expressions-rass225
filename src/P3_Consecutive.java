/*
	ISYS 320
	Name(s):
	Date: 
*/

import java.util.Scanner;

public class P3_Consecutive {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("This program calculates if three input values are consecutive.");
		
		String doItAgainResponse = "";
		
		do {
			System.out.print("Enter value 1: ");
			int num1 = console.nextInt();
			System.out.print("Enter value 2: ");
			int num2 = console.nextInt();
			System.out.print("Enter value 3: ");
			int num3 = console.nextInt();
		
			System.out.printf( "a: %d, b: %d, c: %d -> ", num1, num2, num3);
			if((num2==num1-1) && (num3== num2-1)) {
				System.out.print("These are consecuative numbers!");
			} else if ((num2==num1+1) && (num3==num2+1)) {
				System.out.print("These are consecuative numbers!");
			} else if ((num2==num1+2) &&( num3==num1+1)) {
				System.out.print("These are consecuative numbers!");
			} else if ((num2==num1-1)&& (num3==num1+1)) {
				System.out.print("These are consecuative numbers!");
			} else if ((num2==num1-2) && (num3==num1-1)) {
				System.out.print("These are consecuative numbers!");
			} else if ((num2==num1+1) && (num3==num1-1)){
				System.out.print("These are consecuative numbers!");
			} else {
				System.out.print("These are not consecuative numbers!");
			}
			System.out.println();
			System.out.println("Would you like to do it again (enter 'n' to quit)? ");
			doItAgainResponse = console.next();
		} while( !doItAgainResponse.equalsIgnoreCase("n"));
		
		System.out.println("Thanks!");
	}
	


}
