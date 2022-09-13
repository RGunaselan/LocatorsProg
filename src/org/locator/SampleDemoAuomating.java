package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleDemoAuomating {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtFirstName = driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
		txtFirstName.sendKeys("Guna");
	}

}
