//https://testng.org/testng-eclipse-update-site //download in Eclipse-Install New Software

package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test
	public void Test1()
	{
		System.out.println("Test Case 1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test Case 2");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest");
	}


}
