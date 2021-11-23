package org.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

	public static void main(String[] args) throws InterruptedException {
		// (//p[@style='text-align:justify; font-size:18px;'])[1]
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sridhar\\eclipse-workspace\\Xpath\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		Thread.sleep(2000);
		WebElement signup = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[1]"));
		String text = signup.getText();
		System.out.println(text);
	}

}
