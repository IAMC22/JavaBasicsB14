package com.ReviewClass2;

public class IfElseReview2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 0;

        if (number > 0) {
            System.out.println("number is positive");
        }
        if (number < 0) {
            System.out.println("number is negative");

        }
        if (number == 0) {
            System.out.println("number is 0");

        }
//second option(better)

        if (number > 0) 
        {
            System.out.println("number is positive");
        } 
        else if (number < 0) 
        {
            System.out.println("number is negative");

        }
        else  {
            System.out.println("number is 0");
        }
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
