package com.Demo.Project.testClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGExecutionOrder {
	
	@Test
	public void show() {
		
		System.out.println(" @Test This Method 5th ");
	}
	
	@Test
	public void gererate() {
		
		System.out.println("Hello Jenkins");
	}
	
	@Test
	public void hello() {
		
		System.out.println("Hola.......... Git");
	}
	
	

	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println(" @BeforeMethod This Method 4th ");
	}

	@AfterMethod
	public void afterMethod() {
		
		System.out.println(" @AfterMethod This Method 6th ");
	}

	@BeforeClass
	public void beforeClass() {
		
		System.out.println(" @BeforeClass This Method 3rd ");
	}

	@AfterClass
	public void afterClass() {
		
		System.out.println(" @AfterClass This Method 7th ");
	}

	@BeforeTest
	public void beforeTest() {
		
		System.out.println(" @BeforeTest This Method 2st ");
	}

	@AfterTest
	public void afterTest() {
		
		System.out.println(" @BeforeTest This Method 8th ");
	}

	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println(" @BeforeSuite This Method 1st ");
	}

	@AfterSuite
	public void afterSuite() {
		
		System.out.println(" @BeforeSuite This Method 9th ");
	}

}
