package pfPackage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfPackage.base.BasePage;

public class UpdateShippingPage extends BasePage {
	
	//WebElement of first name
	@FindBy(name="first_name")
	public WebElement first_name;
	
	//WebElement of last name	
	@FindBy(css="family_name")
	public WebElement FamilyName;
	
	//WebElement of address line 01	
	@FindBy(css="input[name='address1']")
	public WebElement AddressLine01;
	
	//WebElement of address line 02
	@FindBy(xpath="//input[@name='address2']")
	public WebElement AddressLine02;
	
	//WebElement of ZIP Code
	@FindBy(name="zip_code")
	public WebElement Zip_code;
	
	//WebElement of city Code
	@FindBy(css="city")
	public WebElement city;
	
	//WebElement of Drop Down
	@FindBy(xpath="//select[@name='prefecture")
	public WebElement StateDropDown;
	
	//WebElement of Update button
	@FindBy(xpath="//button[contains(text(),'Update')]")
	public WebElement UpdateButton;
	
	//WebElement of success message
	@FindBy(xpath="p[class='has-success-text']")
	public WebElement UpdateSuccessMessage;
	
	//Constructor code
	public UpdateShippingPage(WebDriver driver, ExtentTest eTest) {
		 this.driver=driver;
		 this.eTest=eTest;
	}

	//Reusable method for address update
	public boolean updateAddress() {
		
			//Entering 1st name by clearing the existing name
		    first_name.clear();
		    first_name.sendKeys("Pradip");
		
		    //Entering family name by clearing the existing name
		    FamilyName.clear();
		    FamilyName.sendKeys("Prasad");
		
		    //Entering address line #01 by clearing the existing address	
		    AddressLine01.clear();
		    AddressLine01.sendKeys("Plot B-123");
		
		    //Entering address line #02 by clearing the existing address	
		    AddressLine02.clear();
		    AddressLine02.sendKeys("Address 2");
		
		    //Entering ZIP Code by clearing the existing ZIP Code
		    Zip_code.clear();
		    Zip_code.sendKeys("12345");
		
		    //Entering city by clearing the existing city
		    city.clear();
		    city.sendKeys("Tokyo");
		
		    //Selecting state from drop down 
		    StateDropDown.click();
		    Select state=new Select(StateDropDown);
		    state.selectByVisibleText("New York");	
		    
		    //Clicking on the Update button
		    UpdateButton.click();
		    
		  //Verifying that new address is updated
	    	String AddressStatus=UpdateSuccessMessage.getText()	;
	    	
	    	boolean updateStatus;
	    	
		  if (updateStatus=AddressStatus.equals("Address is successfully updated"))
			  
		  {    
				return true;	
				
	      }else     {		
	    	  
				return false;	
				    }	
			
		   }
		
		
	}


