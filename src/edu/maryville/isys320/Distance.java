package edu.maryville.isys320;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		
		int x1, x2, y1, y2;
		
		
		Scanner input = new Scanner( System.in );
		
		System.out.print("Enter x1, y1 for first point ");
		
		System.out.print("Enter x2, y2 for first point ");
		
		distance=Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
			
		System.out.println("The distance is:  " distance);
	}

}