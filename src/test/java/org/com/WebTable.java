package org.com;

import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.formula.functions.Rows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	
	public static void main(String[] args)  { 
		
	WebDriverManager.chromedriver().setup(); WebDriver driver = new
			ChromeDriver();
	
	
	
		
		
		
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
		
		
		
		
		WebElement tableElement = driver.findElement(By.tagName("table"));
		
		WebElement heading = driver.findElement(By.tagName("thead"));
		
		WebElement headingElement = driver.findElement(By.tagName("tr"));
		
		List<WebElement> findElements = driver.findElements(By.tagName("th"));
		
		for (int i = 0; i < findElements.size(); i++) {
			
			WebElement head = findElements.get(i);
			
			String text = head.getText();
			System.out.println(text);
		}
		
		
		
		
			
		
		
		
		
			

		}
		
		
		
		
		
	
		
	}

