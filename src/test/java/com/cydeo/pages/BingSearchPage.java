package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingSearchPage {

    // Task 2: Bing Search Title Verification
    //#1- Create the constructor and initialize the driver with object
    public BingSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // #2:
    @FindBy(name = "q")
    public WebElement searchBox;

}
