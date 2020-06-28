package flipkart.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FlipKartHomePage extends GenericWrappers {
	
	public FlipKartHomePage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public FlipKartLoginPage clickOnLogin() {
		clickByLink(prop.getProperty("FlipKartHomePage.Login.Link"));
		return new FlipKartLoginPage(driver,test);
	}
	
	public FlipKartHomePage enterSearch(String Search) {
		enterByXpath(prop.getProperty("FlipKartHomePage.Search.Xpath"), Search);
		return this;
	}
	
	public FlipKartHomePage clickOnSearchIcon() {
		clickByXpath(prop.getProperty("FlipKartHomePage.SearchIcon.Xpath"));
		return this;
	}

	public FlipKartHomePage clickOnFirstResult() {
		clickByXpath(prop.getProperty("FlipKartHomePage.FirstResult.Xpath"));
		return this;
	}
	
	public FlipKartResultPage switchToWindow() {
		switchToLastWindow();
		return new FlipKartResultPage(driver,test);
	}
	
	
	
}
