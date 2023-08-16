package Selenium.webdriver.basictests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HandleStaticAndDynamicWebTables {

	@Test
	public void tables() {
	//WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+".//Drivers//chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
    WebDriver driver=new ChromeDriver(options); 
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://testautomationpractice.blogspot.com/");
    
    driver.manage().window().maximize();
    
    //find total number of rows in table
    
   int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
   System.out.println("Number of rows:"+rows);
   
   int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
   System.out.println("Number of cols:"+cols);
    
   //Read specific rows and columns data
   
  /* String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]/td[1]")).getText();
   System.out.println(value);
   */
   //Read data from all rows and columns
 /*  System.out.println("Book Name"+"  "+"Author"+"  "+"Subject"+"  "+"Price");
   
   for(int r=2;r<=rows;r++)
   {
	   for(int c=1;c<=cols;c++)
	   {
		   String values=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
		   
		   System.out.print(values+" | ");
	   
	   }
	   System.out.println();
   }
   
   //Print book name and whose author is Amit
   
   for(int r=2;r<=rows;r++)
   {
	   for(int c=1;c<=cols;c++)
	   {
		   String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
		   
		   if(author.equals("Amit"))
		   {
			   String book=driver.findElement(By.xpath("\"//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
			   System.out.println(book);
		   }
	   }
   }*/
   
   //find sum of prices for all the books
   
   int sum=0;
   for(int r=2;r<=rows;r++)
   {
	   String prices=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
	   sum=sum+Integer.parseInt(prices);
	   System.out.println(sum);
   }
	
	}
	
	
}
