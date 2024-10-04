package com.toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinksImages {
	WebDriver driver;
	
	@Test
	public void broken() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/broken");
		
		driver.findElement(By.xpath("//a[text()='Click Here for Valid Link']")).click();		
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Click Here for Broken Link']")).click();		
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.close();
	}

}
