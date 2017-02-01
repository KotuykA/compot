package com.akotuyk.app;

import org.openqa.selenium.WebDriver;

/**
 * Created by Huly-Buly on 01.02.2017.
 */
public class VotePage extends AbstractPage {
    private String url;

    public VotePage(String url, WebDriver driver) {
        super(driver);
        this.url = url;
    }
}
