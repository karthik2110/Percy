package com.Cortex.Cases;

import org.testng.annotations.Test;

import com.Cortex.Pages.EbayValidation;

public class EbayTest extends BaseTest1 {
	
	 EbayValidation objLogin1;

		@Test
	    public void Price() throws InterruptedException {
	 
	        // Create Login Page object
	        objLogin1 = new EbayValidation(driver);
	        
	        objLogin1.ProductSearch("Electric Guitar");
	 
	    }

}
