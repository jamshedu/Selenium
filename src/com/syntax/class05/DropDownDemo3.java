package com.syntax.class05;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo3 extends BaseClass{

	public static void main(String[] args) {
		
		setUp();
		
		WebElement continents=driver.findElement(By.id("continents"));
		
		Select select = new Select(continents);
		select.selectByValue("AUS");
		
		List<WebElement> optionList = select.getOptions();
		
		ArrayList<String> expected= new ArrayList<>();
		expected.add("Asia");
		expected.add("Europe");
		expected.add("Africa");
		expected.add("Australia");
		expected.add("South America");
		expected.add("North America");
		expected.add("Antarctica");
		Iterator<WebElement> it = optionList.iterator();
		while (it.hasNext()) {
		String text=it.next().getText();
		System.out.println(text);
		}
		
		if(expected.containsAll(optionList)) {
			System.out.println("The list Matches");
		}else {
			System.err.println("The list didnt matches");
		}
			
	}

}
