package com.automation.cydeo.pages_Mariia;

import com.automation.cydeo.utilities_Mariia.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

    public SignupPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[.='Enter Account Information']")
    public WebElement enterAccountInformationText;

    @FindBy(id = "id_gender1")
    public WebElement radioTitleMr;

    @FindBy(id = "id_gender2")
    public WebElement radioTitleMrs;

    @FindBy(id = "name")
    public WebElement inputBoxUserName;

    @FindBy(id = "email")
    public WebElement inputBoxEmail;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(id = "days")
    public WebElement selectDayDOB;

    @FindBy(id = "months")
    public WebElement selectMonthDOB;

    @FindBy(id = "years")
    public WebElement selectYearDOB;

    @FindBy(id = "newsletter")
    public WebElement checkBoxSignUpForNews;

    @FindBy(id = "optin")
    public WebElement checkBoxReceiveOffers;

    @FindBy(id = "first_name")
    public WebElement inputFirstName;

    @FindBy(id = "last_name")
    public WebElement inputLastName;

    @FindBy(id = "company")
    public WebElement inputCompany;

    @FindBy(id = "address1")
    public WebElement inputFullAddress;

    @FindBy(id = "address2")
    public WebElement inputAddress2;

    @FindBy(id = "country")
    public WebElement selectCountry;

    @FindBy(id = "state")
    public WebElement inputState;

    @FindBy(id = "city")
    public WebElement inputCity;

    @FindBy(id = "zipcode")
    public WebElement inputZipcode;

    @FindBy(id = "mobile_number")
    public WebElement inputMobileNumber;

    @FindBy(xpath = "//button[.='Create Account']")
    public WebElement buttonCreateAccount;
}
