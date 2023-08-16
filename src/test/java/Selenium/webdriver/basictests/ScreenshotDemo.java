package Selenium.webdriver.basictests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.bytedeco.javacpp.tools.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenshotDemo {
	//Screenshot for failed TestCase
		     WebDriver driver;
		
		     @Test
		public void show()
		{
						
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+".//Drivers//chromedriver.exe");
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
		    driver=new ChromeDriver(options); 
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://finance.yahoo.com");
			
			List<WebElement> element=driver.findElements(By.xpath("//div[@id='market-summary']"));
			
			for(WebElement option:element)
			{
			System.out.println(option.getText());
			
			}
			
			
		  /*  String actual=driver.getTitle();
		    		
		    String expect="Guru99 Bank Home Page1";
		    
		    Assert.assertEquals(actual,expect);
		    
		    JavascriptExecutor js=(JavascriptExecutor)driver;

			js.executescript("window.scrollBy(0,3000)","");
			js.executescript("argument[0].scrollIntoView();",actual);
			js.executeScript("window.scrollBy(0,doucument.body.ScrollHeight)");
			js.executeScript("return window.pageYOffset();");
			js.executeScript("argument[0].setAttribute('value','John');",inputbox);
			js.executeScript("argument[0].click();",radiobutton);
			js.executeScript("argument[0].click();",checkbox);
			
			Actions act=new Actions(driver);
			
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
			act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
			act.sedKeys(Leys.TAB).perform();
			act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
			
			driver.get(ur1);
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get(url2);
			
			driver.get(url3);
			driver.switchTo().newWindow(WindowType.WINDOW);
		    driver.get(url4);
		    
		    driver.navigate().to(url);
		    driver.navigate().back();
		    driver.navigate.refresh();
		    driver.navigate().forward();
		    
		    
		    act.isDisplayed();
		    act.isEnabled();
		    act.isSelected();
		    
		    
		    Select sl=new Select(driver.findElement(By.xpath("value")));
		    sl.selectByVisibleText("gghjjg");
		    sl.selectByValue("ggfg");
		    sl.selectByIndex(1);
		    
		    
		    List<WebElement>options= act.getOption();
	        System.out.println(options);
	        
	        PageFactory.initElements(null, options);
	        
	        Logger logger=logger.getLogger("");
	        PropertyConfigurator.config("Log4j.properties");
	        logger.info("");
	        
	        act.moveToElement(actual).perform();
	        act.contextClick(actual).perform();
	        act.doubleClick().perform();
	        act.dragAndDrop(source,destination).perform();*/
	        
		}
		/*@AfterMethod
		public void screenshot(ITestResult result) throws IOException
		{
			if(ITestResult.FAILURE==result.getStatus())
			{
			
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file,new File(".//Screenshots//LoginPage.png"));
			driver.quit();
		    }
		}*/

		     String act=driver.getTitle();
		     String exp="";
		     Asset.assertEquals(act,exp);
		     
		     @Test(priority=1,dependsOnMethods= {"show"})
		     public void screenshots(ITestResult result) throws IOException
		     {
		     if(ITestResult.FAILURE==result.getStatus())
		     {
		    	
		     File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		     FileUtils.copyFile(file,new File(".//Screebnshot//hompepage.png"));
		     
		 	 }
		     }
		
		
	

}
