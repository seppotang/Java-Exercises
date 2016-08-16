import java.util.*;

public class LoopPractice{
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		/* Declaring variables*/
		double principal; // Principal amount of investment
		double rate;      // Annual interest rate
		double interest;  // Interest earned in a year
		
		/*Doing computations*/
		System.out.println("Please input the principal amount:")
		int principal = keyboard.nextInt();
		
		System.out..println("Please input the interest rate:");
		int rate = keyboard.nextInt();
		
		interest = principal * rate; // Compute interest
		
		principal = principal + initerest;
		
		/*Outputting Results*/
		System.out.print("The interest earned is $");
		System.out.println(interest);
		System.out.print("The value of the investment after one year is $");
		System.out.println(principal);
	}
}
