package com.learn.api;

public class testclass {
	
	int num1 = 20;
	int num2 = 35;
	
	public void addTwoNumbers() {
		System.out.println("Addition of two number:- " + num1 + num2);
	}
	
	public void reverseString(String str1) {
		for (int i = str1.length()-1 ; i >= 0; i--  ) {
			System.out.print(str1.charAt(i));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testclass testclass1 = new testclass();
		testclass1.addTwoNumbers();
		testclass1.reverseString("kumar");
	}

}
//  K U M A R
//  0 1 2 3 4

// FOR LOOP STARTING FROM MY STRING -1 LENGTH AND ENDING AT 0 , --
//INSIDE FOR LOOP SYSO (MYSTRING.charAT(Indiex))