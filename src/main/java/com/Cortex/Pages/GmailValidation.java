package com.Cortex.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailValidation {
	
	 WebDriver driver;
	 
	    By userName = By.id("identifierId");
	 
	    By password = By.xpath("//input[@type='password']");
	 
	    By AccountID = By.xpath("//*[@aria-label='Google Account: itsmevas9900@gmail.com']");
	 
	    By Next = By.xpath("//span[text()='Next']");
	    
	    By Error = By.xpath("//*[text()='Wrong password. Try again or click Forgot password to reset it.']");
	    
	    By Signout = By.xpath("//*[text()='Sign out']");
	 
	    public GmailValidation(WebDriver driver) {
	        this.driver = driver;
	    }
	 
	    // Set Email in textbox
	    public void setUserName(String email) {
	        driver.findElement(userName).sendKeys(email);
	    }
	 
	    // Set password in password textbox
	    public void setPassword(String pwd) {
	        driver.findElement(password).sendKeys(pwd);
	    }
	 
	    // Click on Next button
	    public void clickLogin() {
	        driver.findElement(Next).click();
	    }
	 
	    // Get the Error message of Login Page
	    public boolean VerifyErrorMessage() {
	        return driver.findElement(Error).isDisplayed();
	    }
	    
	    public boolean VerifyAccountName() {
	        return driver.findElement(AccountID).isDisplayed();
	    }
	    
	 // Click on Next button
	    public void clickSignout() {
	        driver.findElement(Signout).click();
	    }
	 
	    public void login(String strUserName, String strPasword) {
	 
	        // Fill user name
	        this.setUserName(strUserName);
	        
	        this.clickLogin();
	 
	        // Fill password
	        this.setPassword(strPasword);
	 
	        // Click Login button
	        this.clickLogin();
	        
	        this.VerifyAccountName();
	        
	        this.clickSignout();
	    }
	    
	    public void Invalidlogin(String strUserName, String strPasword) {
	   	 
	        // Fill user name
	        this.setUserName(strUserName);
	        
	        this.clickLogin();
	 
	        // Fill password
	        this.setPassword(strPasword);
	 
	        // Click Login button
	        this.clickLogin();
	        
	        this.VerifyErrorMessage();
	        
	    }

}
