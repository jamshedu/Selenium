package com.syntax.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.Exceptions;

public class HomeWork3 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement moDels=driver.findElement(By.linkText("Alerts & Modals"));
		click(moDels);
//		WebElement partialText=driver.findElement(By.partialLinkText("Javascript Alerts"));
//		click(partialText);
		WebElement modal=driver.findElement(By.partialLinkText("Window Popup Modal"));
		click(modal);
		
		String paretnId = driver.getWindowHandle();
		System.out.println(paretnId);
		String titleP = driver.getTitle();
		System.out.println(titleP);
		
		
		WebElement insta=driver.findElement(By.cssSelector("a[title='Follow @syntaxtech on Instagram']"));
		click(insta);
		Thread.sleep(1000);

		WebElement face=driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Facebook']"));
		click(face);
	
		Thread.sleep(1000);
		Set<String> allLinks = driver.getWindowHandles();
		Iterator<String> it = allLinks.iterator();
		while(it.hasNext()) {
			String link = it.next();
			if(!link.equals(paretnId)) {
				driver.switchTo().window(link);
				String titles = driver.getTitle();
				System.out.println(titles);
				driver.close();
				Thread.sleep(1000);
			}
		}
		
		
	}

}
