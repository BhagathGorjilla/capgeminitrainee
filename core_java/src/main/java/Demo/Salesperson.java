package Demo;

public class Salesperson extends Manager{
	double commisiion;
	
	
public Salesperson(String name, String dept, int Id, double b_salary,double allowance, double commisiion){
 super(name,dept,Id,b_salary,allowance);
 this.commisiion=commisiion;
 System.out.println("commisiion is :" +commisiion);
}

public void Showsalary() {
	System.out.println("for salesperson is :" +(b_salary+allowance+commisiion));
}
}