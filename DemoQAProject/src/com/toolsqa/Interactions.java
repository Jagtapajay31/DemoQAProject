package com.toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Interactions {
	WebDriver driver;
	
	@Test

	public void sortable() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		Thread.sleep(2000);
		
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, 300)");
//		
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]")).click();
//		Thread.sleep(2000);
		
//		driver.findElement(By.id("item-1")).click();
//		Thread.sleep(2000);
		
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//        WebElement one = driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]"));
//        Object scrollupto = null;
//		js1.executeScript("arguments[0].scrollIntoView();", scrollupto);
//        Thread.sleep(2000);
//        new Actions(driver).clickAndHold(one).moveToElement(one).perform();
//		
//		driver.findElement(By.id("demo-tab-grid")).click();
//		Thread.sleep(2000);
//		
		//Selectable
		//list
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement Element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[5]/span/div"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
		
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[5]/span/div")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[4]")).click();
//		Thread.sleep(2000);
		
		//grid
//		driver.findElement(By.id("demo-tab-grid")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"row1\"]/li[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"row2\"]/li[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"row3\"]/li[3]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"row1\"]/li[3]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"row3\"]/li[1]")).click();
//		Thread.sleep(2000);
//		
		
		//Droppable
		Actions ele = new Actions(driver);
//		WebElement drop = driver.findElement(By.id("draggable"));
//		Thread.sleep(2000);
//		
//		WebElement drag = driver.findElement(By.id("droppable"));
//		Thread.sleep(2000);
//		ele.dragAndDrop(drop, drag).perform();
//		Thread.sleep(2000);
//		
//		String msg = drag.getText();
//		if(msg.equals("Dropped!")) {
//			System.out.println("PASS Drop");
//		}else {
//			System.out.println("FAIL");
//		}
		
		//acceptable
//		driver.findElement(By.id("droppableExample-tab-accept")).click();
//		Thread.sleep(2000);
//		
//		WebElement accept = driver.findElement(By.id("acceptable"));
//		Thread.sleep(2000);
//		
//		WebElement notaccept = driver.findElement(By.id("notAcceptable"));
//		Thread.sleep(2000);
//		ele.dragAndDrop(accept, notaccept).perform();
//		Thread.sleep(2000);
//		
//		String msg1 = drag.getText();
//		if(msg1.equals("Dropped!")) {
//			System.out.println("accept");
//		}else {
//			System.out.println("notAcceptable");
//		}
		
		//Prevent
//		driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();
//		Thread.sleep(2000);
//		
//		WebElement outerdrop = driver.findElement(By.id("notGreedyDropBox"));
//		Thread.sleep(2000);
//		
//		WebElement innerdrop = driver.findElement(By.id("notGreedyInnerDropBox"));
//		Thread.sleep(2000);
//		
//		ele.dragAndDrop(outerdrop, innerdrop).perform();
//		Thread.sleep(2000);
		
//		WebElement outerdropgreedy = driver.findElement(By.id("greedyDropBox"));
//		Thread.sleep(2000);
//		
//		WebElement innerdropnotgreedy = driver.findElement(By.id("greedyDropBoxInner"));
//		Thread.sleep(2000);
//		
//		ele.dragAndDrop(outerdropgreedy, innerdropnotgreedy).perform();
//		Thread.sleep(2000);
		
		//Revert
		driver.findElement(By.id("droppableExample-tab-revertable")).click();
		Thread.sleep(2000);
		
		WebElement revert = driver.findElement(By.id("revertable"));
		Thread.sleep(2000);
		
		WebElement notrevert = driver.findElement(By.id("notRevertable"));
		Thread.sleep(2000);
		ele.dragAndDrop(revert, notrevert).perform();
		Thread.sleep(2000);
		
		String msg3 = revert.getText();
		if(msg3.equals("Dropped!")) {
			System.out.println("accept");
		}else {
			System.out.println("notAcceptable");
		}
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
