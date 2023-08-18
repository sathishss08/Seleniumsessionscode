package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Invocation {

	@Test(invocationCount = 10, priority = 1 )
	public void searchTest() {
		System.out.println("searchTest");
		Assert.assertEquals("Google", "Google");
	}

	
	
	@Test(priority = 2)
	public void cartTest() {
		System.out.println("cartTest");
		Assert.assertEquals("macbook", "macbook");
		
	}
	
	
	
//	expectedExceptions = ArithmeticException.class
		@Test (invocationCount = 10,priority= 0)
		public void opencart()
		{
		System.out.println("opencart");
		
		Assert.assertEquals(1000, 1000);
	}


	
}
