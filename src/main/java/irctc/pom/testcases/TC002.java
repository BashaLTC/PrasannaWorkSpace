package irctc.pom.testcases;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import irctc.pom.pages.CovidAlertPage;
import utils.ExcelUtility;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		//testCaseName = "TC002";
		testCaseDescription = "To Verify IRCTC Hotel Hill Railways Booking";
		author = "Prasanna";
		category = "";
		browserName = "chrome";
		app = "IRCTC";
	}
	
	@Test (dataProvider = "getExcelDataByKeys" , dataProviderClass = ExcelUtility.class)
	public void irctcBookHillRailways(HashMap<String, Object> map) {
		
			
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToLoungeWindow()
	/*	.clickOnMenuBar()
		.clickOnHillRailways()
		.switchToHillRailwayWindow()
		.clickOnBookNowHillRailway()
		.switchToHillRailwayPackageWindow()
		.clickOnBookNowInPackage()
		.selectStartingDate(map.get("Tour Starting Date").toString())
		.selectBoardingStation(map.get("Boarding Station").toString())
		.clickOnContinue()
		.selectRoom(map.get("Room").toString())
		.clickOnBook()
		.clickOnGuestUserLogin()
		.enterEmailID(map.get("Email ID").toString())
		.enterMobile(map.get("Mobile").toString())
		.clickOnLogIn()
		.enterFirstName1(map.get("First Name 1").toString())
		.enterLastName1(map.get("Last Name 1").toString())
		.enterAdultAge1(map.get("Age 1").toString())
		.enterGender1(map.get("Gender 1").toString())
		.enterFirstName2(map.get("First Name 2").toString())
		.enterLastName2(map.get("Last Name 2").toString())
		.enterAdultAge2(map.get("Age 2").toString())
		.enterGender2(map.get("Gender 2").toString())
		.enterFirstName3(map.get("First Name 3").toString())
		.enterLastName3(map.get("Last Name 3").toString())
		.enterChildAge3(map.get("Age 3").toString())
		.enterGender3(map.get("Gender 3").toString())
		.enterNominee(map.get("Nominee").toString())
		.enterRelation(map.get("Relation").toString())
		.enterContact(map.get("Contact").toString())
		.enterPhone(map.get("Phone").toString())
		.enterFax(map.get("Fax").toString())
		.enterAddress(map.get("Address").toString())
		.enterCity(map.get("City").toString())
		.selectState(map.get("State").toString())
		.selectIdCardType(map.get("Id Card Type").toString())
		.enterIdCardNumber(map.get("Id Card No").toString())
		.clickOnSubmit()
		.getTotalPrice()
		.clickOnIAgree()
		.clickOnMakePayment()
		.getTransactionId(map.get("Attribute").toString())
		.verifyTotalPrice(map.get("Attribute1").toString()) */
		;
	}

}
