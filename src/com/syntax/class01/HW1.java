package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
         WebDriver drive = new ChromeDriver();
         
         drive.get("https://www.amazon.com");
         String str =drive.getTitle();
         System.out.println(str);
         
         
	}

}
