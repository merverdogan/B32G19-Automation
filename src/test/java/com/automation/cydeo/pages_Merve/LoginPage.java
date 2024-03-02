package com.automation.cydeo.pages_Merve;

import com.automation.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (name = "name")
    public WebElement signupName;

    @FindBy (xpath = "//input[@data-qa='signup-email']")
    public WebElement signupEmail;


    @FindBy (name = "password")
    public WebElement password;

    @FindBy (xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmail;

    @FindBy (linkText = "Signup")
    public WebElement signupButton;

    @FindBy (linkText = "Login")
    public WebElement loginButton;




}
