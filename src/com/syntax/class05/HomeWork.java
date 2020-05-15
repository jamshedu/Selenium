package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork {

	
	public static String url="https://www.facebook.com/";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		WebElement month=driver.findElement(By.id("month"));
		WebElement day=driver.findElement(By.id("day"));
	     WebElement year=driver.findElement(By.id("year"));
		Select select1 = new Select(month);
		Select select2 = new Select(day);
		Select select3 = new Select(year);
		select1.selectByIndex(12);
		select2.selectByIndex(31);
		select3.selectByIndex(115);
		System.out.println(select1.isMultiple());
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
