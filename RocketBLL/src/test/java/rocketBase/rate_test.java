package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;
import exceptions.RateException;
public class rate_test {

	//TODO - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	//TODO - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	
	
	@Test
	public void getRateTest() throws RateException
	{
		assertTrue(RateBLL.getRate(100) == 1);
		
	}
	@Test
	public void getPaymentTest() {
		System.out.print(RateBLL.getPayment(4, 360, 300000, 0, false));
		assertEquals(RateBLL.getPayment(4, 360, 300000, 0, false),1432.245, 2);
		
	}

}
