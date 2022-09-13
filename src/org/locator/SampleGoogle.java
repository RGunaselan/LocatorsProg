package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleGoogle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement txtClass = driver.findElement(By.name("q"));
	txtClass.sendKeys("GreensTech");
	}

}
