package edu.maryville.isys320;
/*
 * Class:    ISYS-320
 * Student:  Drew Schulte
 * Date:     30-APR-2018
 */
public class squaredDifference {

	public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
		
			System.out.print("Please Enter First number to find the square of the two numbers");
			double a = console.nextDouble(); 
			System.out.print("Please Enter First number to find the square of the two numbers");
			double b = console.nextDouble(); 
			double c = (a-b)*(a-b);
			
		}

		System.out.println("The squared difference would be " + c);
	}
