package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OneCoolSummer {

	public static void main(String[] args) {
		

		
		
		System.setProperty("webdriver.gecko.driver","drivers/geckodriver" );
		
		WebDriver drive = new FirefoxDriver();
		
		drive.get("");

	}

}
