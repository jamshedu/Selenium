package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInEmail {

	public static void main(String[] args) {
		
		
		System.setProperty(" webdriver.chrome.driver","/Users/dzhamshedumarov/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("email")).sendKeys("jamshed.umarov@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("01061988u");
		

	}

}
