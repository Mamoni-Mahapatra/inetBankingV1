package Selenium.webdriver.basictests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;



public class A {
	
	  WebDriver driver;
	
	@Test
	public void show()
	{
		
		try
		   {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+".//Drivers//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
	    driver=new ChromeDriver(options); 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://finance.yahoo.com/");
		
        
        
        WebElement colr=driver.findElement(By.xpath("//*[@id='header-mail-button']/svg/path"));
        String bckcl=colr.getCssValue("color");
        System.out.println(bckcl);

        
       WebElement ele=driver.findElement(By.xpath("//span[text()='Sign in']"));
       List<WebElement> el=driver.findElements(By.xpath("//div[@id='market-summary']"));
       
       for(WebElement opt:el)
       {
    	   System.out.println(opt.getText());
       }
     String act=ele.getText();
     Assert.assertEquals(act,"Sign in");
     System.out.println(act);
   }
     catch(Exception e)
   {
     Assert.fail();
   }
     
     driver.close();
		/*List<WebElement> element=driver.findElements(By.xpath("//*[@id=\"content\"]/div[2]"));
		for(WebElement alloptions:element)
		{
			System.out.println(alloptions.getText());
		}
		
		
	  /*  String actual=driver.getTitle();
	    String expect="Guru99 Bank Home Page";*/
	    
	    //Assert.assertEquals(actual,expect);
	 
	}
	
/*	public void screenshot(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File(".//Screenshots//LoginPage.png"));
		
	    }*/
	}

	
	
	

