package com.akotuyk.app;

import org.openqa.selenium.WebDriver;

/**
 * Created by Huly-Buly on 01.02.2017.
 */
public class DocsPage extends AbstractPage {
    private String url;

    public DocsPage(String url, WebDriver driver) {
        super(driver);
        this.url = url;
    }
}
