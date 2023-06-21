package Selenium.webdriver.basictests;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FirstTest {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/registries?ref_=nav_cs_registry&ref_=nav_cs_registry");
		
		
		//WebElement elem=driver.findElement(By.xpath("//*[@id=\"top-scroll\"]/li[4]/button/i"));
		
		
		/*driver.findElement(By.xpath("//*[@id=\"IT\"]")).click();
		Select sel=new Select(elem);
		List<WebElement>eleCount=sel.getOptions();
		System.out.println(eleCount.size());
		//sel.selectByIndex(2);
		sel.selectByVisibleText("");
		System.out.println("option selected");*/
		
		
		
		
	/*	//WebDriverManager.ChromeDriver.setup();--->need to add jars for WebdriverManager in pom.xml file
		
		driver.get("https://www.amazon.com/registries?ref_=nav_cs_registry&ref_=nav_cs_registry");
		//driver.get("https://www.snapdeal.com");*/
		
		//driver.get("https://www.opencart.com/index.php?route=account/register");
		//Thread.sleep(2000);
		WebElement dropdwn=driver.findElement(By.xpath("//select[@name='searchUrl']"));
		
		
		
		Select dpds=new Select(dropdwn);
		List<WebElement>elementCount=dpds.getOptions();
		
		System.out.println("values found"+elementCount.size());
	    dpds.selectByVisibleText("Gift List");
	    System.out.println(dropdwn.isSelected());
	   
	//	System.out.println("Option selected");
	//	 File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    WebElement section=driver.findElement(By.xpath("//div[@class='gr-hero__container']"));//specific section of screenshot
	    FileUtils.copyFile(section.getScreenshotAs(OutputType.FILE),new File(".\\screenshots\\homepage.png"));
		  
		/*dropdwn.clear();
		System.out.println("Text cleared");
		dpds.selectByVisibleText("Gift List");
		
		
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	//	System.out.println(driver.getPageSource());//*[@id="twotabsearchtextbox"]
		
		System.out.println(dropdwn.getText());
		System.out.println(dropdwn.getAttribute("a-autoid-0"));
		
		
	//	WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
		//System.out.println("Element should display: "+element.isDisplayed());
	//	System.out.println("Element should enable: "+element.isEnabled());*/
	//	System.out.println()
		
		//WebElement ele=driver.findElement(BEWE-EEZT-ETKH-RJTH-TRQB-PRRKBy.id(null));
	/*	driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
;*/
		System.out.println("Windows closed successfully");
		driver.close();


			}

	}

