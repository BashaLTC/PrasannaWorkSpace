package irctc.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelsPage extends GenericWrappers {
	
	String hotelname;
	String price;
	
	public IrctcHotelsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public IrctcHotelsPage switchToHotelsWindow() {
		switchToLastWindow();
		return this;		
	}
	
	public IrctcHotelsPage clickOnLimitedHotelOk() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.LimitedHotelOk.Xpath"));
		return this;
	}

	public IrctcHotelsLoginPage clickOnLogin() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.LogIn.Xpath"));
		return new IrctcHotelsLoginPage(driver,test);
	}

	public IrctcHotelsPage enterHotelNameOrCityName(String City) {
		enterByXpath(prop.getProperty("IrctcHotelsPage.HotelNameOrCityName.Xpath"), City);
		return this;
	}
	
	public IrctcHotelsPage clickOnCity() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.City.Xpath"));
		return this;
	}
	
	public IrctcHotelsPage clickOnCheckInDateField() {
		clickByName(prop.getProperty("IrctcHotelsPage.CheckInDateField.Name"));
		return this;
	}
	
	public IrctcHotelsPage clickOnCheckInDate() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.CheckInDate.Xpath"));
		return this;
	}
	
	public IrctcHotelsPage clickOnCheckOutDateField() {
		clickByName(prop.getProperty("IrctcHotelsPage.CheckOutDateField.Name"));
		return this;
	}
	
	public IrctcHotelsPage clickOnCheckOutDate() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.CheckOutDate.Xpath"));
		return this;
	}
	
	public IrctcHotelsPage clickOnRoomsGuestsField() {
		clickById(prop.getProperty("IrctcHotelsPage.RoomsGuestsField.ID"));
		return this;
	}
	
	public IrctcHotelsPage selectHotelRooms(String HotelRoom) {
		selectVisibileTextByName(prop.getProperty("IrctcHotelsPage.HotelRooms.Name"), HotelRoom);
		return this;
	}
	
	public IrctcHotelsPage selectHotelAdults(String HotelAdult) {
		selectVisibileTextByName(prop.getProperty("IrctcHotelsPage.HotelAdult.Name"), HotelAdult);
		return this;
	}
	
	public IrctcHotelsPage selectHotelchildren(String HotelChild) {
		selectVisibileTextByName(prop.getProperty("IrctcHotelsPage.HotelChild.Name"), HotelChild);
		return this;
	}
	
	public IrctcHotelsPage clickOnDone() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.DoneButton.Xpath"));
		return this;
	}
	
	public IrctcHotelsPage clickOnFindHotel() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.FindHotelButton.Xpath"));
		return this;
	}
	
	public IrctcHotelsPage clickOnBookFirstDisplayedHotel() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.FirstDisplayedHotel.Xpath"));
		return this;
	}
	
	public IrctcHotelsPage getHotelName() {
		hotelname= getTextByXpath(prop.getProperty("IrctcHotelsPage.HotelName.Xpath"));
		return this;
	}
	
	public IrctcHotelsPage getHotelPrice() {
		price= getTextByXpath(prop.getProperty("IrctcHotelsPage.HotelPrice.Xpath"));
		return this;
	}
	
	public IrctcHotelsPage clickOnContinueToBook() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.ContinueToBook.Xpath"));
		return this;
	}
	
	public IrctcHotelsPage selectTitle(String Title) {
		selectVisibileTextByName(prop.getProperty("IrctcHotelsPage.Title.Name"), Title);
		return this;
	}
	
	public IrctcHotelsPage enterFirstName(String FirstName) {
		enterByName(prop.getProperty("IrctcHotelsPage.FirstName.Name"), FirstName);
		return this;
	}
	
	public IrctcHotelsPage enterLastName(String LastName) {
		enterByName(prop.getProperty("IrctcHotelsPage.LastName.Name"), LastName);
		return this;
	}
	
	public IrctcHotelsPage selectGst(String GST) {
		selectVisibileTextByName(prop.getProperty("IrctcHotelsPage.Gst.Name"), GST);
		return this;
	}
	
	
	public IrctcHotelsPage enterCompanyName(String CompanyName) {
		enterByName(prop.getProperty("IrctcHotelsPage.CompanyName.Name"), CompanyName);
		return this;
	}
	
	public IrctcHotelsPage enterCompanyAddress(String CompanyAddress) {
		enterByName(prop.getProperty("IrctcHotelsPage.CompanyAddress.Name"), CompanyAddress);
		return this;
	}
	
	public IrctcHotelsPage compareHotelName(String hotelname) {
		verifyTextByXpath(prop.getProperty("IrctcHotelsPage.CompareHotelName.Xpath"), hotelname);
		return this;
	}

	public IrctcHotelsPage compareAmount(String price) {
		verifyTextContainsByXpath(prop.getProperty("IrctcHotelsPage.CompareAmount.Xpath"), price);
		return this;
	}
	
	public IrctcHotelsPage clickOnGo() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.GoButton.Xpath"));
		return this;
	}
	
	public IrctcHotelsPage clickOnIAgree() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.IAgreeButton.Xpath"));
		return this;
	}
	
	public IrctcHotelsPage clickOnMakePayment() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.MakePaymentButton.Xpath"));
		return this;
	}
	
	public IrctcHotelsPage clickOnVerifyInOtp() {
		clickByXpath(prop.getProperty("IrctcHotelsPage.VerifyOTPButton.Xpath"));
		return this;
	}
		
	public IrctcHotelsPage compareOtpErrormessage(String verifytext) {
		String text = verifytext;
		verifyTextContainsByXpath(prop.getProperty("IrctcHotelsPage.CompareOTPError.Xpath"), text);
		return this;
	}
	
	public IrctcHotelsPage compareGstErrormessage(String verifytext) {
		String text = verifytext;
		verifyTextContainsByXpath(prop.getProperty("IrctcHotelsPage.CompareGSTError.Xpath"), text);
		return this;
	}
	
}
