package com;

import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,count=0;
		for(i=2;i<n;i++) {
		 if(n%i==0)
			 count++;}
		if(count>0)
		  System.out.println("Not a prime number");
		 else
		 	System.out.println("prime number");
		}
			
	

	}


