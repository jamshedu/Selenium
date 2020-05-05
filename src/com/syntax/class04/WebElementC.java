package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementC {
	
	
	public static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
     public static String user="Tester";
     public static String password="test";
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver drive = new ChromeDriver();
		drive.get(url);
		
		WebElement userName=drive.findElement(By.xpath("//input[contains(@id,'username')]"));
		userName.sendKeys(user);
		   Thread.sleep(3000);
	       userName.clear();
	       userName.sendKeys(user);
		
		WebElement pass=drive.findElement(By.cssSelector("input[name*='$password']"));
				pass.clear();
				Thread.sleep(3000);
				pass.sendKeys(password);
				
				WebElement loginBtn=drive.findElement(By.cssSelector("input[value='Login']"));
                 loginBtn.click();
                 
				boolean logoIsDisplayed=drive.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
				
				if(logoIsDisplayed) {
					System.out.println("Logo is Displayed,Test Case is passed");
				}else {
					System.out.println("Test Case is fail");
				}
				
				WebElement loginInfo=drive.findElement(By.xpath("//div[@class='login_info']"));
				String text=loginInfo.getText();
				if (text.contains("Tester")) {
					System.out.println("User Successfully logged in test Case is passed");
				}else {
					System.out.println("The test Case is fail");
				}
				
				
				
				
				
				
				}

				
				
}


