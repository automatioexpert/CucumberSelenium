package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	@Test
	public void loginApp() {
		BrowserFactory.startWebApplication("chrome", "https://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
