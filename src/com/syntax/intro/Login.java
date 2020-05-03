package com.syntax.intro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws IOException {
	
		String directory=System.getProperty("user.dir");
		
		System.setProperty("webdrive.gecko.driver",directory+ "drivers/chromedriver");
		
		WebDriver driver= new FirefoxDriver();
		String filePath =directory +"\\proparties\\Testdata.proparties";
		FileInputStream file =new FileInputStream(filePath);
		
		
		Properties prop = new Properties();
		prop.load(file);
		
		String urlm = prop.getProperty("url");
		String username= prop.getProperty("username");
		String pass= prop.getProperty("password");
		
		driver.get(urlm);
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(pass);
		driver.findElement(By.name("Submit")).click();
		
//		
//		
//		public static void main(String[] args) throws Exception {
//			String diractory = System.getProperty("user.dir");
//			System.setProperty("webdriver.gecko.driver", diractory + "\\drivers\\geckodriver.exe");
//			WebDriver driver = new FirefoxDriver();
//			String filepath = diractory + "\\properties\\Testdata.properties";
//			FileInputStream file = new FileInputStream(filepath);
//			Properties prop = new Properties();
//			prop.load(file);
//			String urlm = prop.getProperty("url");
//			String usern = prop.getProperty("username");
//			String pass = prop.getProperty("password");
//			driver.get(urlm);
//			driver.findElement(By.name("txtUsername")).sendKeys(usern);
//			driver.findElement(By.name("txtPassword")).sendKeys(pass);
//			driver.findElement(By.name("Submit")).click();
//		}

		
		
		
		
		
		
		
		
		
		

	}

}
