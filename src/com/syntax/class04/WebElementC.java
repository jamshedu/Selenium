package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementC {
	
	
	public static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver drive = new ChromeDriver();
		drive.get(url);
		
		WebElement userName=drive.findElement(By.xpath("//input[contains(id,'username')]"));
		userName.sendKeys("Tester");
		//Thread.sleep(3000);
		
		userName.clear();
		
		WebElement pass=drive.findElement(By.cssSelector("input[name*='$password']"));
				pass.clear();
				//Thread.sleep(3000);
                
				pass.sendKeys("test");
				WebElement loginBtn=drive.findElement(By.cssSelector("input[value='Login']"));

				
				
				}

				
				
}


