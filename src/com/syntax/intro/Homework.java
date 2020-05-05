package com.syntax.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
	
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

			

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\'txtPassword\']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		WebElement log= driver.findElement(By.cssSelector("a[id='welcome']"));
		
		String str=log.getText();
        System.out.println(str);
        if (str.contains("hi")) {
        	System.out.println("User is logged in the test case passed");
        }else {
        	System.out.println("The test Case is failed");
        }
		

	}

}
