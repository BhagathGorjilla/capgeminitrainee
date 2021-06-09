package com.bg.db;

import java.util.ArrayList;
import com.bg.model.Customer;

public class Datastore {

	private ArrayList<Customer> CustomerList;

	public Datastore() {
		super();
		
		
		CustomerList =new ArrayList<Customer>();
		CustomerList.add(new Customer(111,"PERSON_1","Delhi","10000"));
		CustomerList.add(new Customer(222,"PERSON_2","Mumbai","20000"));
		CustomerList.add(new Customer(333,"PERSON_3","Chennai","30000"));
		CustomerList.add(new Customer(444,"PERSON_4","Hyderabad","40000"));
		CustomerList.add(new Customer(555,"PERSON_5","Goa","50000"));
		
	}

	public ArrayList<Customer> getCustomerList() {
		return CustomerList;
	}

	public void setCustomerList(ArrayList<Customer> customerList) {
		CustomerList = customerList;
	}

	

}
