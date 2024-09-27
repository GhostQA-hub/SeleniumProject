package com.seleniumproject.com.seleniumproject;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.asserts.SoftAssert;

public class verifyBrokenLinks {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//SoftAssert a = new SoftAssert();
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	
		//for(WebElement listLinks : links)
		//{
			//String url =listLinks.getAttribute("href");
			//HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			//conn.setRequestMethod("HEAD");
			//conn.connect();
			//int stsCode = conn.getResponseCode();
			//System.out.println(stsCode);
			
	//	}
		
		
		
	}
}
