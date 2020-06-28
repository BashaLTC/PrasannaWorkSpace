package formc.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationMenuPage extends GenericWrappers{
	
	public RegistrationMenuPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public SignUpRegistrationPage clickOnSignUpRegistration() {
		clickByLink(prop.getProperty("RegistrationMenuPage.SignUpRegistration.LinkText"));
		return new SignUpRegistrationPage(driver,test);
	}

}
