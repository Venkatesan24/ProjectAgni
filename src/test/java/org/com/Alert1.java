package org.com;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Alert1 {

	@Test
	private void tc0() {
		String s ="venkat";
		SoftAssert aasert1 = new SoftAssert();
		Assert.assertEquals(s, "Venkat");
		System.out.println("Soft Assert");
		System.out.println(s);
	}
	@Test
	private void tc01() {
		System.out.println("Methods1");

	}
	
}
