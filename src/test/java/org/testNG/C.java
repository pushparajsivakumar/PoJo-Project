package org.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C {
	@Test()
	private void Tc44() {
		System.out.println("TC44 :" + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("pushparajsiavkumar@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("inmakes");
	}

	@Test
	private void Tc99() {
		System.out.println("TC99 :"+ Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

	}

	@Test
	private void Tc66() {
		System.out.println("TC66 :"+ Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();

	}

}
