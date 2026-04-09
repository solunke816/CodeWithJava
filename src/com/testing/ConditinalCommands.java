package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditinalCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		 WebElement email=driver.findElement(By.xpath(".//*[@id='email']"));
		 WebElement pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		 
		 if(email.isDisplayed() && email.isEnabled()) {
			 email.sendKeys("abcd@gmail.com");
		 }
		 
		 if (pass.isDisplayed() && pass.isEnabled()){
			 pass.sendKeys("pass");
		 }


	}

}
