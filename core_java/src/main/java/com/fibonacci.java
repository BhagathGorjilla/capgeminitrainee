package com;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int n1=0, n2=1, n3,i;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		for(i=2;i<n;i++) {
			n3=n1+n2;
			System.out.println(n3+ " ");
			n1=n2;
			n2=n3;
		}
		
		
		

	}

}
