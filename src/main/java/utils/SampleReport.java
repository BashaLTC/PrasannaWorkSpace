package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	@Test
	public void generateReport() {
		
		//startreport
		ExtentReports report = new ExtentReports("./reports/result.html", false);
		
		//startest
		ExtentTest test = report.startTest("TC003" , "To Verify IRCTC Registration");
		test.assignAuthor("Prasanna");
		test.assignCategory("Smoke");
		
		//logteststeps
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		test.log(LogStatus.PASS, "The application has launched successfully with the given URL");
		
		//endtest
		report.endTest(test);
		
		//endreport
		
		report.flush();
	}
}
