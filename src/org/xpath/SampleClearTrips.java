package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleClearTrips {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guna\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement fromstn = driver.findElement(By.id("from_station"));
		fromstn.sendKeys("Chennai");
		WebElement tostn = driver.findElement(By.id("to_station"));
		tostn.sendKeys("Madurai");
		WebElement select1 = driver.findElement(By.id("trainsSelBox"));
		select1.click();
		WebElement optionvalue = driver.findElement(By.xpath("//option[@value='2A']"));
		optionvalue.click();
		WebElement datefortrip = driver.findElement(By.id("dpt_date"));
		datefortrip.sendKeys("30/7/2022");
		WebElement adultname = driver.findElement(By.name("adults"));
		adultname.click();
		WebElement opnval = driver.findElement(By.xpath("(//option[@value='3'])[1]"));
		opnval.click();
		WebElement trainchild = driver.findElement(By.id("train_children"));
		trainchild.click();
		WebElement opnval2 = driver.findElement(By.xpath("(//option[@value='4'])[2]"));
		opnval2.click();
		WebElement maleseni = driver.findElement(By.name("male_seniors"));
		maleseni.click();
		WebElement opnval3 = driver.findElement(By.xpath("(//option[@value='2'])[3]"));
		opnval3.click();
		WebElement femaleseni = driver.findElement(By.name("female_seniors"));
		femaleseni.click();
		WebElement opnval4 = driver.findElement(By.xpath("(//option[@value='5'])[4]"));
		opnval4.click();
		WebElement trainbtn = driver.findElement(By.id("trainFormButton"));
		trainbtn.click();
	}

}
