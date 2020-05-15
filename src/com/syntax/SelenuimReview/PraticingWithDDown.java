package com.syntax.SelenuimReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class PraticingWithDDown extends BaseClass{

	public static void main(String[] args) {
		
		setUp();
		
		List<WebElement>element=driver.findElements(By.tagName("a"));
		
		for(WebElement oneDD:element) {
			String dropDD=oneDD.getText();
			System.out.println(dropDD);
			
			if(dropDD.equals("List Box")) {
				oneDD.click();
			}
			if(dropDD.equals("Bootsrap List Box")) {
				oneDD.click();
			}
		}
		
		List<WebElement>dd=driver.findElements(By.tagName("li"));
         for(WebElement oneItem:dd) {
        	String item= oneItem.getText();
        	//System.out.println(item);
        	if (item.equals("List Box")) {
        		oneItem.click();
        	break;
        	}
        	if (item.equals("Morbi leo risus")) {
        		oneItem.click();
        		break;
        	}
         } 
         
	}

}
