package com.akotuyk.app;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Huly-Buly on 01.02.2017.
 */

public abstract class WebDriverTestBase {
    protected WebDriver driver;

    @Before
    public void setUp() {
        WebDriver driver = new FirefoxDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
