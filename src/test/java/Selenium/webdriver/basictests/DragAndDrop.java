package Selenium.webdriver.basictests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

	@Test
	public void mymethod() throws Exception{
		
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+".//Drivers//chromedriver.exe");
	//WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
    WebDriver driver=new ChromeDriver(options);  
      Thread.sleep(1000);
    driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
    driver.manage().window().maximize();
    
    Actions act=new Actions(driver);
    
    WebElement language=driver.findElement(By.id("block-2"));
   // Thread.sleep(1000);
    WebElement sel=driver.findElement(By.id("block-4"));
    Thread.sleep(1000);
    act.dragAndDrop(language, sel).perform();
    Thread.sleep(1000);
    driver.quit();
    
    
}

	
}