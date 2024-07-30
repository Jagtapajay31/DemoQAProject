package com.toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_CheckBox {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@id='tree-node']/ol/li/ol/li[1]/span/label/span[3]")).click();
		Thread.sleep(2000);
	}
}
