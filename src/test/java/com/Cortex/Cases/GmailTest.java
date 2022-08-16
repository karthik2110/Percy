package com.Cortex.Cases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.Cortex.Pages.GmailValidation;

public class GmailTest extends BaseTest {
	 
	 GmailValidation objLogin;

		@Test
	    public void login() throws InterruptedException {
	 
	        // Create Login Page object
	        objLogin = new GmailValidation(driver);
	        
	        objLogin.login("itsmevas9900@gmail.com", "Vas9900#");
	        
	        TimeUnit.SECONDS.sleep(5);
	        
	        objLogin.Invalidlogin("itemevas9900@gmail.com", "123");
	 
	    }
	 
	}
