package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTable_OrderPage extends WebTable_BasePage {


    public WebTable_OrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "product")
    public WebElement productDropdown;


    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaRadioButton;

    @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement masterRadioButton;

    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement americanExpressRadioButton;

    //another way to store cards in list of WebElement
    @FindBy(name="card")
    public List<WebElement> cardTypes;



    @FindBy(name = "quantity")
    public WebElement quantity;

    @FindBy(xpath = "//button[@class='button']")
    public WebElement calculateButton;

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(name = "street")
    public WebElement street;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "state")
    public WebElement state;

    @FindBy(name = "zip")
    public WebElement zip;

    @FindBy(name = "cardNo")
    public WebElement creditCard;

    @FindBy(name = "cardExp")
    public WebElement expirationDate;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processButton;


}
