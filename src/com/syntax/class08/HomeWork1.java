package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class HomeWork1 {

	public static void main(String[] args) {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
         driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
         driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
         driver.findElement(By.id("ctl00_MainContent_login_button")).click();
         
         String customer="Susan McLaren";
        List<WebElement> tabel= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
         for(int i=1; i<tabel.size();i++) {
        	String text= tabel.get(i+1).getText();
        	if(text.contains(customer)) {
        		System.out.println("The customer by the name of "+text+" is present ");
        		
        		driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[13]")).get(i).click();
                
                
        		break;
        	}
         }
        

         
         
         
         
         
	}

}
