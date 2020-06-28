package irctc.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrUserRegistrationPage extends GenericWrappers {
	
	public FtrUserRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public FtrUserRegistrationPage enterUserID(String Userid) {
		enterById(prop.getProperty("FtrUserRegistrationPage.UserID.ID"), Userid);
		return this;
	}
	
	public FtrUserRegistrationPage enterPassword(String Password) {
		enterById(prop.getProperty("FtrUserRegistrationPage.Password.ID"), Password);
		return this;
	}
	
	public FtrUserRegistrationPage enterConfirmPassword(String Confirmpswd) {
		enterById(prop.getProperty("FtrUserRegistrationPage.ConfirmPassword.ID"), Confirmpswd);
		return this;
	}
	
	public FtrUserRegistrationPage selectSecurityQuestion(String Secquest) {
		selectValueById(prop.getProperty("FtrUserRegistrationPage.SecurityQuestion.ID"), Secquest);
		return this;
	}
	
	public FtrUserRegistrationPage enterSecurityAnswer(String Secans) {
		enterById(prop.getProperty("FtrUserRegistrationPage.SecurityAnswer.ID"), Secans);
		return this;
	}
	
	public FtrUserRegistrationPage clickOnDateOfBirthField() {
		clickById(prop.getProperty("FtrUserRegistrationPage.DOB.ID"));
		return this;
	}
	
	public FtrUserRegistrationPage selectDobMonth(String Month) {
		selectVisibileTextByXpath(prop.getProperty("FtrUserRegistrationPage.DOBMonth.Xpath"), Month);
		return this;
	}
	
	public FtrUserRegistrationPage selectDobYear(String Year) {
		selectVisibileTextByXpath(prop.getProperty("FtrUserRegistrationPage.DOBYear.Xpath"), Year);
		return this;
	}
	
	public FtrUserRegistrationPage clickOnDobDate() {
		clickByXpath(prop.getProperty("FtrUserRegistrationPage.DOBDate.Xpath"));
		return this;
	}
	
	public FtrUserRegistrationPage clickOnGenderMale() {
		clickByXpath(prop.getProperty("FtrUserRegistrationPage.GenderMale.Xpath"));
		return this;
	}
	
	public FtrUserRegistrationPage clickOnGenderFemale() {
		clickByXpath(prop.getProperty("FtrUserRegistrationPage.GenderFemale.Xpath"));
		return this;
	}
	
	public FtrUserRegistrationPage clickOnGenderTransgender() {
		clickByXpath(prop.getProperty("FtrUserRegistrationPage.GenderTransgender.Xpath"));
		return this;
	}
	
	public FtrUserRegistrationPage clickOnGenderInstitution() {
		clickByXpath(prop.getProperty("FtrUserRegistrationPage.Institution.Xpath"));
		return this;
	}
	
	public FtrUserRegistrationPage clickOnMaritalStatusMarried() {
		clickByXpath(prop.getProperty("FtrUserRegistrationPage.MaritalStatusMarried.Xpath"));
		return this;
	}
	
	public FtrUserRegistrationPage clickOnMaritalStatusUnmarried() {
		clickByXpath(prop.getProperty("FtrUserRegistrationPage.MaritalStatusUnmarried.Xpath"));
		return this;
	}
	
	public FtrUserRegistrationPage enterEmail(String Email) {
		enterById(prop.getProperty("FtrUserRegistrationPage.Email.ID"), Email);
		return this;
	}
	
	public FtrUserRegistrationPage selectOccupation(String Occupation) {
		selectVisibileTextById(prop.getProperty("FtrUserRegistrationPage.Occupation.ID"), Occupation);
		return this;
	}
	
	public FtrUserRegistrationPage enterFirstName(String Firstname) {
		enterById(prop.getProperty("FtrUserRegistrationPage.FirstName.ID"), Firstname);
		return this;
	}
	
	public FtrUserRegistrationPage enterMiddleName(String Middlename) {
		enterById(prop.getProperty("FtrUserRegistrationPage.MiddleName.ID"), Middlename);
		return this;
	}
	
	public FtrUserRegistrationPage enterLastName(String Lastname) {
		enterById(prop.getProperty("FtrUserRegistrationPage.LastName.ID"), Lastname);
		return this;
	}
	
	public FtrUserRegistrationPage selectNationality(String Nationality) {
		selectValueById(prop.getProperty("FtrUserRegistrationPage.Nationality.ID"), Nationality);
		return this;
	}
	
	public FtrUserRegistrationPage enterFlatNo(String Flatno) {
		enterById(prop.getProperty("FtrUserRegistrationPage.FlatNo.ID"), Flatno);
		return this;
	}
	
	public FtrUserRegistrationPage enterStreet(String Street) {
		enterById(prop.getProperty("FtrUserRegistrationPage.Street.ID"), Street);
		return this;
	}
	
	public FtrUserRegistrationPage enterArea(String Area) {
		enterById(prop.getProperty("FtrUserRegistrationPage.Area.ID"), Area);
		return this;
	}
	
	public FtrUserRegistrationPage selectCountry(String Country) {
		selectValueById(prop.getProperty("FtrUserRegistrationPage.Country.ID"), Country);
		return this;
	}
	
	public FtrUserRegistrationPage enterMobile(String Mobile) {
		enterById(prop.getProperty("FtrUserRegistrationPage.Mobile.ID"), Mobile);
		return this;
	}
	
	public FtrUserRegistrationPage enterPincode(String Pincode) {
		enterById(prop.getProperty("FtrUserRegistrationPage.PinCode.ID"), Pincode);
		return this;
	}
	
	public FtrUserRegistrationPage sendTab() {
		sendTabKeyById(prop.getProperty("FtrUserRegistrationPage.PinCode.ID"));
		return this;
	}
	
	public FtrUserRegistrationPage selectCity(String City) {
		selectValueById(prop.getProperty("FtrUserRegistrationPage.City.ID"), City);
		return this;
	}
	
	public FtrUserRegistrationPage selectPostoffice(String Postoffice) {
		selectValueById(prop.getProperty("FtrUserRegistrationPage.PostOffice.ID"), Postoffice);
		return this;
	}
	
	public FtrUserRegistrationPage clickOnCommunicationAddressSameAsResidentialAddressYes() {
		clickByXpath(prop.getProperty("FtrUserRegistrationPage.SameCommunicationAddressYes.Xpath"));
		return this;
	}
	
	public FtrUserRegistrationPage clickOnCommunicationAddressSameAsResidentialAddressNo() {
		clickByXpath(prop.getProperty("FtrUserRegistrationPage.SameCommunicationAddressNo.Xpath"));
		return this;
	}
	
	public FtrUserRegistrationPage enterOfficeFlatNo(String Flatnooff) {
		enterById(prop.getProperty("FtrUserRegistrationPage.OfficeFlatNo.ID"), Flatnooff);
		return this;
	}
	
	public FtrUserRegistrationPage enterOfficeStreet(String Streetoff) {
		enterById(prop.getProperty("FtrUserRegistrationPage.OfficeStreet.ID"), Streetoff);
		return this;
	}
	
	public FtrUserRegistrationPage enterOfficeArea(String Areaoff) {
		enterById(prop.getProperty("FtrUserRegistrationPage.OfficeArea.ID"), Areaoff);
		return this;
	}
	
	public FtrUserRegistrationPage selectOfficeCountry(String Countryoff) {
		selectValueById(prop.getProperty("FtrUserRegistrationPage.OfficeCountry.ID"), Countryoff);
		return this;
	}
	
	public FtrUserRegistrationPage enterOfficeMobile(String Mobileoff) {
		enterById(prop.getProperty("FtrUserRegistrationPage.OfficeMobile.ID"), Mobileoff);
		return this;
	}
	
	public FtrUserRegistrationPage enterOfficePincode(String Pincodeoff) {
		enterById(prop.getProperty("FtrUserRegistrationPage.OfficePinCode.ID"), Pincodeoff);
		return this;
	}
	
	public FtrUserRegistrationPage sendTabOffice() {
		sendTabKeyById(prop.getProperty("FtrUserRegistrationPage.OfficePinCode.ID"));
		return this;
	}
	
	public FtrUserRegistrationPage selectOfficeCity(String Cityoff) {
		selectValueById(prop.getProperty("FtrUserRegistrationPage.OfficeCity.ID"), Cityoff);
		return this;
	}
	
	public FtrUserRegistrationPage selectOfficePostoffice(String Postofficeoff) {
		selectValueById(prop.getProperty("FtrUserRegistrationPage.OfficePostOffice.ID"), Postofficeoff);
		return this;
	}
	
}
