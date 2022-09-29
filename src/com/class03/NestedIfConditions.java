package com.class03;

public class NestedIfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time=5;
		String day="Monday";
		
		 if(day.equals("Monday")) { //outer
			
			if(time>7) { //inner 
				
			System.out.println("Lets go to the office");
			}
		}
		if(time<6) { //inner
	   	System.out.println("Lets sleep more");
		}
		
		
		
		
		
		
		
		
		
	}

}
