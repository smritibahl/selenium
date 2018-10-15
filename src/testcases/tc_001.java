package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class tc_001 {
	
	InternetExplorerDriver dr;
	//FirefoxDriver dr;
	
	@Test
	public void tc1() 
	{
	     System.setProperty("webdriver.ie.driver","C:/Users/smrit/Desktop/windsor/Grad Job/selenium/IEDriverServer_Win32_3.9.0/IEDriverServer.exe");
		// System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		 dr = new InternetExplorerDriver();
		//FirefoxDriver dr= new FirefoxDriver();
	    dr.get("http://www.presto.com");
	      
	     /* dr.navigate().to("http://www.presto.com");
	      dr.navigate().to("http://www.shop.theTestingWorld.com");
	      dr.navigate().back();
	      dr.navigate().forward();
	      dr.navigate().refresh(); */
	
	
	}
}
