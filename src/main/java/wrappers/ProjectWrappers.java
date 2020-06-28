package wrappers;

import java.lang.reflect.Method;

import org.testng.annotations.*;

public class ProjectWrappers extends GenericWrappers {
	
	public String browserName;
	public String app;
	
	@BeforeSuite
	public void beforeSuite() {
		startReport();	
	}
	
	@BeforeTest
	public void beforeTest() {
	loadObjects();
	}
	
	
	
	@BeforeMethod()
	public void irctcLaunch(Method method) {
		startTest(method.getName(), testCaseDescription);
		
		switch (app) {
		case "IRCTC":
			invokeApp(browserName, "https://www.irctc.co.in", true);
			break;
		case "FLIPKART":
			invokeApp(browserName, "https://www.flipkart.com/", true);
			break;
		default:
			invokeApp(browserName, "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp",true);
			break;
		}
	}
	
	@AfterMethod()
	public void irctcClose() {
		closeAllBrowsers();
	}
	
	@AfterClass
	public void afterClass() {
		endTest();
	}
	
	@AfterTest
	public void afterTest( ) {
		unloadObjects();
	}
	
	@AfterSuite
	public void afterSuite() {
		endReport();
	}

}
