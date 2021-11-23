package org.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sridhar\\eclipse-workspace\\Xpath\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.myntra.com/register?referer=https://www.myntra.com/");
		Thread.sleep(2000);
		//WebElement per = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-user']"));
		//Actions act=new Actions(driver);
		//act.moveToElement(per).perform();
		//Thread.sleep(3000);
		//WebElement reg = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		//reg.click();
		//Thread.sleep(3000);
		WebElement phn = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		phn.sendKeys("7904809588");
		WebElement cont = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		cont.click();
		
		
		
	}

}
