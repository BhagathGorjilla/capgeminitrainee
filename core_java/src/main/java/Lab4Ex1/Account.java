package Lab4Ex1;
import Lab4Ex1.Person;

public class Account {
	private long accnum;
	protected double balance;
	private Person accholder;
	
	public Account (long accnum, double bal, Person accholder) {
		this.accnum=accnum;
		this.balance=bal;
		this.accholder=accholder;
		System.out.println("Account Created for "+accholder.getName()+ " with Initial Balance  ="+balance);
	}
    public void deposit(double deposit) {
    	this.balance=this.balance+deposit;
    	System.out.println("Deposited Amount= "+deposit+"   &  Total Balance ="+balance );
    }
    public void withdraw(double withdraw) {
    	this.balance=this.balance-withdraw;
    System.out.println("Debited Amount= "+withdraw+"   &  Total Balance ="+balance );    }
    
    
    public double balance() {
    	return balance;
    }
}
