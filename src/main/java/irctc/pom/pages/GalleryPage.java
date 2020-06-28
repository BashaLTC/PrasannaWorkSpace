package irctc.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class GalleryPage extends GenericWrappers {
	
	public GalleryPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public GalleryPage switchToHillRailwayWindow() {
		switchToLastWindow();
		return this;		
	}
	
	public PackagePage clickOnBookNowHillRailway() {
		clickByXpath(prop.getProperty("GalleryPage.BookNowHillRailway.Xpath"));
		return new PackagePage(driver,test);
	}

}
