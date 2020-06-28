package irctc.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrPage extends GenericWrappers {
	
	public FtrPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public FtrPage switchToFtrWindow() {
		switchToLastWindow();
		return this;		
	}
	
	public FtrUserRegistrationPage clickOnNewUserSignup() {
		clickByLink(prop.getProperty("FtrPage.NewUserSignup.Link"));
		return new FtrUserRegistrationPage(driver,test);
	}
}
