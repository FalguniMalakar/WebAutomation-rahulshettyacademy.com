package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandelAlert extends BrowserSetup{

    @Test
    public void test_Alert() throws InterruptedException {
        browser.get("https://the-internet.herokuapp.com/javascript_alerts");
        browser.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(2000);
        Alert alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        System.out.println(browser.findElement(By.xpath("//p[@id='result']")).getText());

        browser.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
        System.out.println(browser.findElement(By.xpath("//p[@id='result']")).getText());

        browser.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
        System.out.println(browser.findElement(By.xpath("//p[@id='result']")).getText());

        browser.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        alert = browser.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Hello");
        alert.accept();
        System.out.println(browser.findElement(By.xpath("//p[@id='result']")).getText());
    }
}
