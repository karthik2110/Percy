package com.Cortex.Cases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import com.Cortex.Pages.YahooValidation;

public class YahooTest extends BaseTest2 {
	 
	 YahooValidation objLogin;

		@Test
	    public void login() throws InterruptedException {
	 
	        // Create Login Page object
	        objLogin = new YahooValidation(driver);
	        
	        objLogin.login("srinitest9900@yahoo.com", "Srinitest9900");
	        
	        TimeUnit.SECONDS.sleep(5);
	        
	        objLogin.Invalidlogin("srinitest9900@yahoo.com", "123");
	 
	    }
	 
	}
