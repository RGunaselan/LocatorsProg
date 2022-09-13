package org.mouse;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class DrogAndDrop {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement s = driver.findElement(By.id("credit2"));
		WebElement d = driver.findElement(By.id("bank"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s,d).perform();
		
		WebElement a = driver.findElement(By.id("fourth"));
		WebElement b = driver.findElement(By.className("placeholder"));
		Actions action = new Actions(driver);
		action.dragAndDrop(a,b).perform();
		
		WebElement c = driver.findElement(By.id("credit1"));
		WebElement e = driver.findElement(By.className("placeholder"));
		Actions act = new Actions(driver);
		act.dragAndDrop(c,e).perform();
		
		WebElement dr = driver.findElement(By.id("fourth"));
		WebElement dp = driver.findElement(By.className("placeholder"));
		Actions actn = new Actions(driver);
		actn.dragAndDrop(dr,dp).perform();
	}

}
