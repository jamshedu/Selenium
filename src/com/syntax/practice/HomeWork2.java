package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HomeWork2 extends CommonMethods {

	public static void main(String[] args) {
		
		
		setUp();
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		sendText(userName, ConfigsReader.getProperty("username"));
		WebElement pass=driver.findElement(By.cssSelector("input[id='txtPassword']"));
        sendText(pass, ConfigsReader.getProperty("password"));
        
        WebElement login=driver.findElement(By.id("btnLogin"));
        click(login);
        
        WebElement pm=driver.findElement(By.xpath("//b[text()='PIM']"));
        click(pm);
        
       WebElement add= driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
       click(add);
       WebElement firstName=  driver.findElement(By.cssSelector("input[name='firstName']"));
       sendText(firstName, ConfigsReader.getProperty("name"));
      WebElement lastName= driver.findElement(By.xpath("//input[@name='lastName']"));
       sendText(lastName, ConfigsReader.getProperty("lastname"));
       
       WebElement iD=driver.findElement(By.id("employeeId"));
       sendText(iD, ConfigsReader.getProperty("EmployeeId"));
      
     WebElement save=  driver.findElement(By.id("btnSave"));
      click(save);
//       
       
       
	}

}
