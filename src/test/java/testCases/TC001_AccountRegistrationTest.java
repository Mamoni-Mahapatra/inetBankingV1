package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Selenium.webdriver.basictests.JavascriptExecutor;
import pageObjects.AccountRegisterationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{

	@Test(groups= {"Regression","Master"})
	public void test_account_Registration()throws InterruptedException
	{
		
	logger.info("*** Starting Execution ***");
	HomePage hp=new HomePage(driver);
	hp.clickMyAccount();
	logger.info("clicked on myAccountlnk");
	hp.clickRegister();
	logger.info("clicked on Registerationlnk");
	
	AccountRegisterationPage rp=new AccountRegisterationPage(driver);
	logger.info("providing customer data");
	
	rp.setFirstName("abc");//rp.setFirstName(randomString).toUpperCase();
	rp.setLastName("ghfg");//rp.setLastName(randomString).toLowerCase();
	rp.setEmail(randomString() + "@gmail.com");//random email we can create
	//rp.setTelephoneNumber(randomeNumber + "12345667");
	rp.setPassword("tests@123");
	
	
    /*JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",rp.setPolicy);*/
	
	 Thread.sleep(10);
	 rp.setPolicy();
	 rp.clickButton();
	 logger.info("clicked on continueBtn");
	
	//String confmg=rp.getConfirmationMsg();
	// logger.info("Validating expected message");
    //Assert.assertEquals(confmg,"Your Account Has Been Created!","not getting expected msge");
		
		/*catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}*/
	 logger.info("finished login test");
	}
	
	
}
