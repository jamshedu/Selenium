package com.syntax.class08;

import java.util.List;

import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class TableDemo {

	public static void main(String[] args) {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/table-search-filter-demo.html");

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		System.out.println("Number of Rows:: " + rows.size());

		System.out.println("--------Row Data-------");
		Iterator<WebElement> it = rows.iterator();
         
		while(it.hasNext()) { //Loop through rows while there is next element
			String itText=it.next().getText();
			System.out.println("Rows text "+itText);
			}
	
		    List<WebElement>colls=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		     System.out.println("Numbers of colls "+colls.size());
		     
		    for (WebElement col : colls) {
		    	String colText=col.getText();
		    	System.out.println(colText);
				
			}
		    driver.close();
		    
		
		
		
		
		
		
		
		
	}

}
