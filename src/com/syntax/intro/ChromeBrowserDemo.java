package com.syntax.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.safari.com");
		drive.navigate().refresh();
		
		drive.navigate().to("https:www.google.com");
		
		drive.navigate().back();
		
		String url=drive.getCurrentUrl();
		System.out.println(url);
		
		System.out.println(drive.getTitle());
		
		Thread.sleep(3000);
		drive.navigate().forward();

		drive.close();
	}

}
