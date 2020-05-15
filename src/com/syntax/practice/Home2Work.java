package com.syntax.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class Home2Work extends BaseClass {
	
	
	
	/* 
	 * TC 2: Delete Employee 
	 * Open chrome browser Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth” 
	 * Login into the application 
	 * Add Employee 
	 * Verify Employee has been added 
	 * Go to Employee List 
	 * Delete added Employee Quit the browser
	 */

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
//		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
//	System.setProperty("webdriver.chrome.driver", "drivers/chromedr
		//	WebDriver driver = new ChromeDriver();
		
		
	 driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
	driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));	
		driver.findElement(By.id("btnLogin")).click();
	WebElement pinLink=CommonMethods.waitForClickability(driver.findElement(By.linkText("PIM")));
		pinLink.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add Employee")).click();
		//Add an Employee
		
		String firstName="Aaaaa";
		String lastName="Baaaa";
		//String employeeID="3333";
		driver.findElement(By.id("firstName")).sendKeys( firstName);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastName);
		
		//grab the employee ID. for later use
		String  employeeID=driver.findElement(By.id("employeeId")).getAttribute("value");
		 driver.findElement(By.id("btnSave")).click();
		 Thread.sleep(2000);
		String text= driver.findElement(By.id("profile-pic")).getText();
		System.out.println(text);
		
		if(text.equals(firstName+" "+lastName)) {
			System.out.println("The test Case is passed");
		}else {
			System.out.println("The test Case is failed ");
		}
		
		//navigate to employee list
		driver.findElement(By.linkText("Employee List")).click();
		
		//define flag variable
		
		boolean found=false;
		
		while(!found) {
			
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		
		for(int i=1; i<rows.size(); i++) {
		String rowText=	rows.get(i-1).getText();
		System.out.println(rowText);
		if(rowText.contains(employeeID)) {
			found=true;
		}
		
		}
		
		
		
		
		}
		
		
		
		
		
		
		}
		
		
		
	}


