package com.seleniumproject.com.seleniumproject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollWebpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.makemytrip.com/?srsltid=AfmBOopMb1TGGka9NnqBNHaaSqQkjEfrYrVUz-siO5uOKwOrxpbSuzxp");
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	
	
	
	
	}

}
