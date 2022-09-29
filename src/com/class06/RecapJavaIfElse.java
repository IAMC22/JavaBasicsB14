package com.class06;

public class RecapJavaIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//shortcut to autocomplete: ctrl+space
		
		
		String phone="Motorolla";
		
		if (phone.equals("iPhone")) {
				System.out.println("I want to buy it for me");
				
	}else if (phone.equals("Samsung")) {
		System.out.println("I want to buy for my husband");
		
	}else if (phone.equals("Nokia")) {
		System.out.println("I want to buy ir for my grandma");
	}
	
	else{ // if no conditions are true then it will print out else block
		System.out.println("That is not a phone I was looking for");
	}
		
		
	}

}
