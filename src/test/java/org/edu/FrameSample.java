package org.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameSample {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("1234");
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("hello@");
	WebElement btnclick = driver.findElement(By.id("login"));
	btnclick.click();
	
}
}
sheet