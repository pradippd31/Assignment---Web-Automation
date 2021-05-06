package pfPack.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pfPack.tests.base.BaseTest;
import pfPackage.pages.TimeLinePage;
import pfPackage.util.Constants;

public class MercariScenario01 extends BaseTest{

	@Test
	public void scenarioOne() {
		
		eTest=eReport.startTest("Scenario 1");
		
		eTest.log(LogStatus.INFO, "Website has been launched");
		
		openBrowser(Constants.BROWSER_TYPE);
		
		 driver.get(Constants.APP_URL);
	    
	     eTest.log(LogStatus.INFO, "Application URL "+Constants.APP_URL+" got opened");
		
		TimeLinePage timeLinePage=new TimeLinePage(driver,eTest);
		
		PageFactory.initElements(driver,timeLinePage );
		
		boolean verifyPageMenu=timeLinePage.pageMenu();
	     
		if (verifyPageMenu) {
			//Calling reportPass method in baseTest
			reportPass("Scenario 01 - address update passed");
			
		}else {
			//Calling reportFail method in baseTest
			reportFail("Scenario 01 - address update failed");
		}
		
	}
	
	@AfterMethod
	public void testClosure() {
		
		if(eReport!=null) {
			
			eReport.endTest(eTest);
			
			//Storing logs in the report
			eReport.flush();
			
		}
		if (driver!=null) {
			driver.close();
		}
	}
}