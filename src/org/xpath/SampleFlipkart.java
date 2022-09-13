package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleFlipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement clk = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		clk.click();
		WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- _2LYh3d VJZDxU']"));
		username.sendKeys("90990900");
		WebElement pass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		pass.sendKeys("guna@1234");
	}
	

}
