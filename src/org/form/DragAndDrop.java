package org.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		////*[@width='20']
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sridhar\\eclipse-workspace\\Xpath\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement tar = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(6000);
		Actions act=new Actions(driver);
		act.dragAndDrop(src, tar).perform();
		
		

}}
