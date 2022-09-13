package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleAdactinHotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("Guna");
		WebElement txtPassWord = driver.findElement(By.id("password"));
		txtPassWord.sendKeys("Guna@1234");
	}

}
