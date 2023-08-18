package testngsessions;






import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest1 extends BaseTest {

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

	}

	}

}
