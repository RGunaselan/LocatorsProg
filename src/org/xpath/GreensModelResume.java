package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensModelResume {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement model = driver.findElement(By.xpath("//div[@id='heading201']"));
		model.click();
		WebElement res = driver.findElement(By.xpath("//a[text()='Resume Model-2 ']"));
		res.click();
	}

}
