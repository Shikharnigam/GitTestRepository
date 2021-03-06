package mavenTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class mavenTest1 {
	
	private WebDriver driver; 
	String appURL = "http://google.com";

	@BeforeClass
	public void testSetUp() {
		
		System.setProperty("webdriver.ie.driver", "D:\\Selenium setup\\IEDriverServer_x64_2.53.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	
	@Test
	public void verifyGooglePageTitle() {
		driver.get("http://yahoo.com");
		System.out.println("YAHOO PAGE OPENED");
		driver.navigate().to(appURL);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
		System.out.println("GOOGLE PAGE OPENED");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
