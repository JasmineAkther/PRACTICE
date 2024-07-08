package bit;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import Utility.shared;

public class BaseTest {
	 static Properties pro;
	 WebDriver driver;
	
	@BeforeClass
	public static void initialize() throws IOException {
		pro= shared.initpropertyfile("/Users/jasmineakther/eclipse-workspace/ExpressJunit/config.properties");
	}
	
	
	@Before
	public void openBrowser() {
		String brow= pro.getProperty("Browser");
		
		if(brow.equals("chrome")) {
			driver= new ChromeDriver();
		}
		else if(brow.equals("safari")) {
			driver= new SafariDriver();
		}
		
		else if(brow.equals("IE")) {
			driver=new InternetExplorerDriver();
			
		}
		else{
			driver= new FirefoxDriver();
			
		}
		driver.get(pro.getProperty("URL"));
	}
	
	
	
	  @After 
	  public void closebrowser() { driver.quit(); }
	 
	
	
	@AfterClass
	public static void proclear() {
		pro.clear();
	}
}
