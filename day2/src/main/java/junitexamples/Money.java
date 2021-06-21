package junitexamples;

public class Money {
	int value;
	String currency;
	
	public Money() {}
	
	public Money(int value,String currency) {
		super();
		this.value=value;
		this.currency=currency;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Money [value=" + value + ", currency=" + currency + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (value != other.value)
			return false;
		return true;
	}
	
	public Money add(Money m) throws NotSameCurrencyException {
		
		Money m1=new Money();
		if(!m.currency.equals(this.currency)){
			throw new NotSameCurrencyException("Not Same Currency");
		}
		else 
			m1.value=this.value+m.value;
			m1.currency=this.currency;
		return m1;
		
}
}