package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {
         
	@Test
	public void actiondemo()
	{
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+".//Drivers//chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		// driver.get("https://demo.guru99.com/");
	     driver.manage().window().maximize();
	     driver.get("https://text-compare.com");
	     
	     driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]")).sendKeys("WELCOME TO AUTOMATION");
	    
	     Actions act=new Actions(driver);
	     //to select all text
	     act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	     
	     //to copy all text
	     act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	     
	     //to switch to next text box
	     act.sendKeys(Keys.TAB).perform();
	     
	     //to paste all text
	     act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	     
	     driver.quit();
	     
		
		
	}

}
