package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","drivers/geckodriver" );
		
		WebDriver drive = new FirefoxDriver();
		drive.get("https://www.redfin.com/");
		String url ="https://www.redfin.com";
		
		if (url.equalsIgnoreCase("https://www.redfin.com")) {
			System.out.println("Navigated passed");
		}else {
			System.out.println("Navigated Fail");
		}
		drive.close();
	}

}