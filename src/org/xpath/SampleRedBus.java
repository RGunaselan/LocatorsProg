package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleRedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement txtbox = driver.findElement(By.id("smsTXTBOX"));
		txtbox.sendKeys("9003709474");
		WebElement clcbtn = driver.findElement(By.id("sendLinkButton"));
		clcbtn.click();
	}

}
