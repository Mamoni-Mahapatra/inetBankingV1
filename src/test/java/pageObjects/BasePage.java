package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Selenium.webdriver.basictests.JavascriptExecutor;

public class BasePage {
     
	 WebDriver driver;
	
	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}


