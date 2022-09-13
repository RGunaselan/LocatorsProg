package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleICICIBank {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	WebElement txtUserName = driver.findElement(By.name("DUMMY1"));
	txtUserName.sendKeys("Gunaselan");
	WebElement txtPassword = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	txtPassword.sendKeys("123412234");
}	

}
