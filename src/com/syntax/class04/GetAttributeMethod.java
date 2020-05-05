package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		
		
		 String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		
		
		WebElement userName =driver.findElement(By.name("txtUsername"));
		System.out.println(userName);
		userName.sendKeys("Admin");
		String text= userName.getAttribute("value");
		System.out.println(text);
//         
//		driver.findElement(By.cssSelector("input[name*='txtUser']")).sendKeys("Admin");
//		driver.findElement(By.cssSelector("input[name*='txtPass']")).sendKeys("Hum@nhrm123");
//		driver.findElement(By.cssSelector("input[id^='btn']")).click();
//		
		
		
		
		
		
		
		
		
		
		
		
	}

}
