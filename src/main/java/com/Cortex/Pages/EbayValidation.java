package com.Cortex.Pages;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayValidation {
	
	WebDriver driver;
	 
    By SearchBox = By.xpath("//input[@type='text' and @placeholder='Search for anything']");
 
    By SearchButton = By.xpath("//input[@type='submit' and @value='Search']");
 
    By Result = By.xpath("(//*[contains(@class,'s-item__image-wrapper')])[2]");
 
    By Price = By.xpath("//*[@id='prcIsum']");
 
    public EbayValidation(WebDriver driver) {
        this.driver = driver;
    }
 
    // Set Product Name in textbox
    public void setProductName(String name) {
        driver.findElement(SearchBox).sendKeys(name);
    }
    
    // Click on Search button
    public void clickSearch() {
        driver.findElement(SearchButton).click();
    }
    
 // Click Product
    public void clickProduct() {
        driver.findElement(Result).click();
    }
    
 // Mouse over the product button
    public void MouseOverProduct() {
    	
    	WebElement we = driver.findElement(Result);
    	
    	JavascriptExecutor executor = (JavascriptExecutor)driver;
    	
    	executor.executeScript("arguments[0].click();", we);
    	
    }
    
    //Window handling
    public void switchToWindowIndex(int index) {
    	
    	Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowStrings = new ArrayList<>(windowHandles);
        String reqWindow = windowStrings.get(index);
        driver.switchTo().window(reqWindow);
    
    }
    
    //Get Product Price
    
    public void GetPrice() {
    	
    	String value = driver.findElement(Price).getText();
    	
    	System.out.println(value);
    }
 
    public void ProductSearch(String name) throws InterruptedException {
 
        // Fill name
        this.setProductName(name);
        
        this.clickSearch();
        
        Thread.sleep(5000);
        
        this.MouseOverProduct();
        
        this.switchToWindowIndex(1);
        
        this.GetPrice();
    }

}
