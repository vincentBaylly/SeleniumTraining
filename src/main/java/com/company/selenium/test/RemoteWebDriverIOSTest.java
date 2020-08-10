package com.company.selenium.test;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
public class RemoteWebDriverIOSTest {
  public static void main(String[] args) throws Exception {
    String kobitonServerUrl = "https://joeybrown:3bfd8955-e252-4754-bffd-beb057b2b123@api.kobiton.com/wd/hub";
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("sessionName", "Automation test session on iOS web");
    capabilities.setCapability("sessionDescription", "This is example iOS web testing");
    capabilities.setCapability("deviceOrientation", "portrait");
    capabilities.setCapability("captureScreenshots", true);
    capabilities.setCapability("browserName", "safari");
    capabilities.setCapability("deviceGroup", "KOBITON");
    capabilities.setCapability("deviceName", "iPhone X");
    capabilities.setCapability("platformVersion", "11.4.1");
    capabilities.setCapability("platformName", "iOS");
    RemoteWebDriver driver = new RemoteWebDriver(new URL(kobitonServerUrl), capabilities);
    /**
    * Prints Kobiton Session Id
    */
    String kobitonSessionId = driver.getCapabilities().getCapability("kobitonSessionId").toString();
    System.out.println("Your test session is: https://portal.kobiton.com/sessions/" + kobitonSessionId);
    driver.get("http://appium.io/");
    System.out.println("Current URL is: " + driver.getCurrentUrl());
    System.out.println("Title of page is: " + driver.getTitle());
    /**
     * Goes to Appium page and prints URL & title
     */
    driver.quit();
  }
}
