package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		ChromeOptions option= new ChromeOptions();
		//option.setHeadless(true);
	    option.addArguments("--headless"); 
		WebDriver driver=new ChromeDriver(option);
		
	    driver.get("https://demo.guru99.com/test/newtours/");
		System.out.println("Titel of the page:" +driver.getTitle());
		
		

	}

}
