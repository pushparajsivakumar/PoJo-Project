package org.testNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A extends BaseClass {
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

	@DataProvider(name = "Sample Data") // ------>//Data Provider Syntax
	private Object[][] data() {
		return new Object[][] { { "abc@gmaill.com", "3632698" }, { "selenium@gmail.com", "8y8ehehds" },
				{ "inmakes@gmail.com", "augiuq8qj" }, { "48sam@gmail.com", "jasbjkgDSB" }, };

	}
    
	@Test(dataProvider = "Sample Data")
	private void Tc35(String em, String pass) {
		System.out.println("Test Case 35");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(em);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pass);
	}
	@DataProvider(name = "Amazon Data") // ------>//Data Provider Syntax
	public Object datas() {
		return new Object[][] { { "t-shirt" }, { "pants" }, { "shirt" }, { "jeans" },

		};

	}
	@Test(dataProvider = "Amazon Data")
	private void Tc15(String product) throws AWTException {
		System.out.println("Test Case 15");
		launchBrowser();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys(product);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	@Test
	private void Tc25() {
		System.out.println("Test Case 25");
		launchBrowser();
		driver.get("https://accounts.google.com/");
	}

}
