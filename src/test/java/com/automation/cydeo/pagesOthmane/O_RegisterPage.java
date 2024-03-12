package com.automation.cydeo.pagesOthmane;

import com.automation.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class O_RegisterPage {




    public O_RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[contains(@style,'orange')]")
    public WebElement linkHomePage;

    @FindBy(linkText = "Signup / Login")
    public WebElement signupLogin;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement HeaderNewUserSignup;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement inputSingupEmail;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement buttonSignup;

    @FindBy(xpath = "//h2[@class='title text-center']//b")
    public WebElement headerEnterInformation;

    @FindBy(xpath = "//input[@value='Mr']")
    public WebElement radioButtonMr;

    @FindBy(xpath = "//input[@value='Mrs']")
    public WebElement radioButtonMrs;

    @FindBy(id="password")
    public WebElement inputpassword;

    @FindBy(id = "days")
    public WebElement dropdownDay;

    @FindBy(id = "months")
    public WebElement dropdownMonths;

    @FindBy(id = "years")
    public WebElement dropdownYears;

    @FindBy(id = "newsletter")
    public WebElement checkboxNewLettre;

    @FindBy(xpath = "//input[@name='optin']")
    public WebElement checkboxOptin;

    @FindBy(id ="first_name")
    public WebElement inputFirstName;

    @FindBy(id ="last_name")
    public WebElement inputLastName;

    @FindBy(id="company")
    public WebElement inputCompany;

    @FindBy(id="address1")
    public WebElement inputAdress1;

    @FindBy(id="address2")
    public WebElement inputAdress2;

    @FindBy(id = "country")
    public WebElement dropdownCountry;


    @FindBy(id = "state")
    public WebElement inputState;

    @FindBy(id = "city")
    public WebElement inputCity;

    @FindBy(id = "zipcode")
    public WebElement inputZipcode;


    @FindBy(id = "mobile_number")
    public WebElement inputMobileNumber;

    @FindBy(xpath = "//Button[@data-qa='create-account']")
    public WebElement buttonCreateAccount;

    @FindBy(xpath = "//h2[@data-qa='account-created']// b")
    public WebElement headerAcountCreated;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement buttonContinue;


}
