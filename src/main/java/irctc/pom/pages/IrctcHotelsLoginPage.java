package irctc.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelsLoginPage extends GenericWrappers {
	
	public IrctcHotelsLoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public IrctcHotelsLoginPage clickOnGuestUserLogin() {
		clickByXpath(prop.getProperty("IrctcHotelsLoginPage.GuestUserLogin.Xpath"));
		return this;
	}

	public IrctcHotelsLoginPage enterYourEmail(String Email) {
		enterByName(prop.getProperty("IrctcHotelsLoginPage.EmailId.Name"), Email);
		return this;
	}
	
	public IrctcHotelsLoginPage enterMobile(String Mobile) {
		enterByName(prop.getProperty("IrctcHotelsLoginPage.Mobile.Name"), Mobile);
		return this;
	}
	
	public IrctcHotelsPage clickOnSignIn() {
		clickByXpath(prop.getProperty("IrctcHotelsLoginPage.SignIn.Xpath"));
		return new IrctcHotelsPage(driver,test);
}
}
