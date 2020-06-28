package irctc.pom.testcases;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import irctc.pom.pages.CovidAlertPage;
import utils.ExcelUtility;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		//testCaseName = "TC008";
		testCaseDescription = "To Verify IRCTC Charter";
		author = "Prasanna";
		category = "";
		browserName = "chrome";
		app = "IRCTC";
	}
	
	@Test (dataProvider = "getExcelDataByKeys" , dataProviderClass = ExcelUtility.class)
	public void irctcCharter(HashMap<String, Object> map) {
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToLoungeWindow()
		.clickOnMenuBar()
		.clickOnCharter()
		.clickOnEnquiryForm()
		.enterNameOfApplicant(map.get("Applicant").toString())
		.enterNameOfOrganisation(map.get("Organization").toString())
		.enterAddress(map.get("Address").toString())
		.enterMobileNo(map.get("Mobile no").toString())
		.enterEmail(map.get("e-mail id").toString())
		.selectRequestFor(map.get("Request for").toString())
		.enterOriginatingStation(map.get("Origin Station").toString())
		.enterDestinationStation(map.get("Destination").toString())
		.clickOnDateOfDepartureField()
		.clickOnDateOfDepartureDate()
		.clickOnDateOfArrivalBackField()
		.clickOnDateOfArrivalBackDate()
		.enterDurationOfTour(map.get("Duration").toString())
		.enterNumberAndTypeOfCoach(map.get("Coach details").toString())
		.enterNumberOfPassengers(map.get("Number passenger").toString())
		.enterPurposeOfCharter(map.get("Purpose").toString())
		.enterAdditionalServices(map.get("Add services").toString())
		.clickOnSubmit()
		.compareMobileErrorText(map.get("Verify Text").toString())
		;
	}
}
