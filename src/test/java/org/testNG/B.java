package org.testNG;

import org.testng.annotations.Test;

public class B {
	
	@Test (dataProvider = "Amazon Data", dataProviderClass = A.class)
	private void Tc33(String data) {
	System.out.println("data");
	}
	@Test
	private void Tc11() {
	System.out.println("Test Case 11");
	}
	@Test
	private void Tc22() {
	System.out.println("Test Case 22");
	}

}
