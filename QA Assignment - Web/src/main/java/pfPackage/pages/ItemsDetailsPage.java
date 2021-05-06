package pfPackage.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfPackage.base.BasePage;

public class ItemsDetailsPage extends BasePage  {
		
    //WebElement of Item Details
	@FindBy(className="item-name")
	public WebElement ItemDetails;
	
	// Constructor code
	public ItemsDetailsPage(WebDriver driver, ExtentTest eTest) {
		this.driver=driver;
		this.eTest=eTest;
	}

	//Reusable method to verify that the item title is MacBook	  
	 public boolean verifyItemDetails() {
		boolean verifyStatus;
		ItemDetails.getText();
		eTest.log(LogStatus.INFO,"Item name fetched successfully" );
		
		String ItemTitle=ItemDetails.getText();
	 	// Splitting the title of Item
	 	    String SplitItemTitle[]=ItemTitle.split(" ");
	 	    
 	     //Verifying the name  of the items displayed uisnf for loop
	 	    for (int i=0; i<SplitItemTitle.length; i++) {
	 	    
		        if(verifyStatus=SplitItemTitle[i].equals("p")) {
		        return true;
            }
	 	    }   return false; 
	}
}