package irctc.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PackagePage extends GenericWrappers {
	
	public PackagePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public PackagePage switchToHillRailwayPackageWindow() {
		switchToLastWindow();
		return this;		
	}
	
	public HillRailwaysTourPackagePage clickOnBookNowInPackage() {
		clickByXpath(prop.getProperty("PackagePage.BookNowPackage.Xpath"));
		return new HillRailwaysTourPackagePage(driver,test);
	}
}
