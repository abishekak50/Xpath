package org.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		////*[@width='20']
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sridhar\\eclipse-workspace\\Xpath\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']"));
		search.click();
		Thread.sleep(2000);
		WebElement mob = driver.findElement(By.xpath("//input[@type='text']"));
		mob.sendKeys("Mobiles");
		WebElement sea = driver.findElement(By.xpath("//*[@width='20']"));
		Thread.sleep(2000);
		sea.click();
		Thread.sleep(10000);
		WebElement redmi = driver.findElement(By.xpath("(//*[@class='_4rR01T'])[1]"));
		redmi.click();

	}

}
