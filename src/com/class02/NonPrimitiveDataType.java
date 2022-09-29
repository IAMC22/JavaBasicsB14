package com.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// string is just 1 example of non primitive data types
		
		String name="Asma"; // needs to be inside "" to be read as string data type
		String address="123 adress street";
		String phone= "703 475 8484"; // with int you can't use spaces
		int age=17;
		System.out.println();
		//syso + cntrl + space
		
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(phone);
		
		System.out.println(name); 
		// "My name is" + Asma
		System.out.println("my name is "+ name);
		
		// Asma is 17
		System.out.println(name + " is " + age);
		
		
		String fruit="apple";
		double price=1.99;
		
		//The price of the apple is 1.99
		
		System.out.println("The price of the "+fruit+" is "+price);
		
		/* to attach any value (int,double,boolean,char,String, etc..)
		 * to a String we use +
		 * + next to the String acts as a Concatenation 
		 */
		fruit="mango";
		price=5.99;
		
		System.out.println("The price of the "+fruit+" is "+price);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
