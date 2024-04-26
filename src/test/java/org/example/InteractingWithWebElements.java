package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElements extends BrowserSetup{
    @Test
    public void testElement() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        browser.findElement(By.cssSelector("input[value='radio1']")).click();
        String optionName = browser.findElement(By.xpath("//label[@for='bmw']")).getText();
        System.out.println(optionName);
        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[@id='autocomplete']")).clear();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hi");
        String placeholder = browser.findElement(By.xpath("//input[@id='name']")).getAttribute("placeholder");
        System.out.println(placeholder);

        String fontSize = browser.findElement(By.xpath("//a[@id='opentab']")).getCssValue("background-color");
        System.out.println(fontSize);
        Boolean isSelect = browser.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
        System.out.println(isSelect);
        browser.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        isSelect = browser.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
        System.out.println(isSelect);
        System.out.println("-----------------------------------------");
        WebElement isDisplay = browser.findElement(By.xpath("//input[@id='displayed-text']"));
        System.out.println(isDisplay);
        browser.findElement(By.id("hide-textbox")).click();
        isDisplay = browser.findElement(By.xpath("//input[@id='displayed-text']"));
        System.out.println(isDisplay);
        browser.get("https://www.google.com");
        System.out.println("-----------------------------------------");
        Boolean isEnable = browser.findElement(By.xpath("//textarea[@id='APjFqb']")).isEnabled();
        System.out.println(isEnable);

    }
}
