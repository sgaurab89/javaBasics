package com.qa.generalPrograms;

import java.util.Scanner;

public class ArrayDemo {
public static void main(String[] args) {
	
	int[] a=new int[5];
	System.out.println("Enter 5 nos. ");
	Scanner input = new Scanner(System.in);
	for(int i=0;i<5;i++) {
	a[i] = input.nextInt();
	
	
}
	input.close();
 for(int j=0;j<5;j++) {
	 System.out.print(a[j]+" ");
 }
	
}
}