package flipkart.pom.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FlipKartResultPage extends GenericWrappers {
	
	public FlipKartResultPage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	String resultprice;
	String resulttitle;
	

	public FlipKartResultPage getResultPrice() {
		resultprice = getTextByXpath(prop.getProperty("FlipKartResultPage.ResultPrice.Xpath"));
		return this;
	}
	
	public FlipKartResultPage getResultTitle() {
		resulttitle= getTextByXpath(prop.getProperty("FlipKartResultPage.ResultTitle.Xpath"));
		return this;
	}
	
	public FlipKartResultPage clickOnAddToCart() {
		clickByXpath(prop.getProperty("FlipKartResultPage.AddToCart.Xpath")); 
		return this;
	}
	
	public FlipKartResultPage compareResultPrice(String resultprice) {
		verifyTextByXpath(prop.getProperty("FlipKartResultPage.CompareResultPrice.Xpath"), resultprice);
		return this;
	}
	
	public FlipKartResultPage compareResultTitle(String resulttitle) {
		verifyTextByXpath(prop.getProperty("FlipKartResultPage.CompareResultTitle.Xpath"), resulttitle);
		return this;
	}
	
}
