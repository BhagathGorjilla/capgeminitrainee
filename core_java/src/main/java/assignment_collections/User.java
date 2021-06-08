package assignment_collections;
import java.util.TreeSet;

public class User{

	public static void main(String[] args) {
		
		TreeSet<Account> a=new TreeSet<>();
		
		a.add(new Account(111,"Person 1",10000));
		a.add(new Account(222,"Person 2",20000));
		a.add(new Account(333,"Person 3",30000));
		
		System.out.println( "ID   NAME      BALANCE");
		
		for(Account i : a) {
			
			System.out.println();
			System.out.println(i.getId()+ "  "+ i.getName()+"  "+i.getBalance());
		}
	}

}
