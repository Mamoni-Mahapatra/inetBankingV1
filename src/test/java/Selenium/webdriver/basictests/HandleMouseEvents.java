package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMouseEvents {
	
	@Test
	public void handleEvent() throws Exception
	{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+".//Drivers//chromedriver.exe");
	//WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();  
    
   
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    
    WebElement language=driver.findElement(By.xpath("//span[@class=\"icp-nav-link-inner\"]"));
    WebElement sel=driver.findElement(By.xpath("//input[@value='hi_IN']"));
    
    Actions act=new Actions(driver);
    act.moveToElement(language).moveToElement(sel).perform();//for mouse hover on element
    
  //  act.contextClick(sel).perform();--> for right click on element
    // act.doubleClick(sel).perform();--->for double click on element
    
    driver.quit();
    

}
}
