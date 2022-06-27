package com.TestNG;

import org.testng.annotations.Test;

public class GroupsFacebookLogin {
	
	@Test (groups = {"SmokeTesting"})
	public void WebLogin ()
	{
		System.out.println("WebLogin");
	}
	
	@Test
	public void MobileLogin ()
	{
		System.out.println("MobileLogin");
	}

}
