package irctc.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers {
	
	public CharterPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public CharterPage clickOnEnquiryForm() {
		clickById(prop.getProperty("CharterPage.EnquriryForm.ID"));
		return this;
	}
	
	public CharterPage enterNameOfApplicant(String Applicant) {
		enterByXpath(prop.getProperty("CharterPage.Applicant.Xpath"), Applicant);
		return this;
	}
	
	public CharterPage enterNameOfOrganisation(String Organization) {
		enterByName(prop.getProperty("CharterPage.Organization.Name"), Organization);
		return this;
	}
	
	public CharterPage enterAddress(String Address) {
		enterByXpath(prop.getProperty("CharterPage.Address.Xpath"), Address);
		return this;
	}
	
	public CharterPage enterMobileNo(String Mobile) {
		enterByXpath(prop.getProperty("CharterPage.Mobile.Xpath"), Mobile);
		return this;
	}
	
	public CharterPage enterEmail(String Email) {
		enterByXpath(prop.getProperty("CharterPage.Email.Xpath"), Email);
		return this;
	}
	
	public CharterPage selectRequestFor(String Request) {
		selectVisibileTextByName(prop.getProperty("CharterPage.RequestFor.Name"), Request);
		return this;
	}
	
	public CharterPage enterOriginatingStation(String Origin) {
		enterByName(prop.getProperty("CharterPage.OriginatingStation.Name"), Origin);
		return this;
	}
	
	public CharterPage enterDestinationStation(String Destination) {
		enterByName(prop.getProperty("CharterPage.DestinationStation.Name"), Destination);
		return this;
	}
	
	public CharterPage clickOnDateOfDepartureField() {
		clickByName(prop.getProperty("CharterPage.DateOfDepartureField.Name"));
		return this;
	}
	
	public CharterPage clickOnDateOfDepartureDate() {
		clickByXpath(prop.getProperty("CharterPage.DateOfDepartureDate.Xpath"));
		return this;
	}
	
	public CharterPage clickOnDateOfArrivalBackField() {
		clickByName(prop.getProperty("CharterPage.DateOfArrivalField.Name"));
		return this;
	}
	
	public CharterPage clickOnDateOfArrivalBackDate() {
		clickByXpath(prop.getProperty("CharterPage.DateOfArrivalDate.Xpath"));
		return this;
	}
	
	public CharterPage enterDurationOfTour(String Duration) {
		enterByName(prop.getProperty("CharterPage.DurationOfTour.Name"), Duration);
		return this;
	}
	
	public CharterPage enterNumberAndTypeOfCoach(String Coach) {
		enterByName(prop.getProperty("CharterPage.NumberAndTypeOfCoach.Name"), Coach);
		return this;
	}
	
	public CharterPage enterNumberOfPassengers(String Passenger) {
		enterByName(prop.getProperty("CharterPage.NumberOfPassengers.Name"), Passenger);
		return this;
	}
	
	public CharterPage enterPurposeOfCharter(String Purpose) {
		enterByName(prop.getProperty("CharterPage.PurposeOfCharter.Name"), Purpose);
		return this;
	}
	
	public CharterPage enterAdditionalServices(String Addservices) {
		enterByXpath(prop.getProperty("CharterPage.AdditionalServices.Xpath"), Addservices);
		return this;
	}
	
	public CharterPage clickOnSubmit() {
		clickByXpath(prop.getProperty("CharterPage.SubmitButton.Xpath"));
		return this;
	}
	
	public CharterPage compareMobileErrorText(String Verifytext) {
		String text=Verifytext;
		verifyTextContainsByXpath(prop.getProperty("CharterPage.MobileError.Xpath"), text);
		return this;
	}
}
