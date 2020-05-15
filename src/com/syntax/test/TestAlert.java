package com.syntax.test;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class TestAlert {

	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriver driver =	 BaseClass.setUp();//Below code is for UItes
		
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		
		//driver.findElement(By.id("confirm")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(1000);
		String sipleAlerText=alert.getText();
		System.out.println("This is simple alert text:: "+sipleAlerText);
		Thread.sleep(1000);
		alert.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(1000);
		Alert confimAlert=driver.switchTo().alert();
		String confirmText=confimAlert.getText();
		System.out.println("Alert get Text ::"+confirmText);
		Thread.sleep(1000);
		confimAlert.dismiss();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		driver.findElement(By.id("prompt")).click();
		Alert prompAlert=driver.switchTo().alert();
	    System.out.println("This is promp alert text "+prompAlert.getText());
	    prompAlert.sendKeys("Alex");
	    prompAlert.accept();
		String text= driver.findElement(By.xpath("//div[@id='demo']")).getText();
		System.out.println(text);
		if(text.contains("Alex")) {
			System.out.println("Text was succssfully added");
		}else{
			System.out.println(" Text not enter");
		}
		
		
		
		
		
		
		
		
	BaseClass.tearDown();	
		
		
		
	}
	
	
	
}
