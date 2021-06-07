package Lab5;

public class Ex1 {
	static int Age;
	
	 
	public Ex1(int Age) {
		super();
		this.Age= Age;
	}
	
	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	

	public static void main(String[] args) {
		
		if(Age>15) {
			System.out.println("AGE is Valid");
		     }
		else 
			throw new InvalidAgeException();
		
		
	    Ex1 a=new Ex1(0);
		a.setAge(20);

	}

}
