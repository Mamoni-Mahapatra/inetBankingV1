package utilities;

//Listener class used to generate reports
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.BaseClass;

public class ExtentReportManager implements ITestListener {
		
		public ExtentHtmlReporter htmlReporter;
		public ExtentReports extent;
		public ExtentTest test;
		
		String repName;
		
		public void onStart(ITestContext testContext)
		{
			String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); //Time Stamp
			String repName="Test-Report-"+timeStamp+".html";
			
			htmlReporter=new ExtentHtmlReporter(".\\reports\\"+ repName);//Specify location of the report
			htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
			
			htmlReporter.config().setDocumentTitle("openCart Test Project");//Title of Report
			htmlReporter.config().setReportName("openCart Functional Test Automation Report");//name of the report
			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);//location of the chart
			htmlReporter.config().setTheme(Theme.DARK);
			
		    extent=new ExtentReports();
		    extent.attachReporter(htmlReporter);
		    extent.setSystemInfo("Application","opencart");
		    extent.setSystemInfo("Module","Admin");
		    extent.setSystemInfo("Sub Module","Customers");
		    extent.setSystemInfo("Operating System",System.getProperty("os.name"));
		    extent.setSystemInfo("User Name",System.getProperty("user.name"));
		    extent.setSystemInfo("Environment","QA");
		
		
		}
		public void onTestSuccess(ITestResult result)	
		{
			test=extent.createTest(result.getName());//create new entry in report
			test.log(Status.PASS,"Test Passed");//send the passed information
			
		}
		public void onTestFailure(ITestResult result)
		{
			test=extent.createTest(result.getName());//create new entry in report
			test.log(Status.FAIL,"Test Failed");//Send the fail information
			test.log(Status.FAIL,result.getThrowable().getMessage());
			
			try {
				String imgPath=new BaseClass().captureScreen(result.getName());
				test.addScreenCaptureFromPath(imgPath);
			}
			catch(IOException e1)
			{
				e1.printStackTrace();
			}
				
					
		
		/*String screenshotPath=System.getProperty("user.dir"+"\\Screenshots\\"+tr.getName()+".png");
		
		File f = new File(screenshotPath);
		
		if(f.exists())
		{
			try {
				logger.fail("Screenshot is below:"+logger.addScreenCaptureFromPath(screenshotPath));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
	}
		public void onTestSkipped(ITestResult result)
		{
			test=extent.createTest(result.getName());//create new entry in report
		//	test.createNode(result.getName());
			test.log(Status.SKIP,"Test Skipped");
			test.log(Status.SKIP,result.getThrowable().getMessage());
		}
		
	   public void onFinish(ITestContext testContext)
	   {
		   extent.flush();
	   }
	}






