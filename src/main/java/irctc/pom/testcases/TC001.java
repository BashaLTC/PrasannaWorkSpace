package irctc.pom.testcases;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import irctc.pom.pages.CovidAlertPage;
import utils.ExcelUtility;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		//testCaseName = "TC001";
		testCaseDescription = "To Verify IRCTC Hotel Booking with GST No";
		author = "Prasanna";
		category = "";
		browserName = "chrome";
		app = "IRCTC";
	}
	
	@Test (dataProvider = "getExcelDataByKeys" , dataProviderClass = ExcelUtility.class)
	public void irctcHotelBookingGstNo(HashMap<String, Object> map) {
	
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
		.compareHotelName(hotelname)
		.compareAmount(price)
		.clickOnGo()
		.clickOnIAgree()
		.clickOnMakePayment()
		.clickOnVerifyInOtp()
		.compareOtpErrormessage(map.get("Verify").toString())
		;
	}
}
