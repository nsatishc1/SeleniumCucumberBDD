package com.example.Steps;

import com.example.Pages.GoogleSearchPage;
import org.openqa.selenium.WebDriver;

public class GoogleSearchSteps {

    public WebDriver driver;
    public GoogleSearchPage objGoogleSearchPage;
    public GoogleSearchSteps(WebDriver driver) {
        this.driver = driver;

    }

    public void open(String url) {
        driver.get(url);
        objGoogleSearchPage= new GoogleSearchPage(driver);
    }

    public void enterSearchTerm(String searchTerm) {
        objGoogleSearchPage.weSearchQueryField.sendKeys(searchTerm);
    }

    public void clickSearchButton() {
        objGoogleSearchPage.weSearchButton.click();
    }


}
