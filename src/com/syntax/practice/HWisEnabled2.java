package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.CommonMethods;

public class HWisEnabled2 extends CommonMethods{

	public static void main(String[] args) {
		
		
		
		setUp();
		driver.findElement(By.cssSelector("a[href='/dynamic_controls']")).click();
		driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
		WebElement sendText= driver.findElement(By.cssSelector("input[type='text']"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        wait.until(ExpectedConditions.elementToBeClickable(sendText));
        sendText.sendKeys("Hello");
        String value = sendText.getAttribute("value");
        System.out.println(value);
        
        if (value.equals("Hello")) {
        	System.out.println("The test Case is Passed ");
        }else {
        	System.out.println("The test Case  is failed ");
        }
//        boolean isDisplayed = sendText.isDisplayed();
//        if(isDisplayed) {
//        	System.out.println("passed");
//        }else {
//        	System.out.println("failed");
//        }
//        
        
	}

}
