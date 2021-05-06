package pfPackage.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfPackage.base.BasePage;
public class MyPage extends BasePage {
	
		
	//WebElement of Personal Information
		@FindBy(xpath="//p[contains(text(),'Personal Information')]")
		public WebElement PersonalInfo;
		
		//Constructor code
		public MyPage(WebDriver driver, ExtentTest eTest) {
			this.driver=driver;
			this.eTest=eTest;
		
		}
		//Reusable method for clicking on Personal Profile
		public boolean personalInfoPage() {
		//Clicking on My Page menu
			PersonalInfo.click();
			eTest.log(LogStatus.INFO,"User clicked on the Personal Info link");
					
			PersonalInfoPage  personalInfo=new PersonalInfoPage(driver,eTest);	
			PageFactory.initElements(driver,personalInfo);
			
			boolean verifyPersonalProfile=personalInfo.personalProfilePage();
			
			return	verifyPersonalProfile;
					
					
				}

}





