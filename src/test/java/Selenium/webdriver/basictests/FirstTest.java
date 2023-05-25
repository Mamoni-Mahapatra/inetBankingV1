package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		
		         System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
				//To search for the driver location in drive
				
				WebDriver driver=new ChromeDriver();// Create driver object to Invoke Chrome driver
				//WebDriver is an Interface here and FirefoxDriver () is a constructor
				
				driver.get("https://www.facebook.com");
				// driver.get method to open the URL
				
				driver.findElement(By.name("email")).sendKeys("9604560370");
				//driver.findElement method to find the element by address/property
				
				driver.findElement(By.name("pass")).sendKeys("20071994");
				//driver.findElement method to find the element by address/property
				
				driver.findElement(By.name("login")).click();
				


			}

	}

