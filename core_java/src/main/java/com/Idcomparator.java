package com;

import java.util.Comparator;

public class Idcomparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getId()-o2.getId();
	}

}

/*
 * @Override public int compare(List1 o1, List1 o2) {
 * 
 * return o1.getName().compareTo(02.getName()); }
 * 
 * @Override public int compare(List1 o1, List1 o2) {
 * 
 * return (int) (x.getSalary()-y.getSalary()); }
 */