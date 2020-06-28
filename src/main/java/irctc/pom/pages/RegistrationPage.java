package irctc.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
	
	public RegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public RegistrationPage enterUserName(String Username) {
		enterById(prop.getProperty("RegistrationPage.UserName.ID"), Username);
		return this;
	}
	
	public RegistrationPage enterPassword(String Userpswd) {
		enterById(prop.getProperty("RegistrationPage.Password.ID"), Userpswd);
		return this;
	}
	
	public RegistrationPage enterConfirmPassword(String Confirmpswd) {
		enterById(prop.getProperty("RegistrationPage.ConfirmPassword.ID"), Confirmpswd);
		return this;
	}
	
	public RegistrationPage clickOnSecQuestionField() {
		clickByXpath(prop.getProperty("RegistrationPage.SecurityQuestionField.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnSecQuestionOption(String option)
	{
		String xpath=replaceXpath(prop.getProperty("RegistrationPage.SecurityQuestionOption.Xpath"),option);
		clickByXpath(xpath);
		return this;
	}
	
	public RegistrationPage enterSecurityAnswer(String Secans) {
		enterByXpath(prop.getProperty("RegistrationPage.SecurityAnswer.Xpath"), Secans);
		return this;
	}
	
	public RegistrationPage clickOnPrefLanguageField() {
		clickByXpath(prop.getProperty("RegistrationPage.PreferredLanguageField.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnPrefLanguageOption(String option) {
		String xpath=replaceXpath(prop.getProperty("RegistrationPage.PreferredLanguageOption.Xpath"),option);
		clickByXpath(xpath);
		return this;
	}
	
	public RegistrationPage enterFirstName(String Firstname) {
		enterById(prop.getProperty("RegistrationPage.FirstName.ID"), Firstname);
		return this;
	}
	
	public RegistrationPage enterMiddleName(String Middlename) {
		enterById(prop.getProperty("RegistrationPage.MiddleName.ID"), Middlename);
		return this;
	}
	
	public RegistrationPage enterLastName(String Lastname) {
		enterById(prop.getProperty("RegistrationPage.LastName.ID"), Lastname);
		return this;
	}
	
	public RegistrationPage clickOnGenderMale() {
		clickByXpath(prop.getProperty("RegistrationPage.GenderMale.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnGenderFemale() {
		clickByXpath(prop.getProperty("RegistrationPage.GenderFemale.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnGenderTransgender() {
		clickByXpath(prop.getProperty("RegistrationPage.GenderTransgender.Xpath"));
		return this;
	}
	
	public RegistrationPage enterDateOfBirth(String DOB) {
		enterByXpath(prop.getProperty("RegistrationPage.DOB.Xpath"), DOB);
		return this;
	}
	
	public RegistrationPage clickOnOccupationField() {
		clickByXpath(prop.getProperty("RegistrationPage.OccupationField.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnOccupationOption(String option) {
		String xpath=replaceXpath(prop.getProperty("RegistrationPage.OccupationOption.Xpath"),option);
		clickByXpath(xpath);
		return this;
	}
	
	public RegistrationPage clickOnMaritalStatusMarried() {
		clickByXpath(prop.getProperty("RegistrationPage.MaritalStatusMarried.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnMaritalStatusUnmarried() {
		clickByXpath(prop.getProperty("RegistrationPage.MaritalStatusUnmarried.Xpath"));
		return this;
	}
	
	public RegistrationPage selectCountry(String Rescountry) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.Country.Xpath"), Rescountry);
		return this;
	}
	
	public RegistrationPage enterEmail(String Email) {
		enterById(prop.getProperty("RegistrationPage.Email.ID"), Email);
		return this;
	}
	
	public RegistrationPage enterMobile(String Mobile) {
		enterById(prop.getProperty("RegistrationPage.Mobile.ID"), Mobile);
		return this;
	}
	
	public RegistrationPage selectNationality(String Nationality) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.Nationality.Xpath"), Nationality);
		return this;
	}
	
	public RegistrationPage enterFlatDoorBlockNo(String Resaddress) {
		enterById(prop.getProperty("RegistrationPage.Flat.ID"), Resaddress);
		return this;
	}
	
	public RegistrationPage enterStreetLane(String Resstreet) {
		enterById(prop.getProperty("RegistrationPage.Street.ID"), Resstreet);
		return this;
	}
	
	public RegistrationPage enterAreaLocality(String Resarea) {
		enterById(prop.getProperty("RegistrationPage.Area.ID"), Resarea);
		return this;
	}
	
	public RegistrationPage enterPincode(String Respincode) {
		enterByName(prop.getProperty("RegistrationPage.Pincode.Name"), Respincode);
		return this;
	}
	
	public RegistrationPage clickOnStateField() {
		clickById(prop.getProperty("RegistrationPage.State.ID"));
		return this;
	}
	
	public RegistrationPage selectCityTown(String Rescity) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.City.Xpath"), Rescity);
		return this;
	}
	
	public RegistrationPage selectPostoffice(String Respostoff) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.PostOffice.Xpath"), Respostoff);
		return this;
	}
	
	public RegistrationPage enterPhone(String Resphone) {
		enterById(prop.getProperty("RegistrationPage.Phone.ID"), Resphone);
		return this;
	}
	
	public RegistrationPage clickOnCopyResidenceToOfficeAddressYes() {
		clickByXpath(prop.getProperty("RegistrationPage.ResidenceAddressToOfficeAddressYes.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnCopyResidenceToOfficeAddressNo() {
		clickByXpath(prop.getProperty("RegistrationPage.ResidenceAddressToOfficeAddressNo.Xpath"));
		return this;
	}
	
	public RegistrationPage enterOfficeFlatDoorBlockNo(String Offaddress) {
		enterById(prop.getProperty("RegistrationPage.OfficeFlat.ID"), Offaddress);
		return this;
	}
	
	public RegistrationPage enterOfficeStreetLane(String Offstreet) {
		enterById(prop.getProperty("RegistrationPage.OfficeStreet.ID"), Offstreet);
		return this;
	}
	
	public RegistrationPage enterOfficeAreaLocality(String Offarea) {
		enterById(prop.getProperty("RegistrationPage.OfficeArea.ID"), Offarea);
		return this;
	}
	
	public RegistrationPage enterOfficePincode(String Offpincode) {
		enterById(prop.getProperty("RegistrationPage.officePincode.Name"), Offpincode);
		return this;
	}
	
	public RegistrationPage clickOnOffcieStateField() {
		clickById(prop.getProperty("RegistrationPage.OfficeState.ID"));
		return this;
	}
	
	public RegistrationPage selectOfficeCityTown(String Offcity) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.OfficeCity.Xpath"), Offcity);
		return this;
	}
	
	public RegistrationPage selectOfficePostoffice(String Offpostoff) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.OfficePostOffice.Xpath"), Offpostoff);
		return this;
	}
	
	public RegistrationPage enterOfficePhone(String offphone) {
		enterById(prop.getProperty("RegistrationPage.OfficePhone.ID"), offphone);
		return this;
	}
	
	public RegistrationPage clickOnTermsAndConditions() {
		clickByXpath(prop.getProperty("RegistrationPage.TermsAndConditions.Xpath"));
		return this;
	}
	

}
