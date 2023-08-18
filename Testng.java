package testngsessions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {

	// global precondition
	// precondition
	// test steps + exp vs act ------->assertion --->p/f
	// post steps
	
	
	
	
//	BS----->connectwithDB
//	BT----->Creating the user
//	BC----->Launching the browser
//	BM----->log on to the app
//	Carttest
//	AM----->Logout
//	BM----->log on to the app
//	searchtest
//	AM----->Logout
//	BM----->log on to the app
//	Ordertest
//	AM----->Logout
//	AC----->Closebrowser
//	AT----->Removeuser
//	
//	PASSED: testngsessions.Testng.Carttest
//	PASSED: testngsessions.Testng.orderTest
//	PASSED: testngsessions.Testng.Searchtest
//	AS----->DisconnectDB
	
	

	@BeforeSuite

	public void ConnectwithDB() {

		System.out.println("BS----->connectwithDB");
	}

	@BeforeTest

	public void Createuser() {

		System.out.println("BT----->Creating the user");
	}

	@BeforeClass

	public void Launchbrowser() {

		System.out.println("BC----->Launching the browser");
	}

	@BeforeMethod

	public void logontoapp() {

		System.out.println("BM----->log on to the app");

	}

	@Test

	public void Searchtest()

	{

		System.out.println("searchtest");

		Assert.assertEquals("Google", "Google");

	}
	
	@Test

	public void Carttest()

	{

		System.out.println("Carttest");

		Assert.assertEquals("Iphone", "Iphone");

	}

	@Test

	public void orderTest()

	{

		System.out.println("Ordertest");

		Assert.assertEquals("1000", "1000");
	}

	
	
	

@AfterMethod
	
	public void logout()
	{
	
	System.out.println("AM----->Logout");
	}

@AfterClass
	
	public void closeBrowser()
	{
	
	System.out.println("AC----->Closebrowser");
	}

@AfterTest
	
	public void RemoveUser()
	{
	
	System.out.println("AT----->Removeuser");
	
	}
@AfterSuite
	
	public void DisconnectDB()
	{
	
	System.out.println("AS----->DisconnectDB");
	

}
}