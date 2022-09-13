package org.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleFlipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement mouse = driver.findElement(By.xpath("//div[@alt='Electronics']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mouse).perform();
	}

}
