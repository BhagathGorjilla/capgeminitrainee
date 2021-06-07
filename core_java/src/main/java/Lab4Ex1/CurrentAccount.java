package Lab4Ex1;

public class CurrentAccount extends Account {

  private double limit;
  
  
  public CurrentAccount(long accnum, double bal, Person accholder) {
	  super(accnum,bal,accholder);
	  limit=2500;
	  
  }
  
  public void withdraw(double withdraw) {
	  if(withdraw<limit) {
		  System.out.println("Withdraw Allowed");
	  }
	  else 
		  System.out.println("Withdraw Not Allowed");
  }
  
  
}
