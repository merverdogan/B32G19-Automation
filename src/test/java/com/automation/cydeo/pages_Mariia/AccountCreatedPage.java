package com.automation.cydeo.pages_Mariia;

import com.automation.cydeo.utilities_Mariia.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatedPage {

    public AccountCreatedPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[.='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//a[.='Continue']")
    public WebElement buttonContinue;
}
