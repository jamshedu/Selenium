package com.syntax.test;





import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;
import com.syntax.utils.Exceptions;

public class TaskFacebook extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
	setUp();
	
	WebElement firsName=driver.findElement(By.name("firstname"));
	sendText(firsName, "jamshed");
	
	WebElement lastName=driver.findElement(By.name("lastname"));
	sendText(lastName, "Umarov");
	
	WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	sendText(email, "jameshed@yahoo.com");
	
	WebElement reEmail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	sendText(reEmail, "jameshed@yahoo.com");
	
	WebElement password=driver.findElement(By.xpath("//input[@id='u_0_w']"));
	sendText(password, "01061988");
	
	
	 WebElement month = driver.findElement(By.cssSelector("select#month"));
	 Select selectMonth = new Select(month);

	 List<WebElement> options = selectMonth.getOptions();
	 
	 System.out.println("The size of month are "+ options.size());
	 

	// selectMonth.selectByVisibleText("Jan");
	 for (WebElement option : options) {
		String textMonth = option.getText();
		System.out.println(textMonth);
		if(textMonth.equals("Jan")) {
			option.click();
		}
	}
	WebElement day= driver.findElement(By.cssSelector("select#day"));
	Select selectDay = new Select(day);
	List<WebElement> option1=selectDay.getOptions();
	System.out.println("The size of the days are "+option1.size());
	
	//selectDay.selectByVisibleText("6");
	      String dayNumber="6";
	for (WebElement webElement : option1) {
		String dayText=webElement.getText();
		System.out.println(dayText);
		
		if(dayText.equals(dayNumber)) {
			webElement.click();
	}
		
	}
	String year1="1988";
	
	WebElement year=driver.findElement(By.id("year"));
	Select selectYear = new Select(year);
	List<WebElement>option2=selectYear.getOptions();
	System.out.println("The size of the years are "+option2.size());
	
	for (WebElement webElement : option2) {
		String yearText=webElement.getText();
		System.out.println(yearText);
		if (yearText.equals(year1)) {
			webElement.click();
		}
	}
	
	//driver.findElement(By.xpath("//input[@value='2']")).click();//uniqe element.
	List<WebElement> buttons = driver.findElements(By.xpath("//input[@name='sex']"));
	for (WebElement oneButton : buttons) {
		String value = oneButton.getAttribute("value");
		System.out.println(value);
		if(oneButton.isEnabled()) {
			if(value.equals("2")) {
				oneButton.click();
				break;
			}
		}
	}
	
	driver.findElement(By.cssSelector(" button#u_0_13")).click();
	
	
	
	
	
	
	 
	 Exceptions.sleep(2000);
	 BaseClass.tearDown();
	
	}

	
	}


