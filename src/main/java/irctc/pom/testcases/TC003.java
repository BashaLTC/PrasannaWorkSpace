package irctc.pom.testcases;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import irctc.pom.pages.CovidAlertPage;
import utils.ExcelUtility;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		//testCaseName = "TC003";
		testCaseDescription = "To Verify IRCTC Hotel Booking with GST Yes";
		author = "Prasanna";
		category = "";
		browserName = "chrome";
		app = "IRCTC";
	}
	
	@Test (dataProvider = "getExcelDataByKeys" , dataProviderClass = ExcelUtility.class)
	public void irctcHotelBookingGstYes(HashMap<String, Object> map) {
		
		String hotelname = "";
		String price = "";
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToLoungeWindow()
		.clickOnIrctcHotels()
		.switchToHotelsWindow()
		.clickOnLimitedHotelOk()
		.clickOnLogin()
		.clickOnGuestUserLogin()
		.enterYourEmail(map.get("E-mail").toString())
		.enterMobile(map.get("Mobile no.").toString())
		.clickOnSignIn()
		.enterHotelNameOrCityName(map.get("City").toString())
		.clickOnCity()
		.clickOnCheckInDateField()
		.clickOnCheckInDate()
		.clickOnCheckOutDateField()
		.clickOnCheckOutDate()
		.clickOnRoomsGuestsField()
		.selectHotelRooms(map.get("Hotel room").toString())
		.selectHotelAdults(map.get("Hotel adult").toString())
		.clickOnDone()
		.clickOnFindHotel()
		.clickOnBookFirstDisplayedHotel()
		.getHotelName()
		.getHotelPrice()
		.clickOnContinueToBook()
		.selectTitle(map.get("Title").toString())
		.enterFirstName(map.get("First Name").toString())
		.enterLastName(map.get("Last Name").toString())
		.selectGst(map.get("Gst").toString())
		.enterCompanyName(map.get("Company Name").toString())
		.enterCompanyAddress(map.get("Company Address").toString())
		.compareHotelName(hotelname)
		.compareAmount(price)
		.clickOnGo()
		.compareGstErrormessage(map.get("Verify Text").toString())
		;
	}
}

