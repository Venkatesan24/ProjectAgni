package org.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Alert {

	@Test
	private void tc0() {
		String s = "abcdef";
		Assert.assertEquals(s, "Abcdef");
		System.out.println("Assert Failure");

	}
	@Test
	 private void tc01() {
		System.out.println("Methodss1");

	}
	private void sysout() {
		System.out.println("method 1");
		
	}
		

	}

