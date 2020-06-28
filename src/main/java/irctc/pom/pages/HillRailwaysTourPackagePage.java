package irctc.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HillRailwaysTourPackagePage extends GenericWrappers {
	
	public HillRailwaysTourPackagePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	
	public HillRailwaysTourPackagePage selectStartingDate(String StartingDate) {
		selectVisibileTextByName(prop.getProperty("HillRailwaysTourPackagePage.StartingDate.Name"), StartingDate);
		return this;
	}
	
	public HillRailwaysTourPackagePage selectBoardingStation(String BoradingStation) {
		selectVisibileTextByName(prop.getProperty("HillRailwaysTourPackagePage.BoardingStation.Name"), BoradingStation);
		return this;
	}
	
	public HillRailwaysTourPackagePage clickOnContinue() {
		clickByXpath(prop.getProperty("HillRailwaysTourPackagePage.ContinueButton.Xpath"));
		return this;
	}	
	
	public HillRailwaysTourPackagePage selectRoom(String Room) {
		selectValueByXpath(prop.getProperty("HillRailwaysTourPackagePage.Room.Xpath"), Room);
		return this;
	}
	
	
	public HillRailwaysLoginPage clickOnBook() {
		clickByXpath(prop.getProperty("HillRailwaysTourPackagePage.Book.Xpath"));
		return new HillRailwaysLoginPage(driver,test);
	}	
	
}
