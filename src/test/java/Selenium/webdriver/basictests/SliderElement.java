package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SliderElement {
	
	
	public void sliderElement() throws Exception
	{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+".//Drivers//chromedriver.exe");
	//WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
    WebDriver driver=new ChromeDriver(options);  
      Thread.sleep(1000);
    driver.get("jqueryscript.net/demo/price-Range-Slider-JQuery-UI/");
    driver.manage().window().maximize();
    
    Actions act=new Actions(driver);
    WebElement min_slider=driver.findElement(By.xpath("value"));
    System.out.println("Current Location of min_slider:"+min_slider.getLocation());
    
    act.dragAndDropBy(min_slider, 100, 250).perform();//drag from starting point
    
    WebElement max_slider=driver.findElement(By.xpath("value1"));
    System.out.println("Current Location of max_slide:"+max_slider.getLocation());
    act.dragAndDropBy(max_slider,-100,250).perform();//drag from end point
    
    System.out.println("Location of max_slide after moving:"+max_slider.getLocation());
    
    
    

	}
}
