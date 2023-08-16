package testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void test_LoginDDT(String email,String password,String exp)
	{
		logger.info("*****Staring TC003_LoginDDT***");
		
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
        hp.clickLogin();
     		
        LoginPage lp=new LoginPage(driver);
     
    	lp.setEmailAddress(email);//getting email from config.properties file
		lp.setPassword(password);//getting password from config.properties file
		lp.clickLogin();
		
		
		MyAccountPage ac=new MyAccountPage(driver);
		boolean targetPage=ac.isMyAccountPageExists();
		
		if(exp.equals("Valid"))
		{
			if(targetPage==true)
			{
				ac.clickLogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertFalse(false);
			}
		}
		
		if(exp.equals("Invalid"))
		{
			if(targetPage==true)
			{
				
				ac.clickLogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		
			
		}
		}catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("****TC003_LoginDDT_Finished*****");
}
}
