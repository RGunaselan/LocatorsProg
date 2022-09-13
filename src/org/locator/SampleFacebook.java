package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleFacebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("GunaSinger");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Guna@1234");
	}

}
