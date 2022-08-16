package com.Cortex.Cases;	
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Cortex.Pages.EbayValidation;
import com.Cortex.Pages.GmailValidation;
	 
	public class BaseTest1 {
	 
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
	        driver.get("https://www.ebay.com/");
	    }
	 
	    @AfterClass
	    public void close() {
	        driver.close();
	    }
	}

