package com.class04;

import java.util.Scanner;

public class InputKeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner is a class that helps us take input from the keyboard
		 * it contains many different smaller modules called methods that can help
		 * us take Strings, booleans, basically all types of data from the keyboard
		 */
		
		
Scanner input= new Scanner(System.in);
 // a message will be displayed to the user on the console to enter his/her name
System.out.println("Please enter your name");
// Activates the java program to take the input from the keyboard and store
//it inside the name variable
String name=input.next();
//Prints whatever name user enters on the key board on the console
System.out.println("Hello "+name+" dont be confused");
	}

}