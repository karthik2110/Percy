package com.Cortex.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahooValidation {
	
	 WebDriver driver;
	 
	    By userName = By.name("username");
	 
	    By password = By.name("password");
	 
	    By AccountID = By.xpath("(//*[@alt='Profile image'])[1]");
	 
	    By Next = By.id("login-signin");
	    
	    By Error = By.xpath("//*[contains(text(),'Invalid password')]");
	    
	    By Signout = By.id("profile-signout-link");
	    
	    By MailSelection = By.xpath("//*[@title='Mail']");
	    
	    By Signin = By.xpath("//*[@title='Sign In']");
	 
	    public YahooValidation(WebDriver driver) {
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
	    
	 // Click on Signin button
	    public void clickSignin() {
	        driver.findElement(Signin).click();
	    }
	    
	 // Click on Mail Selection button
	    public void MailSelection() {
	    	
	    	WebElement we = driver.findElement(MailSelection);
	    	
	    	JavascriptExecutor executor = (JavascriptExecutor)driver;
	    	
	    	executor.executeScript("arguments[0].click();", we);
	    	
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
	    	
	    	driver.findElement(AccountID).click();
	    	
	        driver.findElement(Signout).click();
	    }
	    
	 // Click AccountName
	    public void clickUsername() {
	    	
	    	driver.findElement(userName).click();
	    }
	 
	    public void login(String strUserName, String strPasword) throws InterruptedException {
	 
	        // Fill user name
	        this.setUserName(strUserName);
	        
	        this.clickLogin();
	 
	        // Fill password
	        this.setPassword(strPasword);
	 
	        // Click Login button
	        this.clickLogin();
	        
	        this.MailSelection();
	        
	        Thread.sleep(5000);
	        
	        this.VerifyAccountName();
	        
	        this.clickSignout();
	    }
	    
	    public void Invalidlogin(String strUserName, String strPasword) {
	    	
	    	this.clickSignin();
	    	
	    	this.clickUsername();
	   	 
	        // Fill password
	        this.setPassword(strPasword);
	 
	        // Click Login button
	        this.clickLogin();
	        
	        this.VerifyErrorMessage();
	        
	    }

}