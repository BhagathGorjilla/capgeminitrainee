package lab4;

public class Accperson extends Bankaccount{
	
	public String name;
	public float age;
	
public Accperson() {
};

public Accperson(long acc_num,double balance,String name,float age) {
	super(acc_num,balance);
	this.name=name;
	this.age=age;
}

	

}
