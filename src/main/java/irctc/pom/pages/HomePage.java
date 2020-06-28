package irctc.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public RegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("HomePage.Register.Xpath"));
		return new RegistrationPage(driver,test);
	}
	
	public RegistrationPage switchToResgisterWindow() {
		switchToLastWindow();
		return new RegistrationPage(driver,test);
	}

	public HomePage mouseHoverOnStays() {
		mouseHoverByXPath(prop.getProperty("HomePage.Stays.Xpath"));
		return this;
	}
	
	public AccommodationPage clickOnLounge() {
		clickByXpath(prop.getProperty("HomePage.Lounge.Xpath"));
		return new AccommodationPage(driver,test);		
	}
	
}
