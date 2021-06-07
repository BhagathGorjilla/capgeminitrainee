package Demo;

public class Manager extends Employee {

	double allowance;


public Manager() {
	super();
			
}

public Manager(String name, String dept, int Id, double b_salary,double allowance ) {
	super(name,dept,Id,b_salary);
	this.allowance=allowance;
	System.out.println("Allowance : "+allowance);
}
	
public void TotalSalary() {
	System.out.println("For manager : "+(b_salary+allowance));
}
	

}