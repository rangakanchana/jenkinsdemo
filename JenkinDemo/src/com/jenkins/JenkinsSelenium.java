package com.jenkins;

import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class JenkinsSelenium {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite(){
		
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void verifyTitle(){
		
		assertTrue(driver.getTitle().contains("Facebook"));
	}
	
	
	

}
