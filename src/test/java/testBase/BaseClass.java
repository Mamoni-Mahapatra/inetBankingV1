package testBase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Selenium.webdriver.basictests.JavascriptExecutor;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public Logger logger;
	
	public ResourceBundle rb;//it is an in build class used to connect wd config properties file
	
	
	@BeforeClass(groups= {"Master","Regression","Sanity"})
	@Parameters("browser")
	public void setup(String br)
	{
		
	    rb=ResourceBundle.getBundle("resources.config");//load config.properties file
		logger=LogManager.getLogger(this.getClass());//this represents the current class
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+".//Drivers//chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
		    driver=new ChromeDriver(options); 
			
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+".//Drivers//geckodriver.exe");
			//FirefoxOptions options=new FirefoxOptions();
			//options.addArguments("--remote-allow-origins=*");
			driver=new FirefoxDriver();
		}
			
		else
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+".//Drivers//iedriver.exe");
			//IEOptions options=new IEOptions();
		//	options.addArguments("--remote-allow-origins=*");
		    driver=new InternetExplorerDriver(); 
						
		}
		
		driver.manage().deleteAllCookies();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	driver.get(rb.getString("appURL"));
		//driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	}
	
	@AfterClass(groups= {"Master","Regression","Sanity"})
	public void tearDown()
	{
		driver.quit();
		
	}
	
	public String randomString()
	{
		String generatedString =RandomStringUtils.randomAlphabetic(5);
		return(generatedString);
		
	}
	public String randomNumber()
	{
		String generatedString2 =RandomStringUtils.randomNumeric(10);
		return(generatedString2);
	}
	public String randomAlpaNumeric()
	{
		String st= RandomStringUtils.randomAlphabetic(5);
		String num=RandomStringUtils.randomNumeric(10);
		return(st+num);
	}
	
	public String captureScreen(String tname)//capture screenshot for failed test cases
	{
		/*SimpleDateFormat df=new SimpleDateFormat("yyyyMMddhhmmss");//java class---craete object
		Date dt=new Date();//java class---create object
		
		String timestamp=df.format(dt);//format java method to generate the time stamp*/
		
		//OR
		
		String timeStamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
		File source=takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\Screenshots\\"+ tname + "_"+timeStamp+ ".png";
		
		try {
			FileUtils.copyFile(source,new File(destination));
		}
		
	catch(Exception e)
		{
		e.getMessage();
		}
		return destination;
	}
}
