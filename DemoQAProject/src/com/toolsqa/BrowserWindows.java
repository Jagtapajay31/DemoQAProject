package com.toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserWindows {
	@Test
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.cssSelector("button[id='tabButton']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
	
		driver.findElement(By.cssSelector("button[id='windowButton']")).click();		
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("button[id='messageWindowButton']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.quit();
	}

}
