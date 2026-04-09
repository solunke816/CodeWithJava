package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {

	public static void main(String[] args) {
	 
		System.setProperty("webdriver.chrome.driver","D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");//Open the URL 
       
       driver.findElement(By.name("userName")).sendKeys("Mercury");
       driver.findElement(By.name("password")).sendKeys("Mercury");
       driver.findElement(By.name("submit")).click();

    String exp_title="Login: Mercury Tours";
    String act_title=driver.getTitle();
    
    driver.manage().window().maximize(); //mmaximize page size
    
     if(exp_title.equals(act_title)==true)	 
     {
     System.out.println("Test Pass");
     }
     else
     {System.out.println("Test Faild");
     }
	}

}
