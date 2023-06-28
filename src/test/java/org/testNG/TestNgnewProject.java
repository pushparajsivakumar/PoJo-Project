package org.testNG;

import java.util.Date;

import org.POM.FbLoginPojo;
import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgnewProject extends BaseClass{
	@Test(invocationCount = 3)
	private void tc1() {
		launchUrl("https://www.facebook.com/");
		FbLoginPojo f = new FbLoginPojo();
		passText("SeleniumInmakes@gmail.com", f.getEmail());
		passText("inmakes", f.getPassword());
	}
	@Test(enabled = false)
	private void tc9() {
		launchUrl("https://www.amazon.in/");
	}
	@Test
	private void tc4() {
		launchUrl("https://mail.google.com/mail/");
	}
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

}
