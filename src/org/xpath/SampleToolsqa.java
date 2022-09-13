package org.xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleToolsqa {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
	}
	

}
