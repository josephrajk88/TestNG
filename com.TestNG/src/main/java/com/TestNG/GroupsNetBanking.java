package com.TestNG;

import org.testng.annotations.Test;

public class GroupsNetBanking {

	@Test
	public void WebLoginBanking ()
	{
		System.out.println("WebLoginBanking");
	}
	
	@Test (groups = {"SmokeTesting"})
	public void MobileLoginBanking ()
	{
		System.out.println("MobileLoginBanking");
	}
}
