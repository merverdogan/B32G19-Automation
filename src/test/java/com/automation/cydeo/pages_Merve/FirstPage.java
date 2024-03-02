package com.automation.cydeo.pages_Merve;

import com.automation.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage {

    public FirstPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.=' Signup / Login']")
    public WebElement signupLoginButton;

    @FindBy(linkText = " Contact us")
    public WebElement contactUsButton;


}
