package com.syntax.class08;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class TaskInClass  {

	public static void main(String[] args) {
		
		
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/index.html");
		
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='task-table']//tr"));
		System.out.println("Number of the rows "+rows.size());
		
		Iterator<WebElement>it=rows.iterator();
		while(it.hasNext()) {
		String rowText=	it.next().getText();
		System.out.println(rowText);
		}
		
		List<WebElement>colls=driver.findElements(By.xpath("//table[@class='table']//td"));
		System.out.println("Number of the cols are "+colls.size());
		
		for (WebElement cols : colls) {
		String colText=	cols.getText();
		System.out.println(colText);
			
		}
		driver.close();
		
		
	}

}
