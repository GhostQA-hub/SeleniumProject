package com.seleniumproject.com.seleniumproject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class calendarDays {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String monthNumber = "6";
		String year = "2027";
		String date = "15";
		String[] expectedResult = { monthNumber, date, year };
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();

		driver.findElement(By.xpath("//span[text()='August 2024']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		driver.findElements(By.cssSelector(".react-calendar__tile.react-calendar__year-view__months__month"))
				.get(Integer.parseInt(monthNumber) - 1).click();
		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();
		List<WebElement> dates = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

		for (int i = 0; i < dates.size(); i++) {
			System.out.println(dates.get(i).getAttribute("value"));
			Assert.assertEquals(dates.get(i).getAttribute("value"), expectedResult[i]);

		}
		String url = "https://www.makemytrip.com/?srsltid=AfmBOopMb1TGGka9NnqBNHaaSqQkjEfrYrVUz-siO5uOKwOrxpbSuzxp";
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(tabs.size() - 1));

		// Load the URL in the new tab/window
		driver.get(url);
		driver.findElement(By.cssSelector(".commonModal__close")).click();
		driver.findElement(By.cssSelector(".flt_fsw_inputBox.searchCity.inactiveWidget")).click();
		String state="Mangalore, India";
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(state);
		Thread.sleep(4000);

		List<WebElement> searchItems = driver.findElements(By.xpath(
				"//div[@class='react-autosuggest__section-title']/following-sibling::ul[@class='react-autosuggest__suggestions-list']//li[@role='option']"));

		for (WebElement singleItem : searchItems) {

			System.out.println(singleItem.getText());
			if(singleItem.getText().equalsIgnoreCase(state))
			{
				singleItem.click();
				
			}
		}

	}

}
