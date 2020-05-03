package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver driver=new ChromDriver();-->this is not good way to stared.
		
		
	      System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();// go ahead and open chrome browser
		
		driver.get("https://www.facebook.com");
		
		
		String url=driver.getCurrentUrl();
		String expected="https://www.facebook.com";
		
		if(url.equalsIgnoreCase(expected)) {
			String title=driver.getTitle();
			System.out.println(title);
		}else {
			System.out.println("Wrong url input");
		}
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
