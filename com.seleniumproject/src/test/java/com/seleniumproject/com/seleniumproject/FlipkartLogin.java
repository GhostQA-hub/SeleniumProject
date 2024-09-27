package com.seleniumproject.com.seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Grocery']")).click();
		driver.navigate().back();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone 15");
		Thread.sleep(3000);

		List<WebElement> listOfOptions = driver.findElements(By.cssSelector("ul._1sFryS._2x2Mmc li"));
		for (WebElement options : listOfOptions) {
			if (options.getText().equalsIgnoreCase("iphone 15")) {
				options.click();
				break;
			}

		}
		Thread.sleep(3000);
		driver.close();
	}

}
