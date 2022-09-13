package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSwiggy {

	
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.swiggy.com/");
			WebElement sign = driver.findElement(By.xpath("//a[@class='r2iyh']"));
			sign.click();
			WebElement mob = driver.findElement(By.id("mobile"));
			mob.sendKeys("2121212");
			WebElement name = driver.findElement(By.id("name"));
			name.sendKeys("guna");
			WebElement mail = driver.findElement(By.id("email"));
			mail.sendKeys("guna@gmail.com");
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("121212");
		}

	}
