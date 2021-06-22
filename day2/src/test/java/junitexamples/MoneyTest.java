package junitexamples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MoneyTest {
	Money INR50;
	Money INR100;
	Money INR150;
	Money USD100;
	
	@Before
	public void setUp() throws Exception {
	INR50=new Money(50,"INR");
	INR100=new Money(100,"INR");
	INR150=new Money(150,"INR");
	USD100=new Money(100,"USD");
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test(expected=NotSameCurrencyException.class)
	public void testException() throws NotSameCurrencyException{
	USD100.add(INR150);	
		}
	
	@Test
	public void testAdd() throws NotSameCurrencyException {

	Money sum = INR50.add(INR100);
	assertTrue(sum.equals(INR150));
		

		
	}

}
