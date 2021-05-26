package com;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		int mm=2;
		int Square;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value:");
		int n=sc.nextInt();
		
		
			
		switch(mm) {
		case 1 : Square=(n*n);
		         System.out.println("Sqaure of  "+n+"  is " +Square);
		break;
		case 2 : for(float i=0;i<n;i++) 
		          {
			        if((i*i)==n) 
			        	System.out.println("Sqaure root  of  "+n+"  is " +i);
			        
		          }
		break;
		default : System.out.println("invalid choice");

	}

	}}
