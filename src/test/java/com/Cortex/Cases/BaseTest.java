package com.Cortex.Cases;	
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Cortex.Pages.EbayValidation;
import com.Cortex.Pages.GmailValidation;
	 
	public class BaseTest {
	 
	    public static WebDriver driver;
	    GmailValidation objLogin;
	    EbayValidation objLogin1;
	 
		@BeforeClass
	    public void setup() {
			
			String text = System.getProperty("user.dir");
			String text1 = text+"\\Drivers\\chromedriver.exe";
			String msg = text1.replace("\\", "\\\\");
	        System.setProperty("webdriver.chrome.driver",msg);
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	    }
	 
	    @AfterClass
	    public void close() {
	        driver.close();
	    }
	}

