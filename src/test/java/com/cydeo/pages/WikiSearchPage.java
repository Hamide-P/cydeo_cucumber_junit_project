package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {

    public WikiSearchPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "search")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@id='searchButton']")
    public WebElement searchButton;
}
