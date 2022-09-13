package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleAccGoogle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement txtname = driver.findElement(By.name("firstName"));
		txtname.sendKeys("guna");
		WebElement txtlast = driver.findElement(By.name("lastName"));
		txtlast.sendKeys("R");
		WebElement txtmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtmail.sendKeys("guna121234");
		WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));
		txtpass.sendKeys("guna1234");
		WebElement conpass = driver.findElement(By.name("ConfirmPasswd"));
		conpass.sendKeys("guna1234");
		WebElement clk = driver.findElement(By.xpath("//input[@class='VfPpkd-muHVFf-bMcfAe']"));
		clk.click();
	}

}
