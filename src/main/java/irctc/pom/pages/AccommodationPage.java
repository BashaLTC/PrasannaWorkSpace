package irctc.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers {
	
	public AccommodationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public AccommodationPage switchToLoungeWindow() {
		switchToLastWindow();
		return this;		
	}
	
	public IrctcHotelsPage clickOnIrctcHotels() {
		clickByXpath(prop.getProperty("AccommodationPage.IrctcHotels.Xpath"));
		return new IrctcHotelsPage(driver,test);
	}

	public AccommodationPage clickOnMenuBar() {
		clickByXpath(prop.getProperty("AccommodationPage.MenuBar.Xpath"));
		return this;
	}
	
	public GalleryPage clickOnHillRailways() {
		clickByXpath(prop.getProperty("AccommodationPage.HillRailways.Xpath"));
		return new GalleryPage(driver,test);
	}
	
	public FtrPage clickOnBookYourCoachTrain() {
		clickByXpath(prop.getProperty("AccommodationPage.BookYourCoachTrain.Xpath"));
		return new FtrPage(driver,test);
	}
	
	public CharterPage clickOnCharter() {
		clickByXpath(prop.getProperty("AccommodationPage.Charter.Xpath"));
		return new CharterPage(driver,test);
	}
}
