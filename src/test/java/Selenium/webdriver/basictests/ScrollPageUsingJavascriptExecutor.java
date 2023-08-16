package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollPageUsingJavascriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();  
	
    driver.manage().window().maximize();
    driver.get("https://www.Countries-ofthe-world.com/flags-of-the-world.html");
    
    //scroll down page by pixel;
    JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0,3000)","");
    
    //to check how much pixel page has scrolled down
     System.out.println ( js.executeScript("return window.pageYOffset;"));
     
     //scrolldown the page till the element is present
     WebElement flag=driver.findElement(By.xpath("//img[alt='Flag of India']"));
      js.executeScript("arguments[0].scrollIntoView();",flag);
     
      
      //scroll down till the page end
      js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
      
      //scroll to go back to initial position
      js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
    

}

}