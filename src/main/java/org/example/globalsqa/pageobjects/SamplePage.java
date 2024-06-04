package org.example.globalsqa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SamplePage extends HomePage {

    @FindBy(tagName = "h1")
    private WebElement samplePageHeader;

    public SamplePage(WebDriver driver) {
        super(driver);
    }

    public String getHeaderText() {
        return samplePageHeader.getText();
    }
}
