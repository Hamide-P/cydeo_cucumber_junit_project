package com.cydeo.step_definitions;

import com.cydeo.pages.WebTable_LoginPage;
import com.cydeo.pages.WebTable_OrderPage;
import com.cydeo.pages.WebTable_ViewAllOrdersPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class WebTable_StepDefinitions {

    WebTable_LoginPage webTableLoginPage = new WebTable_LoginPage();


    @Given("user is on the Web Table app login page")
    public void user_is_on_the_web_table_app_login_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    @When("user enters correct username")
    public void user_enters_correct_username() {
        webTableLoginPage.username.sendKeys("Test");

    }


    @When("user enters correct password")
    public void user_enters_correct_password() {
        webTableLoginPage.password.sendKeys("Tester");
    }


    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTableLoginPage.loginButton.click();
    }

    @Then("user should see orders word in the URL")
    public void user_should_see_orders_word_in_the_url() {

        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "orders";

        Assert.assertTrue(actualURL.contains(expectedURL));
    }


    @When("user enters {string} username and {string} password")
    public void userEntersCorrect(String username, String password) {
        webTableLoginPage.username.sendKeys(username);
        webTableLoginPage.password.sendKeys(password);
    }


    @When("user enters below correct credentials")
    public void userEntersBelowCorrectCredentials(Map<String, String> expectedCredentials) {

        webTableLoginPage.username.sendKeys(expectedCredentials.get("username"));
        webTableLoginPage.password.sendKeys(expectedCredentials.get("password"));
    }

    // ===================================================== //
    @Given("user is already logged in to The Web table app")
    public void user_is_already_logged_in_to_the_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        webTableLoginPage.login();
    }

    WebTable_OrderPage webTableOrderPage = new WebTable_OrderPage();

    @When("user is on the Order page")
    public void user_is_on_the_order_page() {

        webTableOrderPage.orderLink.click();
        BrowserUtils.sleep(3);
    }


    @Then("user sees below options under product dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> expectedOptions) {
        //this list take the WebElement and turn it into as a List of String
        List<String> actualOptions = BrowserUtils.dropdownOptions_as_String(webTableOrderPage.productDropdown);

        Assert.assertEquals(actualOptions, expectedOptions);
    }

    // ===================================================== //

    @Then("user sees Visa as enabled payment option")
    public void user_sees_visa_as_enabled_payment_option() {

        Assert.assertTrue(webTableOrderPage.visaRadioButton.isEnabled());
    }

    @Then("user sees MasterCard as enabled payment option")
    public void user_sees_master_card_as_enabled_payment_option() {
        Assert.assertTrue(webTableOrderPage.masterRadioButton.isEnabled());
    }

    @Then("user sees American Express as enabled payment option")
    public void user_sees_american_express_as_enabled_payment_option() {
        Assert.assertTrue(webTableOrderPage.americanExpressRadioButton.isEnabled());
    }


    @And("user enters quantity {string}")
    public void userEntersQuantity(String quantity) {
        webTableOrderPage.quantity.clear();
        webTableOrderPage.quantity.sendKeys(quantity);
        //another option as deleting whatever already in the input box
        //orderPage.inputName.sendKeys(Keys.BACK_SPACE);
    }

    @Then("user clicks to the calculate button")
    public void userClicksToTheCalculateButton() {
        webTableOrderPage.calculateButton.click();
    }

    @And("user enters customer name {string}")
    public void userEntersCustomerName(String name) {
        webTableOrderPage.name.sendKeys(name);
    }

    @And("user enters street {string}")
    public void userEntersStreet(String street) {
        webTableOrderPage.street.sendKeys(street);
    }

    @And("user enters city {string}")
    public void userEntersCity(String city) {
        webTableOrderPage.city.sendKeys(city);
    }

    @And("user enters state {string}")
    public void userEntersState(String state) {
        webTableOrderPage.state.sendKeys(state);
    }

    @And("user enters zip {string}")
    public void userEntersZip(String zip) {
        webTableOrderPage.zip.sendKeys(zip);
    }

    @And("user selects payment option {string}")
    public void userSelectsPaymentOption(String expectedCardType) {
        BrowserUtils.clickRadioButton(webTableOrderPage.cardTypes, expectedCardType);
    }


    @And("user enters credit card number {string}")
    public void userEntersCreditCardNumber(String cardNo) {
        webTableOrderPage.creditCard.sendKeys(cardNo);
    }

    @And("user enters expiration date {string}")
    public void userEntersExpirationDate(String expirationDate) {
        webTableOrderPage.expirationDate.sendKeys(expirationDate);
    }

    @And("user clicks to process order button")
    public void userClicksToProcessOrderButton() {
        webTableOrderPage.processButton.click();
    }

     WebTable_ViewAllOrdersPage webTableViewAllOrdersPage = new WebTable_ViewAllOrdersPage();


    @Then("user should see {string} in the first row of the web table.")
    public void userShouldSeeInTheFirstRowOfTheWebTable(String expectedName) {

        String actualName = webTableViewAllOrdersPage.newCustomerCell.getText();

        Assert.assertEquals(actualName, expectedName);
    }


    @Then("user should see {string} in the first row of the web table")
    public void user_Should_See_InTheFirstRowOfTheWebTable(String tableName) {
        String actualName = webTableViewAllOrdersPage.newCustomerCell.getText();

        Assert.assertEquals(actualName, tableName);

    }
}

