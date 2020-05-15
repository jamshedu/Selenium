package com.syntax.practice;





import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HomeWork1 extends CommonMethods {
	
	/**
	 * Using Function
	 * @param args
	 */

	public static void main(String[] args) {
		
		setUp();
	WebElement firsName  =	driver.findElement(By.id("u_0_m"));
	sendText(firsName, ConfigsReader.getProperty("name"));	
		
	WebElement lastName=driver.findElement(By.cssSelector("input[name='lastname']"));
	sendText(lastName, ConfigsReader.getProperty("lastname"));	
	
	WebElement phone=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	sendText(phone, ConfigsReader.getProperty("phone"));	
		
	WebElement pass=driver.findElement(By.name("reg_passwd__"));
	sendText(pass, ConfigsReader.getProperty("password"));	
	
	WebElement month=driver.findElement(By.id("month"));
	selectDdValue(month, "Mar");
	WebElement day=driver.findElement(By.id("day"));
	selectDdValue(day, "11");
	WebElement year=driver.findElement(By.id("year"));
	selectDdValue(year, "1988");
	
	List<WebElement> gender=driver.findElements(By.cssSelector("input[name='sex']"));
     clickRadioOrCheckbox(gender, "2");	
     //click();
		
		
		
	}

}
