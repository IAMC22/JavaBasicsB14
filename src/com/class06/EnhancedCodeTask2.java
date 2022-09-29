package com.class06;

import java.util.Scanner;

public class EnhancedCodeTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring” 
if user is born in June, July, August → 
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.
Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
 */
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your score for the quiz?");
		double quiz=input.nextDouble();
		System.out.println("Enter your score for the midterm?");
		double midterm=input.nextDouble();
		System.out.println("Enter your score for the final exam?");
		double fexam=input.nextDouble();
		double avg=(quiz+midterm+fexam)/3;
		String score=null;
		if(avg>=90)
		score="A";
		else if(avg>=70 &&  avg<90)
		    score="B";
		    else if(avg>=50 &&  avg<70)
		        score="C";
		    else if(avg<50)
		        score="F";
		    else
		score="invalid";

		System.out.println("!!!!!!!!!!!!OUTPUT!!!!!!!!!!!!!!!1");
		System.out.println("Your grade is:=" +score);	
		
		
	}

}
