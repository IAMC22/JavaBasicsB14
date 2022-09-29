package com.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input=new Scanner(System.in);
		System.out.println("Enter height in inches");
		 int height=input.nextInt();
		
	if(height<=60) {
		System.out.println("Is short");
	} else if (height<60&&height<72){
		System.out.println("Is medium");
	} else if (height>72) {
		System.out.println("Is tall");
	}
		
		
		
		
		
		
	}

}
