package irctc.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HillRailwaysPassangerPage extends GenericWrappers {
	
	String totalPrice;
	
	public HillRailwaysPassangerPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public HillRailwaysPassangerPage enterFirstName1(String firstname1) {
		enterByXpath(prop.getProperty("HillRailwaysPassangerPage.FirstName1.Xpath"), firstname1);
		return this;
	}
	
	public HillRailwaysPassangerPage enterLastName1(String lastname1) {
		enterByXpath(prop.getProperty("HillRailwaysPassangerPage.LastName1.Xpath"), lastname1);
		return this;
	}
	
	public HillRailwaysPassangerPage enterAdultAge1(String age1) {
		enterByXpath(prop.getProperty("HillRailwaysPassangerPage.Age1.Xpath"), age1);
		return this;
	}
	
	public HillRailwaysPassangerPage enterGender1(String gender1) {
		selectValueByXpath(prop.getProperty("HillRailwaysPassangerPage.Gender1.Xpath"), gender1);
		return this;
	}
	
	public HillRailwaysPassangerPage enterFirstName2(String firstname2) {
		enterByXpath(prop.getProperty("HillRailwaysPassangerPage.FirstName2.Xpath"), firstname2);
		return this;
	}
	
	public HillRailwaysPassangerPage enterLastName2(String lastname2) {
		enterByXpath(prop.getProperty("HillRailwaysPassangerPage.LastName2.Xpath"), lastname2);
		return this;
	}
	
	public HillRailwaysPassangerPage enterAdultAge2(String age2) {
		enterByXpath(prop.getProperty("HillRailwaysPassangerPage.Age2.Xpath"), age2);
		return this;
	}
	
	public HillRailwaysPassangerPage enterGender2(String gender2) {
		selectValueByXpath(prop.getProperty("HillRailwaysPassangerPage.Gender2.Xpath"), gender2);
		return this;
	}
	
	public HillRailwaysPassangerPage enterFirstName3(String firstname3) {
		enterByXpath(prop.getProperty("HillRailwaysPassangerPage.FirstName3.Xpath"), firstname3);
		return this;
	}
	
	public HillRailwaysPassangerPage enterLastName3(String lastname3) {
		enterByXpath(prop.getProperty("HillRailwaysPassangerPage.LastName3.Xpath"), lastname3);
		return this;
	}
	
	public HillRailwaysPassangerPage enterChildAge3(String age3) {
		enterByXpath(prop.getProperty("HillRailwaysPassangerPage.Age3.Xpath"), age3);
		return this;
	}
	
	public HillRailwaysPassangerPage enterGender3(String gender3) {
		selectValueByXpath(prop.getProperty("HillRailwaysPassangerPage.Gender3.Xpath"), gender3);
		return this;
	}
	
	public HillRailwaysPassangerPage enterNominee(String nominee) {
		enterByName(prop.getProperty("HillRailwaysPassangerPage.Nominee.Name"), nominee);
		return this;
	}
	
	public HillRailwaysPassangerPage enterRelation(String relation) {
		enterByName(prop.getProperty("HillRailwaysPassangerPage.Relation.Name"), relation);
		return this;
	}
	
	public HillRailwaysPassangerPage enterContact(String contact) {
		enterByName(prop.getProperty("HillRailwaysPassangerPage.Contact.Name"), contact);
		return this;
	}
	
	public HillRailwaysPassangerPage enterPhone(String phone) {
		enterByName(prop.getProperty("HillRailwaysPassangerPage.Phone.Name"), phone);
		return this;
	}
	
	public HillRailwaysPassangerPage enterFax(String fax) {
		enterByName(prop.getProperty("HillRailwaysPassangerPage.Fax.Name"), fax);
		return this;
	}
	
	public HillRailwaysPassangerPage enterAddress(String address) {
		enterByName(prop.getProperty("HillRailwaysPassangerPage.Address.Name"), address);
		return this;
	}
	
	public HillRailwaysPassangerPage enterCity(String city) {
		enterByName(prop.getProperty("HillRailwaysPassangerPage.City.Name"), city);
		return this;
	}
	
	public HillRailwaysPassangerPage selectState(String state) {
		selectVisibileTextByName(prop.getProperty("HillRailwaysPassangerPage.State.Name"), state);
		return this;
	}
	
	public HillRailwaysPassangerPage enterNationality(String nationality) {
		enterByName(prop.getProperty("HillRailwaysPassangerPage.Nationality.Name"), nationality);
		return this;
	}
	
	public HillRailwaysPassangerPage selectIdCardType(String idcard) {
		selectVisibileTextByName(prop.getProperty("HillRailwaysPassangerPage.IdCardType.Name"), idcard);
		return this;
	}
	
	public HillRailwaysPassangerPage enterIdCardNumber(String idcardno) {
		enterByName(prop.getProperty("HillRailwaysPassangerPage.IdCardNumber.Name"), idcardno);
		return this;
	}
	
	public HillRailwaysPassangerPage clickOnSubmit() {
		clickByXpath(prop.getProperty("HillRailwaysPassangerPage.SubmitButton.Xpath"));
		return this;
	}
	
	public HillRailwaysPassangerPage getTotalPrice() {
		totalPrice=getTextByXpath(prop.getProperty("HillRailwaysPassangerPage.TotalPrice.Xpath"));
		return this;
	}
	
	public HillRailwaysPassangerPage clickOnIAgree() {
		clickByXpath(prop.getProperty("HillRailwaysPassangerPage.IAgree.Xpath"));
		return this;
	}
	
	public HillRailwaysPassangerPage clickOnMakePayment() {
		clickByXpath(prop.getProperty("HillRailwaysPassangerPage.MakePayment.Xpath"));
		return this;
	}
	
	public HillRailwaysPassangerPage getTransactionId(String attribute) {
		getAttributeByXpath(prop.getProperty("HillRailwaysPassangerPage.TransactionID.Xpath"), attribute);
		return this;
	}
	
	public HillRailwaysPassangerPage verifyTotalPrice(String attribute) {
		verifyAttributeContainsByXpath(prop.getProperty("HillRailwaysPassangerPage.ComparePrice.Xpath"), attribute, totalPrice);
		return this;
	}

}
