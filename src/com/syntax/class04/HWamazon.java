package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWamazon {
	
	public static String url="https://www.amazon.com/";

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver drive = new ChromeDriver();
		drive.get(url);
		
		List<WebElement>list=drive.findElements(By.tagName("a"));
		int count =0;
		for(WebElement link:list) {
			String str=link.getText();
			if(!str.isEmpty()) {
				System.out.println(str);
				count++;
			}
		}
		System.out.println(count);

	}

}
