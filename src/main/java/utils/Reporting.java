package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporting {
	
	public static ExtentReports report;
	public ExtentTest test;
	public String testCaseName;
	public String testCaseDescription;
	public String author;
	public String category;
	
	public void startReport() {
		report = new ExtentReports("./reports/resultswithDP.html", false);
	}
	
	
	public void startTest(String testName, String description) {
		test = report.startTest(testName, description);
		test.assignAuthor(author);
		test.assignCategory(category);
	}

	public abstract long takeSnap();
	
	public void reportStep(String details, String status) {
		
		long snapNumber = takeSnap();
		
		if(status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, details +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".png"));	
		} else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, details +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".png"));
		} else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, details +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".png"));
		} else if(status.equalsIgnoreCase("warn")) {
			test.log(LogStatus.WARNING, details +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".png"));
		}
	}
	
	
	public void endTest() {
		report.endTest(test);
	}
	
	
	public void endReport() {
		report.flush();
	}
	
public void reportStep(String details, String status, boolean snap) {
		
		if(!snap) {
		
		if(status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, details);	
		} else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, details);
		} else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, details);
		} else if(status.equalsIgnoreCase("warn")) {
			test.log(LogStatus.WARNING, details);
		}
		}
	}

}
