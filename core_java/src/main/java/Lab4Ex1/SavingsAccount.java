package Lab4Ex1;

public class SavingsAccount extends Account {
	private double min_balance;

	public SavingsAccount(long accnum, double bal, Person accholder) {
		super(accnum, bal, accholder);
		min_balance=500;
	}
	@Override
	public void withdraw(double balance) {
		if((this.balance-balance)>=min_balance){
			this.balance=this.balance-balance;
		}
		else 
			System.out.println("Withdrwal Not Allowed");
	}    

}
