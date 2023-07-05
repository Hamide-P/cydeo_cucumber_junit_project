package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyHomePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinitions {

    EtsyHomePage etsyHomePage = new EtsyHomePage();
    @Given("user is on Etsy homepage")
    public void user_is_on_Etsy_homepage() {
        Driver.getDriver().get("https://www.etsy.com/");
        etsyHomePage.cookieAccept.click();
    }


    @Then("user sees title is as expected")
    public void user_sees_title_is_as_expected() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Etsy Germany - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertEquals("Title verification failed", expectedTitle, actualTitle);
    }



    @When("user types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox() {
        etsyHomePage.searchBox.sendKeys("Wooden Spoon");
    }

    @And("user clicks search button")
    public void userClicksSearchButton() {
        etsyHomePage.searchButton.click();
    }


    @Then("user sees Wooden Spoon is in the title")
    public void userSeesWoodenSpoonIsInTheTitle() {
        BrowserUtils.verifyTitle("Wooden spoon - Etsy DE");
    }

    @When("user types {string} in the search box")
    public void userTypesInTheSearchBox(String searchKey) {
        etsyHomePage.searchBox.sendKeys(searchKey);
    }

    @Then("user sees {string} is in the title")
    public void userSeesIsInTheTitle(String expectedTitle) {
        BrowserUtils.verifyTitleContains(expectedTitle);
    }
}
