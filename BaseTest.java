package testngsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	
	WebDriver driver ;
	
	@Parameters({"browser"})
	@BeforeTest
	public void setup(String browsername)
	
	{
		switch(browsername.toLowerCase())
		{
		
		case "Chrome":
			driver = new ChromeDriver();
			break;
	case "firefox":
		driver = new FirefoxDriver();
		break;

	case "edge":
		driver = new EdgeDriver();
		break;

	case "safari":
		driver = new SafariDriver();
		break;
	}
	}
}
