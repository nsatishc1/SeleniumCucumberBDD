package com.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage extends PageFactory {
    public  WebDriver driver1;
    @FindBy(name = "q")
    public WebElement weSearchQueryField;
    int temp = 0;
    @FindBy(xpath = "(//input[@role='button'])[2]")
    public WebElement weSearchButton;
    public GoogleSearchPage(WebDriver driver) {
        this.driver1 = driver;
        PageFactory.initElements(driver1, this);
    }

}
