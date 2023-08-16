package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AccountRegisterationPage extends BasePage {
	
	public AccountRegisterationPage(WebDriver driver)
	{
		super(driver);
	
	}
	
	//Elements
	@FindBy(name="firstname")
	WebElement txtFirstName;
	
	@FindBy(name="lastname")
	WebElement txtLastName;
	
	@FindBy(name="email")
	WebElement txtEmail;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	
	@FindBy(name="agree")
	WebElement chkdPolicy;
	//WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
   // mywait.until(ExpectedConditions.elementToBeClickable(chkPolicy));
    
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement buttonConfirm;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	//Action
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
    public void setPolicy()
    {
    	chkdPolicy.click();
    }
	public void clickButton()
	{
		buttonConfirm.click();
	}
	public String getConfirmationMsg()
	{
		try {
		return (msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
		
	}
	
	
	
	
	

}
