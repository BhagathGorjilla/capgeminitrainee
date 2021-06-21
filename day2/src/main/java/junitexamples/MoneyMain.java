package junitexamples;

public class MoneyMain {

	public static void main(String[] args) throws NotSameCurrencyException {
		Money m1=new Money(10,"INR");
		Money m2=new Money(50,"INR");
		Money add=m1.add(m2);
		System.out.println(add);
	}

}
