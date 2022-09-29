package com.class06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter number");
		 int number=input.nextInt();
			
		
			if(number<=10) {
				System.out.println("Number is small");
			}else if(number>=11||number<=100) {
				System.out.println("Number is medium");
			}else if(number>=101||number<=1000)
				System.out.println("Number is large");
	}

}
