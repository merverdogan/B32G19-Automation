package com.automation.cydeo.pages;

import com.automation.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href = \"/login\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement newUserName;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement newUserEmail;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement newUserSubmitBut;

    @FindBy(xpath = "//input[@type='radio']")
    public WebElement genderRadioMr;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement genderRadioMrs;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordOnForm;
    @FindBy(xpath = "//select[@id='days']")
    public WebElement day_DOB;
    @FindBy(xpath = "//select[@id='months']")
    public WebElement months_DOB;
    @FindBy(xpath = "//select[@id='years']")
    public WebElement years_DOB;


}
