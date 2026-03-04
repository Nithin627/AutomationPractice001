package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.listeners.TestListener.class)
public class DemoTest001 {

	@Test(description = "Test...")
	public void test1() {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");

	}

}
