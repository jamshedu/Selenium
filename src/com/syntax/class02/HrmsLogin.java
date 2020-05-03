package com.syntax.class02;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



class HrmsLogin {

	public static void main(String[] args) throws InterruptedException {
		
		String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver=new ChromeDriver();

		driver.get(url);
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin123");
		driver.findElement(By.className("button")).click();
		
		
		Thread.sleep(3000);
		driver.close();
	
		

	}

}
