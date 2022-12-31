package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.BrowserFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);

		BrowserFactory.startWebApplication("", null);
	}

}
