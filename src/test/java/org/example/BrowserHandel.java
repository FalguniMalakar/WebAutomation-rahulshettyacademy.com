package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BrowserHandel {
     @Test
  public void workwithbrowser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(500);
        driver.manage().window().minimize();
        Thread.sleep(500);
        driver.manage().window().fullscreen();
        Thread.sleep(500);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com");
        driver.close();
        Thread.sleep(2000);
        driver.quit();
    }

}
