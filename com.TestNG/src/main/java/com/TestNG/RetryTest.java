package com.TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
	
	@Test   //Retry.class
	public void method1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void method2()
	{
	Assert.assertEquals(true, true);
	}

}
