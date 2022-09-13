package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleFacebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("9003709474");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("gunaselan8497");
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
	}

}
