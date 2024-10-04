package com.toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTable {
	
	WebDriver driver;
	@BeforeClass
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
        WebElement elementToScrollTo = driver.findElement(By.id("addNewRecordButton"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);",elementToScrollTo);
		Thread.sleep(2000);
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.id("item-3")).click();
		Thread.sleep(2000);
		WebElement searc=driver.findElement(By.id("searchBox"));
		Actions actions=new Actions(driver);
		actions.moveToElement(searc).click().sendKeys("Cierra").build().perform();
		Thread.sleep(2000);
		actions.keyDown(searc,Keys.CONTROL).sendKeys("a").keyUp(searc,Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		actions.sendKeys("Cantrell").keyDown(searc,Keys.CONTROL).sendKeys("a").keyUp(searc,Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		actions.sendKeys("29").keyDown(searc,Keys.CONTROL).sendKeys("a").keyUp(searc,Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		actions.sendKeys("alden@example.com").keyDown(searc,Keys.CONTROL).sendKeys("a").keyUp(searc,Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		actions.sendKeys("10000").keyDown(searc,Keys.CONTROL).sendKeys("a").keyUp(searc,Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		actions.sendKeys("Compliance").keyDown(searc,Keys.CONTROL).sendKeys("a").keyUp(searc,Keys.CONTROL)
		.sendKeys(searc,Keys.DELETE).build().perform();
		Thread.sleep(2000); 
		
		
		for (int i = 0; i < 15; i++) {															//This Shows entries 15 Times
				driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();		// CSS Selector with attribute
				driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Jay");		// CSS Selector with attribute
				driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("Patel");		// CSS Selector with attribute
				driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("Jay@mail.com");		// CSS Selector with attribute
				driver.findElement(By.cssSelector("input[id='age']")).sendKeys("23");		// CSS Selector with attribute
				driver.findElement(By.cssSelector("input[id='salary']")).sendKeys("2300000");		// CSS Selector with attribute
				driver.findElement(By.cssSelector("input[id='department']")).sendKeys("Compliance");		// CSS Selector with attribute
				driver.findElement(By.cssSelector("button[id='submit']")).click();		// CSS Selector with attribute
			}
			
			driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();		// CSS Selector with attribute
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Jay");		// CSS Selector with attribute
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("Patel");		// CSS Selector with attribute
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("Jay@mail.com");		// CSS Selector with attribute
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='age']")).sendKeys("23");		// CSS Selector with attribute
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='salary']")).sendKeys("2300000");		// CSS Selector with attribute
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='department']")).sendKeys("Compliance");		// CSS Selector with attribute
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[id='submit']")).click();		// CSS Selector with attribute
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("span[id='edit-record-4']")).click();		// CSS Selector with attribute
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("AJay");		// CSS Selector with attribute
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("atel");		// CSS Selector with attribute
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[id='submit']")).click();		// CSS Selector with attribute
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("span[id='delete-record-4']")).click();		// CSS Selector with attribute
			Thread.sleep(2000);
			
	}
	
	@AfterClass
	public void after() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}
