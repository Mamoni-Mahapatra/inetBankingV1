package testCases;

import org.testng.annotations.Test;

import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	
	@Test(groups= {"Sanity","Master"})
	public void test_Login()
	{
		
		try {
		logger.info("****Starting TC002_LoginTest****");
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount link");
		
        hp.clickLogin();
        logger.info("Clicked on Login link");
		
        LoginPage lp=new LoginPage(driver);
        logger.info("Providing login Details");
    	lp.setEmailAddress(rb.getString("email"));//getting email from config.properties file
		lp.setPassword(rb.getString("password"));//getting password from config.properties file
		lp.clickLogin();
		logger.info("Clicked on login bitton");
		
		MyAccountPage ac=new MyAccountPage(driver);
		boolean targetPage=ac.isMyAccountPageExists();
		Assert.assertEquals(targetPage,false);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
			
		
		
		logger.info("Login Test Finished");
		
		
		
		
		
	}

}
