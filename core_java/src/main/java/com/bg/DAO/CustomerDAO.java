package com.bg.DAO;

import java.util.List;
import com.bg.db.Datastore;
import com.bg.model.Customer;

public class CustomerDAO {
	
	private List<Customer> Customers;
	private Datastore Customerstore;

    public CustomerDAO() {
		super();	
		Customerstore = new Datastore();
	}
    
    
    public List<Customer> getAllCustomers(){
		return Customerstore.getCustomerList();
    }	
    
    public boolean addCustomer(Customer Customer) {
		return Customerstore.getCustomerList().add(Customer);
    	
    }
    
    public List<Customer> getCustomers() {
	return Customers;
    }

    public void setCustomers(List<Customer> customers) {
	Customers = customers;
    }
	
 /*   public List<Customer> ViewallCustomers() {
    	return Customers;
    }*/

	
}
