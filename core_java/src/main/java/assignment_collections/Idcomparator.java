package assignment_collections;
import java.util.Comparator;

import assignment_collections.Account;

public class Idcomparator implements Comparator<Account>{

	@Override
	public int compare(Account b1, Account b2) {
		// TODO Auto-generated method stub
		return b1.getId()-b2.getId();
	}

}
