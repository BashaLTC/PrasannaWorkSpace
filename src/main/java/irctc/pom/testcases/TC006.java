package irctc.pom.testcases;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import irctc.pom.pages.CovidAlertPage;
import utils.ExcelUtility;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		//testCaseName = "TC006";
		testCaseDescription = "To Verify IRCTC Registration";
		author = "Prasanna";
		category = "";
		browserName = "chrome";
		app = "IRCTC";
	}
	
	@Test (dataProvider = "getExcelDataByKeys" , dataProviderClass = ExcelUtility.class)
	public void irctcRegistration(HashMap<String, Object> map) {
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.clickOnRegister()
		.enterUserName(map.get("User name").toString())
		.enterPassword(map.get("User Password").toString())
		.enterConfirmPassword(map.get("Confirm Password").toString())
		.clickOnSecQuestionField()
		.clickOnSecQuestionOption(map.get("Security question").toString())
		.enterSecurityAnswer(map.get("Security answer").toString())
		.clickOnPrefLanguageField()
		.clickOnPrefLanguageOption(map.get("Pref Language").toString())
		.enterFirstName(map.get("First Name").toString())
		.enterMiddleName(map.get("Middle Name").toString())
		.enterLastName(map.get("Last Name").toString())
		.clickOnGenderMale()
		.enterDateOfBirth(map.get("DOB").toString())
		.clickOnOccupationField()
		.clickOnOccupationOption(map.get("Occupation").toString())
		.clickOnMaritalStatusMarried()
		.selectCountry(map.get("Res country").toString())
		.enterEmail(map.get("e-mail id").toString())
		.enterMobile(map.get("Mobile no").toString())
		.selectNationality(map.get("Nationality").toString())
		.enterFlatDoorBlockNo(map.get("Address 1").toString())
		.enterStreetLane(map.get("Address 2").toString())
		.enterAreaLocality(map.get("Address 3").toString())
		.enterPincode(map.get("Pincode").toString())
		.clickOnStateField()
		.selectCityTown(map.get("City").toString())
		.selectPostoffice(map.get("Post office").toString())
		.enterPhone(map.get("Res phone").toString())
		.clickOnCopyResidenceToOfficeAddressNo()
		.enterOfficeFlatDoorBlockNo(map.get("off address 1").toString())
		.enterOfficeStreetLane(map.get("off address 2").toString())
		.enterOfficeAreaLocality(map.get("off address 3").toString())
		.enterOfficePincode(map.get("off pin code").toString())
		.clickOnOffcieStateField()
		.selectOfficeCityTown(map.get("off city").toString())
		.selectOfficePostoffice(map.get("off post off").toString())
		.enterOfficePhone(map.get("off phone").toString())
		;
	}
}
