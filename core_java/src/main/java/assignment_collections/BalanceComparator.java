package assignment_collections;
import java.util.Comparator;

import assignment_collections.Account;

public class BalanceComparator implements Comparator<Account> {

	@Override
	public int compare(Account a1, Account a2) {
		// TODO Auto-generated method stub
		return (int) (a1.getBalance()-a2.getBalance());
	}

}
