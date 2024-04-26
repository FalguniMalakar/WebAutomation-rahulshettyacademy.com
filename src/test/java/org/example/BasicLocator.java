package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicLocator extends BrowserSetup{
    @Test
    public void testpage() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement autocompletetextbox = browser.findElement(By.id("autocomplete"));
        autocompletetextbox.sendKeys("Hi");
        WebElement option1 = browser.findElement(By.name("checkBoxOption1"));
        option1.click();
        Thread.sleep(5000);
        WebElement radiobtn = browser.findElement(By.className("radioButton"));
        radiobtn.click();
        Thread.sleep(5000);
        browser.findElement(By.cssSelector("input[value=\"radio2\"]")).click();
        Thread.sleep(5000);
        browser.findElement(By.xpath("//input[@value=\"radio3\"]")).click();
        Thread.sleep(5000);
        WebElement titel = browser.findElement(By.tagName("h1"));
        System.out.println(titel.getText());
        //browser.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
        //browser.findElement(By.partialLinkText("ResumeAssistance/Material")).click();
        Thread.sleep(5000);

    }

}
