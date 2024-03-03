package com.automation.cydeo.pages_Mariia;

import com.automation.cydeo.utilities_Mariia.Driver;
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

    @FindBy (xpath = "//button[.='Signup']")
    public WebElement signupButton;

    @FindBy (linkText = "Login")
    public WebElement loginButton;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignupText;




}