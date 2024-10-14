package com.toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Widgets {
	
	    
	@Test
	public void widgetstools() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement elementToScrollTo = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[4]/div/div[3]/h5"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);",elementToScrollTo);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h5[text()='Widgets']")).click();
		Thread.sleep(2000);
		
		//According
//		driver.findElement(By.xpath("//span[text()='Accordian']")).click();
//		Thread.sleep(2000);
//		for (int i = 1; i <= 3; i++) {
//			driver.findElement(By.id("section"+i+"Heading")).click();
//			Thread.sleep(2000);
//		}
		
		//Progress bar
//		WebElement elementToScrollTo1 = driver.findElement(By.xpath("//*[@id=\\\"item-4\\\"]/span"));
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("arguments[0].scrollIntoView(true);",elementToScrollTo1);
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//*[@id=\"item-4\"]/span")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("resetButton")).click();
//		Thread.sleep(2000);
		
		//tabs
//		WebElement elementToScrollTo2 = driver.findElement(By.xpath("//span[text()='Tabs']"));
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//			js2.executeScript("arguments[0].scrollIntoView(true);",elementToScrollTo2);
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//span[text()='Tabs']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("demo-tab-origin")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("demo-tab-use")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("demo-tab-what")).click();
//		Thread.sleep(2000);
		
		//Tool Tips
//		WebElement elementToScrollTo3 = driver.findElement(By.xpath("//span[text()='Tool Tips']"));
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//			js3.executeScript("arguments[0].scrollIntoView(true);",elementToScrollTo3);
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//span[text()='Tool Tips']")).click();
//		Thread.sleep(2000);
//		WebElement hoverto = driver.findElement(By.xpath("//button[text()='Hover me to see']"));
//		Thread.sleep(2000);
//		Actions actions=new Actions(driver);
//		Action a=actions.moveToElement(hoverto).build();
//		a.perform();
//		Thread.sleep(2000);
//		WebElement contra = driver.findElement(By.xpath("//a[text()='Contrary']"));
//		Thread.sleep(2000);
//		Actions actions1=new Actions(driver);
//		Action a1=actions1.moveToElement(contra).build();
//		a1.perform();
//		Thread.sleep(2000);
		
		//Menu
//		WebElement elementToScrollTo4 = driver.findElement(By.xpath("//span[text()='Menu']"));
//		JavascriptExecutor js4 = (JavascriptExecutor) driver;
//			js4.executeScript("arguments[0].scrollIntoView(true);",elementToScrollTo4);
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//span[text()='Menu']")).click();
//		Thread.sleep(2000);
//		WebElement main2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
//		Thread.sleep(2000);
//		Actions actions2=new Actions(driver);
//		Action a2=actions2.moveToElement(main2).build();
//		a2.perform();
//		Thread.sleep(2000);
//		
//		WebElement main2sub = driver.findElement(By.xpath("//a[text()='Sub Item']"));
//		Thread.sleep(2000);
//		Actions actions3=new Actions(driver);
//		Action a3=actions3.moveToElement(main2sub).build();
//		a3.perform();
//		Thread.sleep(2000);
//		
//		WebElement main2subsub = driver.findElement(By.xpath("//a[text()='SUB SUB LIST Â»']"));
//		Thread.sleep(2000);
//		Actions actions4=new Actions(driver);
//		Action a4=actions4.moveToElement(main2subsub).build();
//		a4.perform();
//		Thread.sleep(2000);
//		
//		WebElement main2subsubitem = driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));
//		Thread.sleep(2000);
//		Actions actions5=new Actions(driver);
//		Action a5=actions5.moveToElement(main2subsubitem).build();
//		a5.perform();
//		Thread.sleep(2000);
		
		//select Menu
//		WebElement elementToScrollTo5 = driver.findElement(By.id("item-8"));
//		JavascriptExecutor js5 = (JavascriptExecutor) driver;
//			js5.executeScript("arguments[0].scrollIntoView(true);",elementToScrollTo5);
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("item-8")).click();
//		Thread.sleep(2000);
		
//		JavascriptExecutor js6 = (JavascriptExecutor) driver;
//		 js6.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
//		driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div/div[1]/div[1]")).click(); 
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//*[@id=\"selectOne\"]/div/div[1]/div[1]")).click(); 
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]/option[2]")).click(); 
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]/option[2]")).click(); 
//		Thread.sleep(2000);
		
//		WebElement e1=driver.findElement(By.id("cars"));
//		Thread.sleep(2000);
//		
//		Select s1=new Select(e1);
//		
//		s1.selectByIndex(1);
//		Thread.sleep(2000);
//		
//		s1.selectByValue("Saab");
//		Thread.sleep(2000);
//		
//		s1.selectByVisibleText("Audi");
//		Thread.sleep(2000);
//		
//		driver.close();
		
		//Auto complete
		
//		driver.findElement(By.xpath("//*[@id=\"item-1\"]")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//*[@id=\"item-1\"]")).sendKeys("black");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"autoCompleteSingleContainer\"]/div/div[1]")).sendKeys("Red");
//		Thread.sleep(2000);
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
