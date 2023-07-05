package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTable_LoginPage {

    public WebTable_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="username")
    public WebElement username;

    @FindBy(name="password")
    public WebElement password;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    /**
     * This method will log in with below credentials
     * @username : Test
     * @password : Tester
     */
// create an extra method to implement the snippets in the login page and call this method in the step definitions.
    public void  login(){
        this.username.sendKeys("Test");
        this.password.sendKeys("Tester");
        this.loginButton.click();
    }
    /**
     * This method will log in with credentials that are
     * provided in the method at the time of calling it
     * @param user
     * @param pass
     */
    // avoid hard-coding
    public void  login(String user, String pass){
        this.username.sendKeys(user);
        this.password.sendKeys(pass);
        this.loginButton.click();
    }




}
