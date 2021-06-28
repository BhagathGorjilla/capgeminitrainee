package jpaDemo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeOTO")
public class Employee implements Serializable {
	@Id
	@Column(name="ID")
	private int empid;
	@Column(name="empname")
	private String empname;
	@Column(name="Salary")
	private double empsalary;
	
	@OneToOne
	//@JoinColumn(name="Account")
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String empname, double empsalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + empid + ", Name=" + empname + ", Salary=" + empsalary + ", Account=" + account + "]";
	}
 
	public int getEmpId() {
		return empid;
	}

	public void setId(int id) {
		this.empid = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + empid;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(empsalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Employee other = (Employee) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (empid != other.empid)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		if (Double.doubleToLongBits(empsalary) != Double.doubleToLongBits(other.empsalary))
			return false;
		return true;
	}

	public String getempname() {
		return empname;
	}

	public void setempname(String empname) {
		this.empname = empname;
	}

	public double getempSalary() {
		return empsalary;
	}

	public void setempSalary(double salary) {
		this.empsalary = salary;
	}
	

}
