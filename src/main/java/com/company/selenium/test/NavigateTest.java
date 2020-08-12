package com.company.selenium.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	private WebDriver driver;

	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void navigate() {
		driver.get("https://www.selenium.dev/selenium-ide/");
		driver.manage().window().setSize(new Dimension(550, 691));
		driver.findElement(By.linkText("Docs")).click();
		driver.findElement(By.linkText("the command-line runner")).click();
		driver.findElement(By.linkText("Plugins")).click();
		driver.findElement(By.linkText("Blog")).click();
		driver.findElement(By.linkText("Help")).click();
	}

}
