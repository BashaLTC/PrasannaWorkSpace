package formc.pom.testcases;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import formc.pom.pages.RegistrationMenuPage;
import utils.ExcelUtility;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		//testCaseName = "TC005";
		testCaseDescription = "To Verify FormC Registration";
		author = "Prasanna";
		category = "";
		browserName = "chrome";
		app="FormC";
	}
	
	@Test (dataProvider = "getExcelDataByKeys" , dataProviderClass = ExcelUtility.class)
	public void formC(HashMap<String, Object> map) {
		
		
		new RegistrationMenuPage(driver,test)
		.clickOnSignUpRegistration()
		.enterUserId(map.get("User ID").toString())
		.enterPassword(map.get("User Password").toString())
		.enterConfirmPassword(map.get("Confirm Password").toString())
		.selectSecurityQuestion(map.get("Security question").toString())
		.enterSecurityAnswer(map.get("Security answer").toString())
		.enterUserName(map.get("User name").toString())
		.selectGender(map.get("Gender").toString())
		.enterDOB(map.get("DOB").toString())
		.enterDesignation(map.get("Designation").toString())
		.enterEmail(map.get("e-mail id").toString())
		.enterMobile(map.get("Mobile no").toString())
		.enterPhone(map.get("Phone no").toString())
		.selectNationality(map.get("Nationality").toString())
		.enterName(map.get("Name").toString())
		.enterCapacity(map.get("Capacity").toString())
		.enterAddress(map.get("Address").toString())
		.selectState(map.get("State").toString())
		.selectCity(map.get("City").toString())
		.selectAccomodationType(map.get("Accodm Type").toString())
		.selectAccomodationGrade(map.get("Accodm Grade").toString())
		.enterEmailId(map.get("email").toString())
		.enterMobileNo(map.get("mobile").toString())
		.enterPhoneNo(map.get("phone").toString())
		.enterPassengerName1(map.get("name 1").toString())
		.enterPassengerAddress1(map.get("address 1").toString())
		.selectPassengerState1(map.get("state 1").toString())
		.selectPassengerCity1(map.get("city 1").toString())
		.enterPassengerMobile1(map.get("mobile 1").toString())
		.clickOnAddButton()
		.enterPassengerName2(map.get("name 2").toString())
		.enterPassengerAddress2(map.get("address 2").toString())
		.selectPassengerState2(map.get("state 2").toString())
		.selectPassengerCity2(map.get("city 2").toString())
		.enterPassengerMobile2(map.get("mobile 2").toString())
		.clickOnAddButton()
		.enterPassengerName3(map.get("name 3").toString())
		.enterPassengerAddress3(map.get("address 3").toString())
		.selectPassengerState3(map.get("state 3").toString())
		.selectPassengerCity3(map.get("city 3").toString())
		.enterPassengerMobile3(map.get("mobile 3").toString())
		.clickOnAddButton()
		;
	}
}
