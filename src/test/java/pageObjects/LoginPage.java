package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	//Elements
	@FindBy(name="email")
	WebElement txtEmailAddress;
	
	@FindBy(name="password")
	WebElement txtPassword;

	@FindBy(xpath="//button[text()='Login']")
	WebElement btnLogin;
	
	//Actions
	public void setEmailAddress(String email)
	{
		txtEmailAddress.sendKeys(email);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void clickLogin()
	{
		btnLogin.click();
	}
}
