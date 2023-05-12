package com.qa.numberPrograms;

import java.util.*;
public class PalindromeTest {
public static void main(String[] args) {
	
System.out.println("Enter the no. to check for Palindrome: ");

	Scanner input = new Scanner(System.in);
	int n=0, temp=0,s=0,r=0;
	n=input.nextInt();
	temp=n;
	while(temp>0) {
	r=temp%10;
	s=(s*10)+r;
	temp=temp/10;
		
	}
	if(s==n) {
	System.out.println("The no. is Palindrome: "+n);
		
	}
	else {
	System.out.println("The no. is not Palindrome: "+n);	
		
	}
}	
	

}
