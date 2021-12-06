package com.tests.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLocatorsTagName {
@Test
	public void VerifyLocatorTagName() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement rediffmail=driver.findElement(By.className("mailicon"));
		

		rediffmail.click();
		Thread.sleep(5000);
		driver.quit();
}
}
	
