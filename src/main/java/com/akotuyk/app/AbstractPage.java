package com.akotuyk.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Huly-Buly on 01.02.2017.
 */

public class AbstractPage {
    protected WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String textBoxId, String text) {
        WebElement textBox = driver.findElement(By.id(textBoxId));
        textBox.clear();
        textBox.sendKeys(text);

    }

    public void click(String id) {
        WebElement button = driver.findElement(By.id(id));
        button.click();
    }
}
