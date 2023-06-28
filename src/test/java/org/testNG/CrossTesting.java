package org.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossTesting {

	@Parameters("Browser") // Delcaring the Parameters for 3 browsers
	@Test
	private void tc1(String BrowserName) {

		WebDriver driver; // Using If Condition ,Else if , Else
		if (BrowserName.equals("ChromeBrowser")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (BrowserName.equals("FirefoxBrowser")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}

		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("98pushparaj@gmail.com");
		WebElement continueBtn = driver.findElement(By.id("continue"));
		continueBtn.click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("inmakes");
		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
	}

}
