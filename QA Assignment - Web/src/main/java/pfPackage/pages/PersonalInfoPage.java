package pfPackage.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfPackage.base.BasePage;

public class PersonalInfoPage extends BasePage {
	
		
	//WebElement of View Profile
	@FindBy(xpath="//p[contains(text(),'View profile')]")
	public WebElement PersonalInfo;
	
	// Constructor code
	public PersonalInfoPage(WebDriver driver, ExtentTest eTest) {
		this.driver=driver;
		this.eTest=eTest;
	}

		//Reusable method for clicking on Personal Profile
		public boolean personalProfilePage() {
			PersonalInfo.click();
			eTest.log(LogStatus.INFO,"User clicked on the Personal Profile ");
			
			ShippingAddressPage shippingAddress=new ShippingAddressPage(driver,eTest);
			PageFactory.initElements(driver,shippingAddress);
			
			boolean verifyPersonalProfile=shippingAddress.shippingAddressMenu();
			return verifyPersonalProfile;
		}

}
