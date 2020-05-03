package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksOfbay {
	
	//public static String url="https://www.ebay.com/";
     
	

	public static void main(String[] args) {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.ebay.com/");
		
		List<WebElement>allLinks=drive.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		
		int count =0;
		for (WebElement link:allLinks) {
			String text=link.getText();
			if (!text.isEmpty()) {
				System.out.println(text);
				count++;
			}
		}
		System.out.println("Total number of link with text is ::"+count);
		
		drive.quit();
		

	}

}
