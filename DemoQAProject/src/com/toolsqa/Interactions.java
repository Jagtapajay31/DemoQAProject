package com.toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		driver.get("https://demoqa.com/");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300)");
		
		driver.findElement(By.xpath("//h5[text()='Interactions']")).click();
		Thread.sleep(2000);
		
		//Sortable
//		driver.findElement(By.xpath("//span[text()='Sortable']")).click();
//		Thread.sleep(2000);
//		
//		WebElement one = driver.findElement(By.xpath("//div[text()='One']"));
//		Thread.sleep(2000);
//		WebElement five = driver.findElement(By.xpath("//div[text()='Five']"));
//		Thread.sleep(2000);
//		
//		Actions ele1 = new Actions(driver);
//		ele1.dragAndDrop(one, five).build().perform();
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//a[text()='Grid']")).click();
//		Thread.sleep(2000);
//		
//		WebElement two = driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[2]"));
//		Thread.sleep(2000);
//		WebElement nine = driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[9]"));
//		Thread.sleep(2000);
//		
//		Actions ele2 = new Actions(driver);
//		ele2.dragAndDrop(two, nine).build().perform();
//		Thread.sleep(5000);
		
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
//		Actions ele = new Actions(driver);
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
//		driver.findElement(By.id("droppableExample-tab-revertable")).click();
//		Thread.sleep(2000);
//		
//		WebElement revert = driver.findElement(By.id("revertable"));
//		Thread.sleep(2000);
//		
//		WebElement notrevert = driver.findElement(By.id("notRevertable"));
//		Thread.sleep(2000);
//		ele.dragAndDrop(revert, notrevert).perform();
//		Thread.sleep(2000);
//		
//		String msg3 = revert.getText();
//		if(msg3.equals("Dropped!")) {
//			System.out.println("accept");
//		}else {
//			System.out.println("notAcceptable");
//		}
		
		//Resizable
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("window.scrollBy(0, 300)");
//		
//		driver.findElement(By.xpath("//span[text()='Resizable']")).click();
//		Thread.sleep(2000);
//		WebElement corner = driver.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]/span"));
//		Thread.sleep(2000);
//		Actions a2 = new Actions(driver);
//		a2.dragAndDropBy(corner, 50, 50).build().perform();
//		Thread.sleep(2000);
//		a2.dragAndDropBy(corner, -100, -100).build().perform();
		
		
		//Droppable
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js3.executeScript("window.scrollBy(0, 300)");
//		
//		driver.findElement(By.xpath("//span[text()='Droppable']")).click();
//		Thread.sleep(2000);
//		
//		WebElement drag_me = driver.findElement(By.xpath("//div[text()='Drag me']"));
//		Thread.sleep(2000);
//
//		WebElement drop_here = driver.findElement(By.xpath("//p[text()='Drop here']"));
//		Thread.sleep(2000);
//
//		Actions a9 = new Actions(driver);
//		a9.dragAndDrop(drag_me, drop_here).build().perform();
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//a[text()='Accept']")).click();
//		Thread.sleep(2000);
//		
//		WebElement acceptable = driver.findElement(By.xpath("//*[@id=\"acceptable\"]"));
//		Thread.sleep(2000);
//
//		WebElement not_acceptable = driver.findElement(By.xpath("//*[@id=\"notAcceptable\"]"));
//		Thread.sleep(2000);
//
//		WebElement drop_here_accept = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[2]"));
//		Thread.sleep(2000);
//
//		Actions a10 = new Actions(driver);
//		a10.dragAndDrop(acceptable, drop_here_accept).build().perform();
//		Thread.sleep(2000);
//		
//		a10.dragAndDrop(not_acceptable, drop_here_accept).build().perform();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//a[text()='Prevent Propogation']")).click();
//		Thread.sleep(2000);
//		
//		WebElement drag_me_prevent = driver.findElement(By.xpath("//*[@id=\"dragBox\"]"));
//		Thread.sleep(2000);
//
//		WebElement drop_here_inner_not_greedy = driver.findElement(By.xpath("//p[text()='Inner droppable (not greedy)']"));
//		Thread.sleep(2000);
//
//		Actions a11 = new Actions(driver);
//		a11.dragAndDrop(drag_me_prevent, drop_here_inner_not_greedy).build().perform();
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//a[text()='Revert Draggable']")).click();
//		Thread.sleep(2000);
//		
//		WebElement will_revert = driver.findElement(By.xpath("//*[@id=\"revertable\"]"));
//		Thread.sleep(2000);
//
//		WebElement not_revert = driver.findElement(By.xpath("//*[@id=\"notRevertable\"]"));		
//		Thread.sleep(2000);
//
//		WebElement drop_here_revert = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[4]/div/div[2]"));
//		Thread.sleep(2000);
//
//		Actions a12 = new Actions(driver);
//		a12.dragAndDrop(will_revert, drop_here_revert).build().perform();
//		Thread.sleep(2000);
//		
//		a12.dragAndDrop(not_revert, drop_here_revert).build().perform();
//		Thread.sleep(2000);
		
		//Dragabble
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0, 300)");
		
		driver.findElement(By.xpath("//span[text()='Dragabble']")).click();
		Thread.sleep(2000);
		
		WebElement simple_drag_me = driver.findElement(By.xpath("//*[@id=\"dragBox\"]"));
		Thread.sleep(2000);
		
		Actions a13 = new Actions(driver);
		a13.dragAndDropBy(simple_drag_me, 50, 50).build().perform();
		driver.findElement(By.xpath("//a[text()='Axis Restricted']")).click();
		Thread.sleep(2000);
		
		WebElement x_drag_me = driver.findElement(By.xpath("//*[@id=\"restrictedX\"]"));
		Thread.sleep(2000);
		
		WebElement y_drag_me = driver.findElement(By.xpath("//*[@id=\"restrictedY\"]"));
		Thread.sleep(2000);
		
		Actions a14 = new Actions(driver);
		a14.dragAndDropBy(x_drag_me, 50, 0).build().perform();
		Thread.sleep(2000);
		
		a14.dragAndDropBy(y_drag_me, 0, 100).build().perform();
		Thread.sleep(2000);
		
		Thread.sleep(5000);
		driver.close();
	}

}
