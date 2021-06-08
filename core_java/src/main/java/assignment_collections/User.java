package assignment_collections;
import java.util.*;


public class User{

	public static void main(String[] args) {
		
		TreeSet<Account> set=new TreeSet<>();
		
		set.add(new Account(1,"Person 1",100));
		set.add(new Account(22,"Person 2",20000));
		set.add(new Account(333,"Person 3",30));
		
		System.out.println( "ID   NAME      BALANCE");
		System.out.println();
		
		for(Account i : set) {
			System.out.println(i.getId()+ "  "+ i.getName()+"  "+i.getBalance());
			System.out.println();
		}
		
		
		ArrayList <Account> acclist= new ArrayList<Account>();
		for(Account a : set) {
			acclist.add(a);
		}	
		
		 System.out.println("------SORTING USING ID COMPARATOR-------");
		 System.out.println();
			Collections.sort(acclist, new Idcomparator());
			 System.out.println(acclist);
			 System.out.println();
			 
			 
			 System.out.println("------SORTING USING BALANCE COMPARATOR-------");
			 System.out.println();
			 Collections.sort(acclist,new BalanceComparator());
			  System.out.println(acclist);
			  System.out.println();
		
	}

}
