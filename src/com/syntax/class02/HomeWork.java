package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		

		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver=new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("Register here")).click();
		driver.findElement(By.name("firstName")).sendKeys("Jamshed");
		driver.findElement(By.name("lastName")).sendKeys("Umarov");
		driver.findElement(By.name("phone")).sendKeys("333020303");
		driver.findElement(By.id("userName")).sendKeys("jamshed1988@yahoo.com");
		driver.findElement(By.name("address")).sendKeys("3333Artesia bavd");
		driver.findElement(By.name("postalCode")).sendKeys("9090");
		Thread.sleep(3000);
		driver.close();
		
	}

}
