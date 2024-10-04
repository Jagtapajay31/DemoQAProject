package com.toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadAndDownload {
	WebDriver driver;
	
	@Test
	public void updown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		
		driver.findElement(By.cssSelector("a[id='downloadButton']")).click();		
		Thread.sleep(2000);
		WebElement upload =driver.findElement(By.id("uploadFile"));
		upload.sendKeys("C:\\Users\\os\\Downloads\\sampleFile.jpeg");
		Thread.sleep(5000);
		
		driver.close();
	}

}
