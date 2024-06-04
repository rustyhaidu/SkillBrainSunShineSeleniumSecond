package org.example.globalsqa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = "//a[.='SamplePage']")
    private WebElement samplePage;

    @FindBy(css = "button[aria-label='Consent']")
    private WebElement consentButton;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickOnSamplePage() {
        samplePage.click();
    }

    public void clickOnConsentButton() {
        consentButton.click();
    }
}
