package com.syntax.intro;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class AmazonDD extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		driver.findElement(By.id("searchDropdownBox")).click();
		WebElement continents=driver.findElement(By.id("searchDropdownBox"));
		
		Select select = new Select(continents);
		
		
		List<WebElement> optionList = select.getOptions();
		System.out.println(optionList.size()+" -> departments");
		optionList.forEach(key -> System.out.println("Department -> "+key.getText()));
		select.selectByValue("search-alias=computers");
		
		driver.quit();
	}

}
