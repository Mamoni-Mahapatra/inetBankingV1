package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//Elements
	@FindBy(xpath = "//span[text()='My Account']")
    WebElement 	lnkMyAccount;
    
    @FindBy(xpath="//a[text()='Register']")
	WebElement lnkRegister;
    
    @FindBy(xpath="//li[@class='list-inline-item']//a[text()='Login']")
    WebElement lnkLogin;
   //Actions
    
    public void clickMyAccount()
    {
        lnkMyAccount.click();
    }
    
    public void clickRegister()
    {
    	lnkRegister.click();	
    }
   	public void clickLogin() {
		// TODO Auto-generated method stub
   		lnkLogin.click();
	}
    
	
	
	
	
}



	