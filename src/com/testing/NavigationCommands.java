package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	public static void main(String []args) {
	System.setProperty("webdriver.chrome.driver","D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	 
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().back();
	
 }
}
