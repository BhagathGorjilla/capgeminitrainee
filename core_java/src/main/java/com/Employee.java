package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private float salary;
	
	public Employee() {};
	public Employee(int id,String name,float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void setId(int id) {
		this.id= id;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "ID :"+id+"  Name :"+name+"  Salary :"+salary;
	}
		
	
public static void main(String[] Args) {
	List<Employee> list=new ArrayList<Employee>();
	list.add(new Employee(11,"Nanda",20000));
	list.add(new Employee(4,"Bhagath",10000));
	list.add(new Employee(2,"Shiva",15000));
	list.add(new Employee(3,"SaiKrishna",18000));
	System.out.println("*****INPUT LIST*****");
	System.out.println(list);
	System.out.println();
	
	System.out.println("Sorting based on ID using lambda");
	Collections.sort(list,((x,y)->{return x.getId()-y.getId();}));
	System.out.println(list);
	System.out.println();
	
	System.out.println("*****Sorting based on Name using lambda*****");
	Collections.sort(list,((x,y)->{return x.getName().compareTo(y.getName());}));
	System.out.println(list);
	System.out.println();
	
	System.out.println("*****Sorting based on Salary using lambda*****");
	Collections.sort(list,((x,y)->{return (int) (x.getSalary()-y.getSalary());}));
	System.out.println(list);
	System.out.println();
	
	//This method only uses ID comparator for sorting
	System.out.println("*****Sorting based on ID using new Comparator Class*****");
	Collections.sort(list,new Idcomparator());
	System.out.println(list);
	
}
}
