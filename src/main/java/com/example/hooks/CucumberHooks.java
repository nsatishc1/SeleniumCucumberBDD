package com.example.hooks;

import com.example.utils.ScreenshotUtils;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLException;

public class CucumberHooks {

    private static WebDriver driver;

    @Before
    public void setUp() {
        // Set the path of the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @BeforeStep
    public void beforeStep(Scenario scenario) {
        ScreenshotUtils.takeScreenshot(driver, "BeforeStep_" + scenario.getName());
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        ScreenshotUtils.takeScreenshot(driver, "AfterStep_" + scenario.getName());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
