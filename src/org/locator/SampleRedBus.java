package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleRedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement txtFrom = driver.findElement(By.id("src"));
		txtFrom.sendKeys("Chennai");
		WebElement txtTo = driver.findElement(By.id("dest"));
		txtTo.sendKeys("Madurai");
		
	}

}
