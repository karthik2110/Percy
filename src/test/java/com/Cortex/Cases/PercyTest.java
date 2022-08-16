package com.Cortex.Cases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.percy.selenium.Percy;

public class PercyTest {
  private static WebDriver driver;
  private static Percy percy;

  public static void main(String[] args) {
	  
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\karthik paperflite\\eclipse-workspace\\Percy\\Drivers\\geckodriver.exe");
    FirefoxOptions options = new FirefoxOptions();
    options.setHeadless(true);
    driver = new FirefoxDriver(options);
    percy = new Percy(driver);
    driver.get("https://app.paperflite.com");
    percy.snapshot("Java example");
  }
}

