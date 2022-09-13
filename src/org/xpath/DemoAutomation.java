package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtusername = driver.findElement(By.xpath("//input [@type='text']"));
		txtusername.sendKeys("Guna");
		WebElement txtlastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtlastname.sendKeys("R");
		WebElement txtpara = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtpara.sendKeys("Chennai");
		WebElement txtmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtmail.sendKeys("green@gmail.com");
		WebElement txtphone = driver.findElement(By.xpath("//input[@type='tel']"));
		txtphone.sendKeys("90909090");
		WebElement btnradio = driver.findElement(By.xpath("//input[@value='Male']"));
		btnradio.click();
		WebElement btnselect1 = driver.findElement(By.xpath("//input[@value='Cricket']"));
		btnselect1.click();
		WebElement btnselect2 = driver.findElement(By.xpath("//input[@value='Hockey']"));
		btnselect2.click();
		WebElement txtlang = driver.findElement(By.xpath("div[@id='msdd']"));
		txtlang.sendKeys("Arabic");
		WebElement selectskill = driver.findElement(By.id("Skills"));
		selectskill.click();
	}

}
