package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PracticeWindowHandles {
    @Test
    public void testWindowHandles() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//*[text()='Open Window']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Open Tab']")).click();
        Thread.sleep(2000);
        System.out.println(driver.getWindowHandle());
        List<String> window_handles = new ArrayList<>(driver.getWindowHandles());
        for (String handle: window_handles){
            System.out.println(handle);
        }
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("++++++++++++++++++++++++++++++++++");
        driver.switchTo().window(window_handles.get(1));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("---------------------------------");
        driver.switchTo().window(window_handles.get(0));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("++++++++++++++++++++++++++++++++++");
        driver.switchTo().window(window_handles.get(2));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
