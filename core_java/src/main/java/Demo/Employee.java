package Demo;


public class Employee {
	private String name;
	private int Id;
	public  double b_salary;
	private String dept;
	
	
public Employee() {
	super();
}

   public Employee(String name, String dept,int Id,Double b_salary) {
   super();
   this.name=name;
   this.Id=Id;
   this.dept=dept;
   this.b_salary=b_salary;
   }
 
   public void Salary() {
	  System.out.println("Employee salary is :"+b_salary);
   }
	
   public void NameId() {
	   System.out.println("Name is : "+name+"Employee ID : "+ Id);
   }
}
