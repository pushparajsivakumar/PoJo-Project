package org.testNG;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ChallengeP3testNg extends BaseClass{
	@BeforeMethod
	private void startDate() {
		Date d = new Date();
		System.out.println(d);
	}
	@AfterMethod
	private void EndDate() {
		Date d = new Date();
		System.out.println(d);
	}
	@BeforeClass
	private void LaunchTheBrowser() {
	  launchBrowser();
	  windowMaximize();
	}
	@AfterClass
	private void CloseTheBrowser() {
		System.out.println("CloseTheBrowser...");

	}
	@Test(retryAnalyzer = Failed.class)                      
	public void Tc1() {
		System.out.println("Test Case 1");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = pageTitle();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("pushparajsivakumar2@gmail.com");
//Hard Assert Mathod Below 1st FB Login
		Assert.assertTrue(title.contains("facebook"), "check your page title");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Inmakes");
	}
	@Test
	public void Tc3() {
		System.out.println("Test Case 3");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = pageTitle();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("SeleniumInmakes@gmail.com");
//Soft Assert Mathod Below 1st FB Login
		SoftAssert s = new SoftAssert();
		s.assertTrue(title.contains("facebook"), "check your page title");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Inmakes");
		
		//s.assertAll();
	}
	@Test(enabled = false)
	private void Tc5() {
		launchUrl("https://www.redbus.in/");
	}
	
}
