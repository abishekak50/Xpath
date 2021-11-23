package org.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFill {

	private static WebElement mon;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sridhar\\eclipse-workspace\\Xpath\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
		WebElement firstName = driver.findElement(By.xpath("// input[@type='text']"));
		firstName.sendKeys("Sridhar");
		WebElement surName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		surName.sendKeys("L");
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("2192");
		WebElement email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		email.sendKeys("lsridhar173@gmailcom");
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("7904809588");
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gender.click();
		WebElement hobbies = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		hobbies.click();
		WebElement hobbies2 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		hobbies2.click();		
		WebElement lang2 = driver.findElement(By.xpath("//div[@id='msdd']"));
		lang2.click();
		Thread.sleep(3000);
		WebElement lang = driver.findElement(By.xpath("//select[@id='Skills']"));
		lang.click();
		Thread.sleep(3000);
		
		WebElement cs = driver.findElement(By.xpath("//option[@value='C++']"));
		cs.click();
		WebElement country = driver.findElement(By.xpath("//select[@id='countries']"));
		country.click();
		Thread.sleep(3000);
		WebElement countr = driver.findElement(By.xpath("//span[@id='select2-country-container']"));
		countr.click();
		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		year.click();
		Thread.sleep(3000);
		WebElement yr = driver.findElement(By.xpath("//option[@value='1999']"));
		yr.click();
		Thread.sleep(3000);
		WebElement mon = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		mon.click();
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//option[@value='June']"));
		month.click();
		Thread.sleep(3000);
		WebElement dy = driver.findElement(By.xpath("//select[@id='daybox']"));
		dy.click();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//option[@value='2']"));
		day.click();
		WebElement pass1 = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		pass1.click();
		Thread.sleep(3000);
		WebElement confirm = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		confirm.click();
		WebElement btn = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		btn.click();
	}

}
