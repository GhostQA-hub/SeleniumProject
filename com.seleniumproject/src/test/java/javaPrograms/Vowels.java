package javaPrograms;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vowels {

	public static void main(String[] args) throws InterruptedException {

		String s = "abc@xyz.com, xyz@abc.com, saurabh.k@lsq.com, pawan.b@qwerty.com";
		String[] emails = s.split(", ");
		for (String email : emails) {
			if (email.endsWith("@lsq.com")) {
				System.out.println(email);
			}
		}

	}
}
