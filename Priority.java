package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority {

	
	@Test (priority =1) 

	public void Searchtest()

	{

		System.out.println("searchtest");

		Assert.assertEquals("Google", "Google");

	}
	
	@Test (priority =3)

	public void Carttest()

	{

		System.out.println("Carttest");

		Assert.assertEquals("Iphone", "Iphone");

	}

	@Test (priority =7)

	public void orderTest()

	{

		System.out.println("Ordertest");

		Assert.assertEquals("1000", "1000");
	}


	}


