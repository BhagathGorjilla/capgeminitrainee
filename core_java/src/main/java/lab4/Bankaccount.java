package lab4;

public class Bankaccount {
	
	private long acc_num;
	private double balance;

	
public Bankaccount() {
	super();
	
}


public Bankaccount(long acc_num,double balance) {
	super();
	this.acc_num=acc_num;
	this.balance=balance;
	
}

public void viewaccount() {
	System.out.println("Account Number is : "+acc_num);

}


public void viewbalance() {
	System.out.println("balance is : "+balance);

}
}