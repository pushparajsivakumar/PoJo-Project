package org.testNG;

import org.testng.annotations.Test;

public class SampleTestP4 {
	@Test(priority = 7)
	private void Tc7() {
		System.out.println("Test Case 7 ");
	}
	@Test                             //Default means --> (Priority = 0 )
	private void Tc2() {
		System.out.println("Test Case 2 ");
	}
	@Test(priority = -15)
	private void Tc4() {
		System.out.println("Test Case 4 ");
	}
	@Test(priority = -2 )               //Priority Same 
	private void Tc6() {
		System.out.println("Test Case 6 ");
	}
	@Test(priority = 24)
	private void Tc3() {
		System.out.println("Test Case 3 ");
	}
	@Test(priority = -2)                //Priority Same
	private void Tc1() {
		System.out.println("Test Case 1 ");
	}
	@Test(priority = 4)
	private void Tc5() {
		System.out.println("Test Case 5 ");
	}

}
