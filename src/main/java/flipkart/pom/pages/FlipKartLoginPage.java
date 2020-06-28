package flipkart.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FlipKartLoginPage extends GenericWrappers {
	
	public FlipKartLoginPage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public FlipKartLoginPage enterEmailMobileNo(String Email) {
		enterByXpath(prop.getProperty("FlipKartLoginPage.EmailMobileNo.Xpath"), Email);
		return this;
	}
	
	public FlipKartLoginPage enterPassword(String Password) {
		enterByXpath(prop.getProperty("FlipKartLoginPage.Password.Xpath"), Password);
		return this;
	}
	
	public FlipKartHomePage clickOnLoginButton() {
		clickByXpath(prop.getProperty("FlipKartLoginPage.LoginButton.Xpath"));
		return new FlipKartHomePage(driver,test);
	}
}
