package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutor {

	public static void exceutescript()
	{
	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+".//Drivers//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();  
	
    driver.manage().window().maximize();
    driver.get("https://testautomationpractice.blogspot.com/");
    
    driver.switchTo().frame(0);
    
     
    WebElement textbox=driver.findElement(By.id("name"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].value='Mamoni'",textbox);
    
    
    WebElement checkbox=driver.findElement(By.id("sunday"));
    js.executeScript("arguments[0].click();",checkbox);
    
	WebElement radiobutton=driver.findElement(By.id("male"));
	js.executeScript("arguments[0].click();",radiobutton);
	
	WebElement button=driver.findElement(By.id("FSsubmit"));
	js.executeScript("arguments[0].click();",button);
	}
}
