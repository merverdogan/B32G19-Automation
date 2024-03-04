package com.automation.cydeo.pages_Mariia;

import com.automation.cydeo.utilities_Mariia.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.Text;

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

    @FindBy (xpath = "//button[.='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignupText;

    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement loginToYourAccountText;

    @FindBy(xpath = "//p[.='Your email or password is incorrect!']")
    public WebElement yourEmailOrPasswordIncorrectText;
    @FindBy(xpath = "//p[.='Email Address already exist!']")
    public WebElement emailAlreadyExistText;


}
