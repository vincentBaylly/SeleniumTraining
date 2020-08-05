package com.company.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
	
	public static void main(String[] args) {
		
		//Create Driver object for chrome Driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		WebDriver myDriver = new ChromeDriver();
		myDriver.get("https://www.google.com");
	}
}
