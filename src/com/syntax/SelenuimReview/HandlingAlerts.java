package com.syntax.SelenuimReview;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.seleniumframework.com/Practiceform/");
         WebElement alertsButton= driver.findElement(By.id("alert"));
         alertsButton.click();
         Thread.sleep(2000);
         Alert alert = driver.switchTo().alert();
         alert.accept();
         WebElement timeButton=driver.findElement(By.xpath("//button[@id='timingAlert']"));
         
         timeButton.click();
         WebDriverWait wait=new WebDriverWait(driver, 20);
         wait.until(ExpectedConditions.alertIsPresent());
         Thread.sleep(2000);
         alert.accept();
         
	}

}
