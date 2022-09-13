package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleFB {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement clk = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		clk.click();
		WebElement nameclk = driver.findElement(By.name("firstname"));
		nameclk.sendKeys("Guna");
	}
	

}
