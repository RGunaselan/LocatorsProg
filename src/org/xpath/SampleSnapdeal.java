package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSnapdeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement sign = driver.findElement(By.xpath("//div[@class='accountInner']"));
		sign.click();
		WebElement user = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		user.click();
		WebElement mob = driver.findElement(By.xpath("//input[@class='col-xs-24 clickOnceOnly']"));
		mob.sendKeys("9090909090");

	}

}
