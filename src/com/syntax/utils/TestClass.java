package com.syntax.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass extends BaseClass{

	public static void main(String[] args) {
		
		setUp();
		String title=driver.getTitle();
		System.out.println(title);
		tearDown();


	}

}
