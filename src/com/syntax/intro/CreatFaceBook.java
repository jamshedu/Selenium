package com.syntax.intro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreatFaceBook {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=null;
		
		String filePath="/Users/dzhamshedumarov/eclipse-workspace/Selenium1/configs/testdata";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		String str1=prop.getProperty("browser");
		System.out.println(str1);
		String str2=prop.getProperty("url");
		//System.out.println(str2);
		String str3=prop.getProperty("email");
		String str4=prop.getProperty("password");
		System.out.println(str2);
		System.out.println(str3);
	    System.out.println(str4);
	    
	    switch(str1) {
	    case "chrome":
	    	System.setProperty("webdriver.gecko.driver", "drivers/chromedriver");
	    	
	    	 driver = new ChromeDriver();
	    	break;
	    case "firefox":
	    	System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
	    	 driver=new FirefoxDriver();
	    	 break;
	    	}
	    driver.get(prop.getProperty("url"));
	    
	   
//	    driver.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys(prop.getProperty("name"));;
//		driver.findElement(By.xpath("//*[@id='u_0_o']")).sendKeys(prop.getProperty("lastname"));;
//		driver.findElement(By.xpath("//*[@id='u_0_r']")).sendKeys(prop.getProperty("email"));
//		driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys(prop.getProperty("password"));
//		driver.findElement(By.xpath("//*[@id='month']")).sendKeys(prop.getProperty("month"));
//		driver.findElement(By.xpath("//*[@id='day']")).sendKeys(prop.getProperty("day"));
	    
	    driver.findElement(By.id("u_0_m")).sendKeys(prop.getProperty("name"));;
		driver.findElement(By.id("u_0_o")).sendKeys(prop.getProperty("lastname"));;
		driver.findElement(By.id("u_0_r")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("u_0_w")).sendKeys(prop.getProperty("password"));
//		driver.findElement(By.id("month")).sendKeys(prop.getProperty("month"));
//		driver.findElement(By.id("day")).sendKeys(prop.getProperty("day"));
		
		driver.findElement(By.id("u_0_13")).click();
		
		
		//driver.quit();
		
		
		
		
		
		

	}

}
