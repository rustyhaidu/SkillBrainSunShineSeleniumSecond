package org.example;

import org.example.globalsqa.pageobjects.HomePage;
import org.example.globalsqa.pageobjects.SamplePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.example.globalsqa.Constants.GLOBAL_QA_SITE_URL;
import static org.example.globalsqa.Constants.SAMPLE_PAGE_HEADER_TEXT;
import static org.example.logger.LoggerUtils.getLogger;
import static org.testng.Assert.assertEquals;


import java.io.File;


public class BasicTests extends BaseTest {
    private HomePage homePage;

    @BeforeClass
    public static void configureLogger() {
        getLogger().info("Start Tests:");
    }

    @BeforeMethod
    public void initializarePagina() {
        getLogger().info("Go to Site: " + GLOBAL_QA_SITE_URL);
        getDriver().get(GLOBAL_QA_SITE_URL);
        homePage = new HomePage(getDriver());
        homePage.clickOnConsentButton();
    }


    @Test
    public void samplePageHeaderVerification() {
        getLogger().info("Start test");
        homePage.clickOnSamplePage();

        SamplePage samplePage = new SamplePage(getDriver());
        String samplePageHeaderText = samplePage.getHeaderText();
        assertEquals(samplePageHeaderText, SAMPLE_PAGE_HEADER_TEXT);
    }
}
