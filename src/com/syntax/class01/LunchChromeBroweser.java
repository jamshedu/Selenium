package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBroweser {

	public static void main(String[] args) throws InterruptedException {
		
		
		//For Windows users. drivers\\chromedriver.exe
				//Or \\Users\\syntax\\eclipse-workspace\\SeleniumBatchVI\\drivers\\chromedriver.exe
				
				
				//for Mac users drivers/chromedriver
				
				//Making connection to the driver
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
				
				//opening the browser by calling the constructor of ChromeDriver class and upcasting.
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.google.com");
				
				String url=driver.getCurrentUrl();
				System.out.println(url);
			
				System.out.println(driver.getTitle());
				
				Thread.sleep(3000);
				
				driver.close();
		
		
		
         
	}

}
