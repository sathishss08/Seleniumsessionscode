package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Googletest  extends BaseTest{

	WebDriver driver;

	@BeforeTest

	public void Googlesetup() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
	}

	@Test (priority =1)
	public void logintest() {

		Assert.assertEquals(driver.getTitle(), "Google");

	}

	@Test (priority =2)
	public void GoogleURLtest() {

		Assert.assertTrue(driver.getCurrentUrl().contains("google"));

	}
	@Test (priority =3 , expectedExceptions = Exception.class)
	
	public void Googlesearchtest()
	{
	driver.findElement(By.name("q")).sendKeys("java");
	
	driver.findElement(By.name("q")).submit();
	
	Assert.assertTrue(driver.getTitle().contains("java"));
	
	}
	
	
	@AfterTest
	
	
	public void Closethebrowser()
	{
		
		driver.quit();
	}
		
		
		
		
		
		
		
		
		
	}

