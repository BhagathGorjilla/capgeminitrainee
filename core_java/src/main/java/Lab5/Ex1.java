package Lab5;
import java.util.Scanner;

public class Ex1 {
	private int Age;
	
	 
	public Ex1(int Age) {
		super();
		this.Age= Age;
	}
	
	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		if(age>15) {
			this.Age=age;
			System.out.println("AGE : "+age);
			System.out.println("AGE is Valid");
	     }
		else 
			throw new InvalidAgeException();
	}

	

	public static void main(String[] args) {
		System.out.print("Enter Age  :  ");
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		Ex1 a=new Ex1(0);
		a.setAge(i);

	}

}
