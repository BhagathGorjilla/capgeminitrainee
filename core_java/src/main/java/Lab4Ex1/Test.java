package Lab4Ex1;
import Lab4Ex1.Person;

public class Test {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.Name="Kathy";
		p1.Age=21;
		Account smith=new Account(123,5000,p1);
		Account kathy=new Account(125,4000,new Person());
		
		smith.deposit(2000);
		kathy.withdraw(1000);
		System.out.print(p1.Name+p1.Age);
	}

}
