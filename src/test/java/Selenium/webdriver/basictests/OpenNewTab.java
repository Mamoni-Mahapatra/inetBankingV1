package Selenium.webdriver.basictests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTab {
	
	public void openNewTab()
	{
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+".//Drivers//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	// driver.get("https://demo.guru99.com/");
    driver.manage().window().maximize();
    
    //open url in 1 tab
    driver.get("https://text-compare.com");
    
    //open new tab
    driver.switchTo().newWindow(WindowType.TAB);//after 4 selenium version its implemented
    //open in new browser
    driver.switchTo().newWindow(WindowType.WINDOW);//after 4 selenium version its implemented
    //open another url in different  type
     driver.get("https://demo.guru99.com/");)

}
}
