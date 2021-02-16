package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C://Program Files//eclipse//chromedriver.exe");
	    driver = new ChromeDriver(); //Launch Chrom
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("http://www.google.com");
	}
	
	@Test
	public void googleTitleTest() {
		
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void googleLogoTest() {
		
		Boolean b = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	}
	
	
	@Test
	public void linkTest() {
		
		Boolean b = driver.findElement(By.linkText("Gmal")).isDisplayed();
	}//
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	

}
