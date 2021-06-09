package com.bg.model;

public class Customer {
  private int id;
  private String name;
  private String city;
  private String contact;
  
  
  public Customer() {
	  super();
  }
  
  
  public Customer(int id, String name, String city, String contact) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.contact = contact;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getContact() {
	return contact;
}


public void setContact(String contact) {
	this.contact = contact;
}


@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", contact=" + contact + "]";
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + ((contact == null) ? 0 : contact.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	if (city == null) {
		if (other.city != null)
			return false;
	} else if (!city.equals(other.city))
		return false;
	if (contact == null) {
		if (other.contact != null)
			return false;
	} else if (!contact.equals(other.contact))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
  
  
  
}
