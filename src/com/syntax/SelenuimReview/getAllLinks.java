package com.syntax.SelenuimReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class getAllLinks extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		List<WebElement>allList=driver.findElements(By.tagName("a"));
		int numOfLink=allList.size();
		System.out.println(numOfLink);
		for(WebElement link:allList) {
			String text=link.getText();
			String links=link.getAttribute("href");
			System.out.println(links);
			System.out.println(text+" "+links);
			
			
		}
	}

}
