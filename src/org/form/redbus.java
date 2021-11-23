package org.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\eclipse-workspace\\Xpath\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(5000);
		 
		 WebElement text = driver.findElement(By.xpath("//i[@id='i-icon-profile']"));
		 text.click();
		 Thread.sleep(2000);
		 WebElement sign = driver.findElement(By.xpath("//li[@id='signInLink']"));
		sign.click();
		Thread.sleep(2000);
		//WebElement p = driver.findElement(By.xpath("(//*[@data-message='Please enter valid mobile number|Please enter valid mobile number'])"));
		//p.click();
		Thread.sleep(2000);
		WebElement phn = driver.findElement(By.xpath("(//*[@data-message='Please enter valid mobile number|Please enter valid mobile number'])"));
		phn.sendKeys("235678");
		
		
		
		
	}

}
