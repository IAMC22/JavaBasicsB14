package com.class04;

import java.util.Scanner;

public class InputKeyBoard5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Did you solve Repl Assingments");
		boolean solvedAnyRepls=scanner.nextBoolean();
		
		if(solvedAnyRepls) {
			System.out.println("How many Repls you solved");
			int noOfReplsIsSolved=scanner.nextInt(); 
			
			int noOfReplsSolved = 0;
			if(noOfReplsSolved>17)
			{
				System.out.println("You're doing great");
			}
		else if(noOfReplsSolved>10) {
			System.out.println("You're doing ok, Please complete them as soon as possible");
			
		}else {
			
			System.out.println("You should solve more repls");
		}
		}
    else
    { 
 
			System.out.println("They're very important to learn Java please solve them all");
			
		}
		
		
		
		
		
		
	}

}
