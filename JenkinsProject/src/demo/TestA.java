package demo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestA extends Browser {

	WebDriver driver;	
	
	@Test
	public void testGooglePageTitleInFirefox() {
		driver.navigate().to("http://www.google.com");
		String strPageTitle = driver.getTitle();
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
	}
	
	@BeforeClass
	public void setUp() {
		System.out.println("*******************");
		System.out.println("launching chrome browser");
		driver = Browser.getBrowser("chrome");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing firefox browser");
			driver.quit();
		}
	}
	
}
