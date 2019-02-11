package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Browser {

	static String driverPath = "E:/STUDY_STUFF/SQA/Workplace/skvskv/Driver/";

	public static WebDriver driver;

	public static WebDriver getBrowser(String browserType) {
		switch (browserType) {
		/*case "firefox":	
			return	driver = new FirefoxDriver();*/
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			return	driver = new ChromeDriver();
			/*case "IE":
			System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
			return	driver = new InternetExplorerDriver();*/
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			return driver = new ChromeDriver();
		}
	}
}
