package com.bg.ui;

import java.util.Scanner;

import com.bg.DAO.CustomerDAO;

public class User {

	public static void main(String[] args) {
		String s="y";
		
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter Choice 1:View All 2: Add Customer ");
		int ch=sc.nextInt();
		
		CustomerDAO d=new CustomerDAO();
		
		while(s.equals("y")) {
			
			
			switch (ch){
			case 1:System.out.println(d.getAllCustomers());
			      
			case 2:System.out.println(d.addCustomer(null));
			
			}
		
			
			
			ch=sc.nextInt();
			
			
			
		}
	}

}