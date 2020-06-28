package irctc.pom.testcases;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import irctc.pom.pages.CovidAlertPage;
import utils.ExcelUtility;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		//testCaseName = "TC007";
		testCaseDescription = "To Verify IRCTC Book Your Coach Or Train";
		author = "Prasanna";
		category = "";
		browserName = "chrome";
		app = "IRCTC";
	}
	
	@Test (dataProvider = "getExcelDataByKeys" , dataProviderClass = ExcelUtility.class)
	public void irctcBookYourCoachTrain(HashMap<String, Object> map) {
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToLoungeWindow()
		.clickOnMenuBar()
		.clickOnBookYourCoachTrain()
		.switchToFtrWindow()
		.clickOnNewUserSignup()
		.enterUserID(map.get("User id").toString())
		.enterPassword(map.get("User Password").toString())
		.enterConfirmPassword(map.get("Confirm Password").toString())
		.selectSecurityQuestion(map.get("Security question").toString())
		.enterSecurityAnswer(map.get("Security answer").toString())
		.clickOnDateOfBirthField()
		.selectDobMonth(map.get("Month").toString())
		.selectDobYear(map.get("Year").toString())
		.clickOnDobDate()
		.clickOnGenderMale()
		.clickOnMaritalStatusMarried()
		.enterEmail(map.get("e-mail id").toString())
		.selectOccupation(map.get("Occupation").toString())
		.enterFirstName(map.get("First Name").toString())
		.enterMiddleName(map.get("Middle Name").toString())
		.enterLastName(map.get("Last Name").toString())
		.selectNationality(map.get("Nationality").toString())
		.enterFlatNo(map.get("Flat no").toString())
		.enterStreet(map.get("Street").toString())
		.enterArea(map.get("Area").toString())
		.selectCountry(map.get("Country").toString())
		.enterMobile(map.get("Mobile no").toString())
		.enterPincode(map.get("Pincode").toString())
		.sendTab()
		.selectPostoffice(map.get("Post office").toString())
		.clickOnCommunicationAddressSameAsResidentialAddressNo()
		.enterOfficeFlatNo(map.get("office Flat no").toString())
		.enterOfficeStreet(map.get("office Street").toString())
		.enterOfficeArea(map.get("office Area").toString())
		.selectOfficeCountry(map.get("office Country").toString())
		.enterOfficeMobile(map.get("office Mobile no").toString())
		.enterOfficePincode(map.get("office Pincode").toString())
		.sendTabOffice()
		.selectOfficePostoffice(map.get("office Post office").toString())
		;
	}
}
