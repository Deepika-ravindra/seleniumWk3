package com.scuba.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
	
//       WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new ChromeDriver();
		WebDriverManager.iedriver().setup();
		WebDriver driver=new InternetExplorerDriver();
		

		driver.get("http://www.google.com/");    
		driver.manage().window().maximize();
		Thread.sleep(5000);  
		

		WebElement searchBox = driver.findElement(By.name("q")); 

		searchBox.sendKeys("bangalore");     
		searchBox.click();    
		Thread.sleep(5000);  // Let the user actually see something!     
		driver.quit();  
	}

}





