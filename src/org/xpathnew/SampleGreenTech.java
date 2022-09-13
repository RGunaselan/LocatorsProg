package org.xpathnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleGreenTech {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement txtclk = driver.findElement(By.xpath("//span[text()='Overview']"));
		txtclk.click();
		WebElement print = driver.findElement(By.xpath("(//p[contains(text(),'p')])[1]"));
		String text = print.getText();
		System.out.println(text);
	}

}
