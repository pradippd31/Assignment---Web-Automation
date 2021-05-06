package pfPackage.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfPackage.base.BasePage;

public class SearchedItemsPage extends BasePage {
	
	//WebElement of Third Item displayed
	@FindBy(xpath="//h3[contains(text(),'MacBook')]")
	public WebElement ThirdItem;
	
	//public List<WebElement> ThirdItem;
	
    //Constructor code	
	public SearchedItemsPage(WebDriver driver, ExtentTest eTest) {
		this.driver=driver;
		this.eTest=eTest;
		
	}
 //Reusable method for clicking third item
		public boolean clickItem() {
			
			ThirdItem.click();
            eTest.log(LogStatus.INFO,"User clicked on the third item");
			
			ItemsDetailsPage itemsDetails=new ItemsDetailsPage(driver,eTest);
			PageFactory.initElements(driver,itemsDetails);
			
			boolean verifyProductName=itemsDetails.verifyItemDetails();
			
			return verifyProductName;
			
		}	
}
