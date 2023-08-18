package testngsessions;

import org.testng.annotations.Test;

public class Dependsonmethod {
	
	
	@Test
	
	public void logintest()

	{
	System.out.println("logintestmethod");	
	
	
	}
@Test (dependsOnMethods = "logintest")
	
	public void searchtest()
	{
	System.out.println("logintestmethod");	
	
	
	}
@Test (dependsOnMethods = "searchtest",priority =1)

public void opncarttest()
{
System.out.println("logintestmethod");	


}

}
