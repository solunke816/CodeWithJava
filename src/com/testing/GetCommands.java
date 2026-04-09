package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		System.out.println(driver.getCurrentUrl());//get URL Of page
		System.out.println(driver.getTitle());//titel of page
		String text=driver.findElement(By.xpath("")).getText();
		System.out.println(text);
		driver.close(); // close the page
		
	}

}
