package formc.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SignUpRegistrationPage extends GenericWrappers {
	
	public SignUpRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public SignUpRegistrationPage enterUserId(String UserId) {
		enterById(prop.getProperty("SignUpRegistrationPage.UserID.ID"), UserId);
		return this;
	}
	
	public SignUpRegistrationPage enterPassword(String Userpswd) {
		enterById(prop.getProperty("SignUpRegistrationPage.Password.ID"), Userpswd);
		return this;
	}
	
	public SignUpRegistrationPage enterConfirmPassword(String Confirmpswd) {
		enterById(prop.getProperty("SignUpRegistrationPage.ConfirmPassword.ID"), Confirmpswd);
		return this;
	}
	
	public SignUpRegistrationPage selectSecurityQuestion(String Secques) {
		selectValueById(prop.getProperty("SignUpRegistrationPage.SecurityQuestion.ID"), Secques);
		return this;
	}
	
	public SignUpRegistrationPage enterSecurityAnswer(String Secans) {
		enterById(prop.getProperty("SignUpRegistrationPage.SecurityAnswer.ID"), Secans);
		return this;
	}
	
	public SignUpRegistrationPage enterUserName(String Username) {
		enterById(prop.getProperty("SignUpRegistrationPage.UserName.ID"), Username);
		return this;
	}
	
	public SignUpRegistrationPage selectGender(String Gender) {
		selectValueById(prop.getProperty("SignUpRegistrationPage.Gender.ID"), Gender);
		return this;
	}
	
	public SignUpRegistrationPage enterDOB(String DOB) {
		enterById(prop.getProperty("SignUpRegistrationPage.DOB.ID"), DOB);
		return this;
	}
	
	public SignUpRegistrationPage enterDesignation(String Designation) {
		enterById(prop.getProperty("SignUpRegistrationPage.Designation.ID"), Designation);
		return this;
	}
	
	public SignUpRegistrationPage enterEmail(String Emailid) {
		enterById(prop.getProperty("SignUpRegistrationPage.UserEmailID.ID"), Emailid);
		return this;
	}
	
	public SignUpRegistrationPage enterMobile(String Mobile) {
		enterById(prop.getProperty("SignUpRegistrationPage.UserMobile.ID"), Mobile);
		return this;
	}
	
	public SignUpRegistrationPage enterPhone(String Phone) {
		enterById(prop.getProperty("SignUpRegistrationPage.UserPhone.ID"), Phone);
		return this;
	}
	
	public SignUpRegistrationPage selectNationality(String Nationality) {
		selectValueById(prop.getProperty("SignUpRegistrationPage.Nationality.ID"), Nationality);
		return this;
	}
	
	public SignUpRegistrationPage enterName(String Name) {
		enterById(prop.getProperty("SignUpRegistrationPage.Name.ID"), Name);
		return this;
	}
	
	public SignUpRegistrationPage enterCapacity(String Capacity) {
		enterById(prop.getProperty("SignUpRegistrationPage.Capacity.ID"), Capacity);
		return this;
	}
	
	public SignUpRegistrationPage enterAddress(String Address) {
		enterById(prop.getProperty("SignUpRegistrationPage.Address.ID"), Address);
		return this;
	}
	
	public SignUpRegistrationPage selectState(String State) {
		selectValueById(prop.getProperty("SignUpRegistrationPage.State.ID"), State);
		return this;
	}
	
	public SignUpRegistrationPage selectCity(String City) {
		selectValueById(prop.getProperty("SignUpRegistrationPage.City.ID"), City);
		return this;
	}
	
	public SignUpRegistrationPage selectAccomodationType(String Acctype) {
		selectValueById(prop.getProperty("SignUpRegistrationPage.AccomodationType.ID"), Acctype);
		return this;
	}
	
	public SignUpRegistrationPage selectAccomodationGrade(String Accrate) {
		selectValueById(prop.getProperty("SignUpRegistrationPage.AccomodationGrade.ID"), Accrate);
		return this;
	}
	
	public SignUpRegistrationPage enterEmailId(String Email1) {
		enterById(prop.getProperty("SignUpRegistrationPage.EmailID.ID"), Email1);
		return this;
	}
	
	public SignUpRegistrationPage enterMobileNo(String Mobcontact) {
		enterById(prop.getProperty("SignUpRegistrationPage.Mobile.ID"), Mobcontact);
		return this;
	}
	
	public SignUpRegistrationPage enterPhoneNo(String Phocontact) {
		enterById(prop.getProperty("SignUpRegistrationPage.Phone.ID"), Phocontact);
		return this;
	}
	
	public SignUpRegistrationPage enterPassengerName1(String Name1) {
		enterByXpath(prop.getProperty("SignUpRegistrationPage.PassengerName1.Xpath"), Name1);
		return this;
	}
	
	public SignUpRegistrationPage enterPassengerAddress1(String Address1) {
		enterByXpath(prop.getProperty("SignUpRegistrationPage.PassengerAddress1.Xpath"), Address1);
		return this;
	}
	
	public SignUpRegistrationPage selectPassengerState1(String State1) {
		selectValueById(prop.getProperty("SignUpRegistrationPage.PassengerState1.ID"), State1);
		return this;
	}
	
	public SignUpRegistrationPage selectPassengerCity1(String City1) {
		selectValueById(prop.getProperty("SignUpRegistrationPage.PassengerCity1.ID"), City1);
		return this;
	}
	
	public SignUpRegistrationPage enterPassengerMobile1(String Mobile1) {
		enterByXpath(prop.getProperty("SignUpRegistrationPage.PassengerMobile1.Xpath"), Mobile1);
		return this;
	}
	
	public SignUpRegistrationPage clickOnAddButton() {
		clickByXpath(prop.getProperty("SignUpRegistrationPage.AddButton.Xpath"));
		return this;
	}
	
	public SignUpRegistrationPage enterPassengerName2(String Name2) {
		enterByXpath(prop.getProperty("SignUpRegistrationPage.PassengerName2.Xpath"), Name2);
		return this;
	}
	
	public SignUpRegistrationPage enterPassengerAddress2(String Address2) {
		enterByXpath(prop.getProperty("SignUpRegistrationPage.PassengerAddress2.Xpath"), Address2);
		return this;
	}
	
	public SignUpRegistrationPage selectPassengerState2(String State2) {
		selectValueById(prop.getProperty("SignUpRegistrationPage.PassengerState2.ID"), State2);
		return this;
	}
	
	public SignUpRegistrationPage selectPassengerCity2(String City2) {
		selectValueById(prop.getProperty("SignUpRegistrationPage.PassengerCity2.ID"), City2);
		return this;
	}
	
	public SignUpRegistrationPage enterPassengerMobile2(String Mobile2) {
		enterByXpath(prop.getProperty("SignUpRegistrationPage.PassengerMobile2.Xpath"), Mobile2);
		return this;
	}
	
	public SignUpRegistrationPage enterPassengerName3(String Name3) {
		enterByXpath(prop.getProperty("SignUpRegistrationPage.PassengerName3.Xpath"), Name3);
		return this;
	}
	
	public SignUpRegistrationPage enterPassengerAddress3(String Address3) {
		enterByXpath(prop.getProperty("SignUpRegistrationPage.PassengerAddress3.Xpath"), Address3);
		return this;
	}
	
	public SignUpRegistrationPage selectPassengerState3(String State3) {
		selectValueById(prop.getProperty("SignUpRegistrationPage.PassengerState3.ID"), State3);
		return this;
	}
	
	public SignUpRegistrationPage selectPassengerCity3(String City3) {
		selectValueById(prop.getProperty("SignUpRegistrationPage.PassengerCity3.ID"), City3);
		return this;
	}
	
	public SignUpRegistrationPage enterPassengerMobile3(String Mobile3) {
		enterByXpath(prop.getProperty("SignUpRegistrationPage.PassengerMobile3.Xpath"), Mobile3);
		return this;
	}
	
}
