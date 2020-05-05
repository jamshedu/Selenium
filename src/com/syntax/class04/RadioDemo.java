package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {
	
	public static String url="https://demoqa.com/automation-practice-form/";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver drive = new ChromeDriver();
		drive.get(url);
		
		WebElement maleRadioB=drive.findElement(By.xpath("//input[@id='sex-0']"));
		System.out.println();
		
		System.out.println(maleRadioB.isDisplayed());
		System.out.println(maleRadioB.isEnabled());
		System.out.println("Radio buttom is selected "+maleRadioB.isSelected());
		
		maleRadioB.click();
		
		List<WebElement>listRadio=drive.findElements(By.xpath("//input[@name='profession']"));
		
		int listZise=listRadio.size();
		System.out.println("Size of CheckBoxs: "+listZise);
		
		String valueToBeselected="Manual Tester";
		//drive.findElement(By.xpath("//input[@id='sex-0']")).getAttribute("value");
		for(WebElement proList:listRadio) {
			
			if( proList.isEnabled()) {
				String value=proList.getAttribute("value");
				System.out.println(value);
				if (value.equals(valueToBeselected)) {
					proList.click();
					break;
				}
			}
			
		}
		
		
		
		
		
		
		
	}

}
