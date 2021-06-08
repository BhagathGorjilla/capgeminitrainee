package Lab5;

public class Ex3 {

	private int sal;

	public Ex3(int sal) {
		super();
		this.sal = sal;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		if(sal>3000)
		{
		this.sal = sal;
		System.out.println("Salary is:"+sal);
	}
		else
		{
			throw new EmployeeException();
		}
	}
	public static void main(String[] args)
	{
		Ex3 e=new Ex3(0);
		e.setSal(5000);
	}
	

}