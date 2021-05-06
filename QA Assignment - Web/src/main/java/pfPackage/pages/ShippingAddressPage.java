package pfPackage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfPackage.base.BasePage;

public class ShippingAddressPage extends BasePage {
		
	//WebElement of Shipping Address
	@FindBy(xpath="//a[normalize-space()='My address']")
	public WebElement ShippingAddress;
	
	//Constructor code
	public ShippingAddressPage(WebDriver driver, ExtentTest eTest) {
	 this.driver=driver;
	 this.eTest=eTest;
	}

		//Reusable method for shipping address
		public boolean shippingAddressMenu() {
			 ShippingAddress.click();
			 eTest.log(LogStatus.INFO,"User clicked on the Shipping address link");
			
			 UpdateShippingPage searchedItems=new UpdateShippingPage(driver,eTest);
			
		    boolean updateAddress=searchedItems.updateAddress();
			return updateAddress;
			
		}
	

}



