package org.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {

	public static void main(String[] args) throws InterruptedException {
		// (//p[@style='text-align:justify; font-size:18px;'])[1]
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sridhar\\eclipse-workspace\\Xpath\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@name='username']"));
		name.sendKeys("sridhar");
		String attribute = name.getAttribute("value");
		System.out.println(attribute);
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("Sri");
		String attribute2 = pass.getAttribute("value");
		System.out.println(attribute2);
	}
}
