package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		
	    setUp();
	WebElement weekDD=	driver.findElement(By.id("select-demo"));
		Select select = new Select(weekDD);
	  /*
	   * Selenium provides three diffrent ways to select a value from a DD 1 index
	   * 2 ByVisibleText(String str);
	   * 3 ByValue();
	   */
		
		List<WebElement>option =select.getOptions();
		System.out.println(option.size());
		
		
       // select.selectByIndex(1);
		
        
        for (int i =0; i<option.size(); i++ ) {
        	select.selectByIndex(i);
        	Thread.sleep(3000);
        	
        }
        
        select.deselectByVisibleText("Friday");
        
     
        tearDown();
        
	}

}
