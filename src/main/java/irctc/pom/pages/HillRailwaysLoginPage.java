package irctc.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HillRailwaysLoginPage extends GenericWrappers{
	
	public HillRailwaysLoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public HillRailwaysLoginPage clickOnGuestUserLogin() {
		clickByXpath(prop.getProperty("HillRailwaysLoginPage.GuestUserLogin.Xpath"));
		return this;
	}	
	
	public HillRailwaysLoginPage enterEmailID(String Emailid) {
		enterByName(prop.getProperty("HillRailwaysLoginPage.EmailId.Name"), Emailid);
		return this;
	}
	
	public HillRailwaysLoginPage enterMobile(String Mobile) {
		enterByName(prop.getProperty("HillRailwaysLoginPage.Mobile.Name"), Mobile);
		return this;
	}
	
	public HillRailwaysPassangerPage clickOnLogIn() {
		clickByXpath(prop.getProperty("HillRailwaysLoginPage.LogIn.Xpath"));
		return new HillRailwaysPassangerPage(driver,test);
	}

}
