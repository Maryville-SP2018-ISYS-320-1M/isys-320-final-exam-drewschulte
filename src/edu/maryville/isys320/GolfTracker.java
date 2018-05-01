package edu.maryville.isys320;

import java.util.Scanner;

public class GolfTracker {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		
		System.out.print("What is par for the course? ");
		int numbers = par; 
		
		
		double sum = 0;
		for( int numberIndex = 1; numberIndex <= numbers; numberIndex++ ) {
			System.out.print("Enter your next round score:  " + numberIndex + ": ");
			double nextInputValue = input.nextDouble();
			
			sum += nextInputValue;
		}
		
		System.out.println("On this course your total score is " + sum / numbers);
	}

}