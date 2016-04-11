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
		
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_x64_2.37.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	
	@Test
	public void verifyGooglePageTitle() {
		driver.get("http://yahoo.com");
		driver.navigate().to(appURL);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
