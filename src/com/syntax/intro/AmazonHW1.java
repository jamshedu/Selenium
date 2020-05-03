package com.syntax.intro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHW1 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=null;
		String filePath="/Users/dzhamshedumarov/eclipse-workspace/JavaProjects/configs/configurarions";
		
		FileInputStream fis= new FileInputStream(filePath);
			
		Properties prop=new Properties();
		prop.load(fis);
		String  name=prop.getProperty("browser");
			System.out.println(name);
		String name1=prop.getProperty("url");
			
			String name2=prop.getProperty("email");
			String name3=prop.getProperty("password");
			System.out.println(name1);
			System.out.println(name2);
			System.out.println(name3);
			
			switch (name) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
				driver=new ChromeDriver();
			   break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver","drivers/geckodriver 2");
				driver =new FirefoxDriver();
				break;
				}
			 driver.get(prop.getProperty("url"));
			 
			 driver.findElement(By.id("nav-link-accountList")).click();
			 driver.findElement(By.id("createAccountSubmit")).click();
			 driver.findElement(By.id("ap_customer_name")).sendKeys(prop.getProperty("name"));
			 driver.findElement(By.id("ap_email")).sendKeys(prop.getProperty("email"));;
			 driver.findElement(By.id("ap_password")).sendKeys(prop.getProperty("password"));
			 driver.findElement(By.id("ap_password_check")).sendKeys(prop.getProperty("password"));
			
			
	}

}
