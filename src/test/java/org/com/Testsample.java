package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testsample {

	WebDriver driver;
	
	@BeforeClass
	private void before() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}
	
	
	
	@Parameters({"username"})
	@Test
	private void tc0(String s) {
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys(s);

	}
	
	@Parameters({"password"})
	@Test
	private void tc1(String s) {
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(s);
		
		System.out.println("Method1");
		System.out.println("Methods2");
		System.out.println("s");

	}
	
}
