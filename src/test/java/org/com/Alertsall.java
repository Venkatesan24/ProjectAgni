package org.com;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Alertsall {

	@Test
	private void tc0() {
	String s = "abcdef";
	SoftAssert assert1 = new SoftAssert();
	assert1.assertEquals(s, "Abcdef");
	assert1.assertAll();
	System.out.println("Soft Assert");
	System.out.println(s);
	}
	@Test
	private void tc01() {
		System.out.println("Methodss1");

	}

	}
	

