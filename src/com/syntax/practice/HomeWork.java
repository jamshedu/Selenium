package com.syntax.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.CommonMethods;

public class HomeWork extends CommonMethods {

	public static void main(String[] args) {
		
		
		setUp();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/dynamic_controls']")).click();
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
         
		WebElement addText=driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
		
		WebDriverWait wait =new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(addText));
		
		addText.sendKeys("Morning");
		driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
		WebElement enterText=driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
	     boolean isDisplayed=enterText.isDisplayed();
	     System.out.println("Succssfully enter: "+isDisplayed);
	     if (isDisplayed==true) {
	    	 System.out.println("The test Case is passed.");
	     }else {
	    	 System.out.println("The test Case is failed.");
	     }
	     driver.close();
	}

}
