package com.syntax.SelenuimReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class ReviewHW extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		
	 WebElement listAM= driver.findElement(By.id("searchDropdownBox"));
	 Select select =new Select(listAM);
		List<WebElement>listBook=select.getOptions();
		for(WebElement book:listBook) {
			String text=book.getText();
			System.out.println(text);
			
		}
		select.selectByVisibleText("Books");
		
		WebElement searchTextBox=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		searchTextBox.sendKeys("Harry Pottor");
		WebElement search=driver.findElement(By.xpath("//input[@type='submit'][@class='nav-input']"));
		search.click();
		
		
		List<WebElement> bookStore=driver.findElements(By.className("a-spacing-micro"));
		for(WebElement element :bookStore) {
			String str=element.getText();
			if(element.isSelected() && element.equals("Unofficial Cookbook")) {
				Thread.sleep(2000);
				element.click();
				break;
			}
			
			
			
		}
		
		
		
		
		}

	}


