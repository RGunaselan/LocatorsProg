package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleAmazonClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement clk1 = driver.findElement(By.xpath("//select[@data-nav-digest='YaNDxYMsix1vZjM7upEvnpX/VWU=']"));
		clk1.click();
		WebElement clk2 = driver.findElement(By.xpath("//option[@value='search-alias=amazon-pharmacy']"));
		clk2.click();
		WebElement btn = driver.findElement(By.id("nav-search-submit-button"));
		btn.click();
	}

}
