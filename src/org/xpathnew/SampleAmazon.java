package org.xpathnew;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleAmazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtclk = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		txtclk.click();
		WebElement txtenter = driver.findElement(By.xpath("//p[contains(text(),'Conditions of Use')]"));
		String text = txtenter.getText();
		System.out.println(text);
	}

}
