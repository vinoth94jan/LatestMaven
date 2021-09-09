package org.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProject {
	
public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vinot\\eclipse-workspace\\LatectMaven\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("hi");
    	driver.findElement(By.cssSelector("#pass")).sendKeys("dddt");
		
	}
}
