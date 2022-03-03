package com.DC.SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstDemo {

	public static void main(String[] args) {
		
		String baseUrl="http://automationpractice.com/index.php";
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.getTitle();
		String expectedUrl="automationpractice.com/index.php";
		String actualUrl=driver.getCurrentUrl();
		
		actualUrl.contentEquals(expectedUrl);
		
	}

}
