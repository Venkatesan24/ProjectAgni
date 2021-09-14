package org.frame;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base1{
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@name='fromPort']")
	private WebElement from;
	@FindBy(xpath="//select[@name='toPort']")
	private WebElement to;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement find;
	public WebElement getFrom() {
		return from;
	}
	public WebElement getTo() {
		return to;
	}
	public WebElement getFind() {
		return find;
	}
	
	
	
	
	

}
