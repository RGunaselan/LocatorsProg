package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleFacebook {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	WebElement btnclk = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
	btnclk.click();
	Thread.sleep(1000);
	WebElement Fname = driver.findElement(By.name("firstname"));
	Fname.sendKeys("Guna");

	}

}
