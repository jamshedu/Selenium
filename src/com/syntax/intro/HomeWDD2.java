package com.syntax.intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;



public class HomeWDD2 extends BaseClass{

	
	public static void main(String[] args) throws InterruptedException {
		
//		TC 2: Select and Deselect values
//		Open chrome browser
//		Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//		Click on “Input Forms” links
//		Click on “Select Dropdown List” links
//		Select value from “Select List Demo” section
//		Verify value has been selected
//		Select 4 options from “Multi Select List Demo”
//		Deselect 1 of the option from the dd
//		Quit browser

	
		
          setUp();
		driver.findElement(By.className("dropdown-toggle")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Select Dropdown List")).click();
//		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.id("select-demo"));
		element.click();
		Select select= new Select(element);
		select.selectByValue("Monday");
		
		List<WebElement>web=select.getOptions();
		for(WebElement webElement:web) {
			String text=webElement.getText();
			if (text.equals("Monday")) {
				if(webElement.isSelected()) {
					System.out.println("Monday is selected test Case is passed");
				}else {
					System.out.println("Test Case is fail");
				}
				}
		}
		
		WebElement element1=driver.findElement(By.id("multi-select"));
		Select select1 = new Select(element1);
		for(int i = 0; i<4;i++) {
			select1.selectByIndex(i);
		}
		select.selectByIndex(1);
		select.selectByIndex(2);
		select.selectByIndex(3);
		select.selectByIndex(4);
		
		select1.deselectByIndex(1);
		BaseClass.tearDown();
	}

}
