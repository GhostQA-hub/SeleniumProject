package com.seleniumproject.com.seleniumproject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Total number of all the links present: " + driver.findElements(By.tagName("a")).size());
		WebElement footerLinks = driver.findElement(By.cssSelector("div._1ZMrY_"));
		System.out.println("Total Footerlinks: " + footerLinks.findElements(By.tagName("a")).size());
		WebElement footerFirstRow = footerLinks.findElement(By.xpath("//div[@class='_1ZMrY_']/div[1]"));
		System.out.println(footerFirstRow.findElements(By.tagName("a")).size());

		for (int i = 3; i < footerFirstRow.findElements(By.tagName("a")).size(); i++) {
			String shortcut = Keys.chord(Keys.CONTROL, Keys.RETURN);
			footerFirstRow.findElements(By.tagName("a")).get(i).sendKeys(shortcut);
			Thread.sleep(4000);
		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> a = abc.iterator();

		while (a.hasNext()) {
			driver.switchTo().window(a.next());
			System.out.println(driver.getTitle());
		}
		driver.quit();

	}

}
