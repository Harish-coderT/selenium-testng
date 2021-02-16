package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	/*Setup system property for chrome
	Launch Chrome Browser
	Enter URL
	Login to app
	Google Title Test 
	Logout from app
	Close Browser
	Delete all cookies
	PASSED: googleTitleTest
	
	//multiple test cases -it randomly picks the test cases --it will create pair
	 
	
	@BeforeMethod
	@Test -1
	@AfterMethod
	
	@BeforeMethod
	@Test -2
	@AfterMethod
	
	@BeforeMethod
	@Test -3
	@AfterMethod
	
	*/
	
	
	//pre-conditions annotations -- starting with @before keyword
	@BeforeSuite //1
	public void setUp() {
		
		System.out.println("Setup system property for chrome");
		
	}
	
	@BeforeTest //2
	public void launchBrowser() {
		
		System.out.println("Launch Chrome Browser");
	}
	
	@BeforeClass //3
	public void enterUrl() {
		
		System.out.println("Enter URL");
	}
	
	@BeforeMethod //4
	public void login() {
		
		System.out.println("Login to app");
	}
	
	//Test annotation -- starting with test
	@Test //5
	public void googleTitleTest() {
		
		System.out.println("Google Title Test ");
		
	
	}
	
	@Test //5
	public void searchTest() {
		
		System.out.println("Search Test ");
		
	
	}
	//post-conditions annotations -- starting with @after keyword
	@AfterMethod //6
	public void logout() {
		
		System.out.println("Logout from app");
	}
	
	@AfterClass //7
	public void closeBrowser() {
		
		System.out.println("Close Browser");
	}
	
	@AfterTest //8
	public void deleteCookies() {
		
		System.out.println("Delete all cookies");
	}
	
	@AfterSuite //9
	public void reports() {
		
		System.out.println("Reports Generated");
	}
	
	
	

	
	
	

}
