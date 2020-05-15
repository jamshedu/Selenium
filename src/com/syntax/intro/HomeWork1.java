package com.syntax.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
	 driver.findElement(By.partialLinkText("Alerts & Modals")).click();
	driver.findElement(By.partialLinkText("Javascript Alerts")).click(); 
	driver.findElement(By.className("button[class='btn btn-default']"));
	
	
	}

}
