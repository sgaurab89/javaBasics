package com.qa.numberPrograms;

public class NumberSwap {

	public static void main(String[] args) {
	
		int a =10;
		int b=20;
System.out.println("First no. is: "+a);	
System.out.println("Second no. is: "+b);

a=a+b;//a=30
b=a-b;//b=10
a=a-b;//a=20
		
System.out.println("First no. after swap: "+a);
System.out.println("Second no. after swap: "+b);

	}
	
}
