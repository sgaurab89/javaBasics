package com.qa.numberPrograms;

import java.util.*;
public class EvenOddTest {

public static void main(String[] args) {
	
	System.out.println("Enter any no. to check: ");
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	
	if(n%2==0) {
		
	System.out.println("The given no. is even");
	}
	
	else {
		System.out.println("The given no. is odd");
	}
}	
	
	
}
