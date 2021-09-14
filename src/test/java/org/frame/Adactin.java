package org.frame;





	import java.io.IOException;

	import org.bouncycastle.crypto.modes.CCMBlockCipher;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.touch.LongPressAction;
	import org.openqa.selenium.support.ui.Select;



	public class Adactin {
	Select select;


	public static void main(String[] args) throws IOException, InterruptedException {

	Base1  b=new Base1();

	 b.getdriver();

	b.loadUrl("https://adactinhotelapp.com/");
	WebElement txtUsername = b.driver.findElement(By.id("username"));
	String userName = b.getData(1, 0);
	b.Send(txtUsername, userName);

	WebElement pass = b.driver.findElement(By.id("password"));
	String dataPass = b.getData(1, 1);
	b.Send(pass, dataPass);

	WebElement btnlogin = b.driver.findElement(By.id("login"));
	b.click(btnlogin);

	WebElement dDnLocation = b.driver.findElement(By.id("location"));
	b.click(dDnLocation);
	String locationData = b.getData(1, 2); 
	Select select=new Select(dDnLocation);
	select.selectByVisibleText(locationData);
	b.click(dDnLocation);

	WebElement dDnHotal = b.driver.findElement(By.id("hotels"));
	b.click(dDnHotal);
	String hotal = b.getData(1, 3); 

	Select select2=new Select(dDnHotal);
	select2.selectByVisibleText(hotal);
	b.click(dDnHotal);

	WebElement dDnHotaltype = b.driver.findElement(By.id("room_type"));
	b.click(dDnHotaltype);
	String hotaltype = b.getData(1, 4); 
	Select select3=new Select(dDnHotaltype);
	select3.selectByVisibleText(hotaltype);
	b.click(dDnHotaltype);

	WebElement dDnrome = b.driver.findElement(By.id("room_nos"));
	b.click(dDnrome);
	String roomtype = b.getData(1, 5); 
	Select select4=new Select(dDnrome);
	select4.selectByVisibleText(roomtype);
	b.click(dDnrome);

	WebElement checkInDate = b.driver.findElement(By.id("datepick_in"));
	String chindate = b.getData(1, 6);

	b.Send(checkInDate, chindate);

	WebElement checkOutDate = b.driver.findElement(By.id("datepick_out"));
	String choutDate = b.getData(1, 7);

	b.Send(checkOutDate, choutDate);

	WebElement dDnAdultRoom = b.driver.findElement(By.id("adult_room"));
	b.click(dDnAdultRoom);
	String adultRoom = b.getData(1, 8); 
	Select select5=new Select(dDnAdultRoom);
	select5.selectByVisibleText(adultRoom);
	b.click(dDnAdultRoom);

	WebElement dDnchild = b.driver.findElement(By.id("child_room"));
	b.click(dDnchild);
	String childRoom = b.getData(1, 9); 
	Select select6=new Select(dDnchild);
	select6.selectByVisibleText(childRoom);
	b.click(dDnchild);

	WebElement btnSearch = b.driver.findElement(By.id("Submit"));
	b.click(btnSearch);

	WebElement radiobtn = b.driver.findElement(By.id("radiobutton_0"));
	b.click(radiobtn);

	WebElement btnClick = b.driver.findElement(By.id("continue"));
	b.click(btnClick);

	WebElement txtFirstName = b.driver.findElement(By.id("first_name"));
	String first = b.getData( 1, 10);
	b.Send(txtFirstName, first);

	WebElement txtlastName = b.driver.findElement(By.id("last_name"));
	String last = b.getData( 1, 11);
	b.Send(txtlastName, last);


	WebElement txtadd = b.driver.findElement(By.id("address"));
	String add = b.getData(1, 12);
	b.Send(txtadd, add);


	WebElement txtcredit = b.driver.findElement(By.id("cc_num"));
	String creditCard = b.getData(1, 13);
	b.Send(txtcredit, creditCard);


	WebElement dDnCreditCard = b.driver.findElement(By.id("cc_type"));
	String typeofCreditCard = b.getData(1, 14);
	b.Send(dDnCreditCard, typeofCreditCard);

	WebElement dDnexpdatemon = b.driver.findElement(By.id("cc_exp_month"));
	String cardexm = b.getData(1, 15);
	b.Send(dDnexpdatemon, cardexm);

	WebElement dDnexpYear = b.driver.findElement(By.id("cc_exp_year"));
	String cardexyear = b.getData(1, 16 );

	b.Send(dDnexpYear, cardexyear);

	WebElement txtcvv = b.driver.findElement(By.id("cc_cvv"));
	String cvv = b.getData(1, 17);
	b.Send(txtcvv, cvv);

	WebElement Submit = b.driver.findElement(By.id("book_now"));
	b.click(Submit);
	Thread.sleep(8000);
	WebElement orderno = b.driver.findElement(By.xpath("(//input[@type='text'])[16]"));
	String text = b.getAttribut(orderno);
	System.out.println(text);




	}



	}

	
	
}
