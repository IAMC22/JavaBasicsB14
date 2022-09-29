package com.class04;

import java.util.Scanner;

public class InputKeyBoard4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Just using scanner to confuse Asma
 * 
 */
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		// takes a String type input from keyboard and stores it in a variable
		String name=scanner.nextLine();
		System.out.println("Please enter your age");
		// Takes int from the keyboard and stores it in age variable
		int age=scanner.nextInt();
		
		System.out.println("Hi "+name+" you're "+age+" years old");
		
		
		
		
		
		
	}

}
