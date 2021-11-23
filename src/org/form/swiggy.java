package org.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggy {

	public static void main(String[] args) throws InterruptedException {
////*[@class='r2iyh']
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sridhar\\eclipse-workspace\\Xpath\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		WebElement signup = driver.findElement(By.xpath("//*[@class='r2iyh']"));
		signup.click();
		Thread.sleep(4000);
		WebElement phn = driver.findElement(By.xpath("(//input[@class='_381fS'])[1]"));
		phn.sendKeys("7708928927");
		WebElement name = driver.findElement(By.xpath("(//input[@class='_381fS'])[2]"));
		name.sendKeys("Sridhar");
		WebElement eMail = driver.findElement(By.xpath("(//input[@class='_381fS'])[3]"));
		eMail.sendKeys("lkhg@gmail.com");
		WebElement pass = driver.findElement(By.xpath("(//input[@class='_381fS'])[4]"));
		pass.sendKeys("dfgh0909");
		WebElement submit = driver.findElement(By.xpath("//*[@class='a-ayg']"));
		submit.click();
	}

}
