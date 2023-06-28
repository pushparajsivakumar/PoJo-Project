package org.testNG;
import org.base.BaseClass;
import org.testng.annotations.Test;
public class ChallengeP4testNG extends BaseClass{
	@Test(priority = 7)
	private void Tc7() {		
		System.out.println("Test Case 7 ");
		launchBrowser();
		driver.get("https://www.youtube.com/");
	}
	@Test                             //Default means --> (Priority = 0 )
	private void Tc2() {
		
		System.out.println("Test Case 2 ");
		launchBrowser();
		driver.get("https://inmakes.com/");		
	}
	@Test(priority = -15)
	private void Tc4() {
		
		System.out.println("Test Case 4 ");
		launchBrowser();
		driver.get("https://www.flipkart.com/");		
	}
	@Test(priority = -2 )               //Priority Same 
	private void Tc6() {
	
		System.out.println("Test Case 6 ");
		launchBrowser();
		driver.get("https://www.facebook.com/");		
	}
	@Test(priority = 24)
	public void Tc3() {
		
		System.out.println("Test Case 3 ");
		launchBrowser();
		driver.get("https://www.redbus.in/");		
	}
	@Test(priority = -2)                //Priority Same
	public void Tc1() {
		
		System.out.println("Test Case 1 ");
		launchBrowser();
		driver.get("https://accounts.google.com/");		
	}
	@Test(priority = 4)
	private void Tc5() {	
		System.out.println("Test Case 5 ");
		launchBrowser();
		driver.get("https://www.amazon.in/");		
	}

}
