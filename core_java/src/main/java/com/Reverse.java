package com;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Rev=0;
		int i;
		while(N>0) {
		i=N%10;
		Rev=i+(Rev*10);
		N=N/10;
		}
		System.out.println(Rev);
		
		

	}

}
