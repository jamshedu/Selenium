package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;

import com.syntax.utils.BaseClass;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=BaseClass.setUp();//Bellow code is for UItestPractice.
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		//Handling simple alert/PopUps
		Alert simpleAlert=driver.switchTo().alert();
		String simpleText=simpleAlert.getText();
		System.out.println("This is a simple Alert text:: "+simpleText);
		Thread.sleep(1000);
		simpleAlert.accept();
		Thread.sleep(1000);
		
		
		//Handling confirmation Alert
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		String confirmText=confirmAlert.getText();
		System.out.println("This is confirm text: "+confirmText);
		Thread.sleep(1000);
		confirmAlert.dismiss();
		Thread.sleep(1000);
		
		//Handling Prompt alerts /confirmation alerts by providing some confirmation messsage.
		String name="Alex";
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert =  driver.switchTo().alert();
	    System.out.println("This is  Prompt alert text::"+promptAlert.getText());
		promptAlert.sendKeys(name);
		promptAlert.accept();
		String text=driver.findElement(By.xpath("//div[@id='demo']")).getText();
		System.out.println("Text added to alert box::"+text);
		
		if (text.contains(name)) {
			System.out.println("Text "+name+" successfully added");
		}else {
			System.out.println("Text "+name+"was not entered");
		}
		
		BaseClass.tearDown();
		
		
		
		
		
		
		
		
		
		
		
		
		
		//simpleAlert.accept();
		
		BaseClass.tearDown();
	}

}
