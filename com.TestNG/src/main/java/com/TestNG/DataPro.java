package com.TestNG;

import org.testng.annotations.DataProvider;

public class DataPro {
	
	@DataProvider(name = "dataprovider")
	public Object[][] getCredentials() {
		return new Object[][] {{ "abc@gmail.com", "12345"}, { "123@gmail.com", "456789"},
				{ "1789@gmail.com", "56489"}};
	}
}
