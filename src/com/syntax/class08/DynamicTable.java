package com.syntax.class08;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class DynamicTable extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		String expectValue="ctl00_MainContent_orderGrid_ctl07_OrderSelector";
		driver.findElement(By.id(expectValue)).click();
		
		//Find all rows of the table
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		for(int i =0; i<rows.size();i++) {//loop over list  based on the size.
			String rowsText=rows.get(i).getText();//get text of list and skip first index(first row)
			System.out.println(rowsText);
			if(rowsText.contains(expectValue)) {//search for Bob Feather
				driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[1]")).get(i).click();
				break;
				//get the rows of first column in the table
				//driver.findElements(By.xpath())
				
			}
			
//			List<WebElement> col=driver.findElements(By.cssSelector("[scope='col']"));
//		for(int j=0;j<col.size();j++)
//		
}
		Thread.sleep(6000);
		driver.close();

}
}
