package flipkart.pom.testcases;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import flipkart.pom.pages.FlipKartLoginPage;
import utils.ExcelUtility;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		//testCaseName = "TC004";
		testCaseDescription = "To Verify Flipkart Mobile comparison";
		author = "Prasanna";
		category = "";
		browserName = "chrome";
		app = "FLIPKART";
	}
	
	@Test (dataProvider = "getExcelDataByKeys" , dataProviderClass = ExcelUtility.class)
	public void flipKart(HashMap<String, Object> map) {
		
		String resultprice = "";
		String resulttitle = "";
		
		new FlipKartLoginPage(driver,test)
		.enterEmailMobileNo(map.get("E-mail").toString())
		.enterPassword(map.get("Password").toString())
		.clickOnLoginButton()
		.enterSearch(map.get("Search").toString())
		.clickOnSearchIcon()
		.clickOnFirstResult()
		.switchToWindow()
		.getResultPrice()
		.getResultTitle()
		.clickOnAddToCart()
		.compareResultPrice(resultprice)
		.compareResultTitle(resulttitle)
		;
	}

}         
