package com.automation.cydeo.pages_Mariia;

import com.automation.cydeo.utilities_Mariia.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage {

    public FirstPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.=' Signup / Login']")
    public WebElement signupLoginButton;
    @FindBy(xpath = "//a[text()=' Products']")
    public WebElement productsButton;

    @FindBy(xpath = "//a[.=' Contact us']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    public WebElement loggedInAsUserName;

    @FindBy(xpath = "//a[text()=' Delete Account']")
    public WebElement deleteAccountButton;
    @FindBy(xpath = "//a[.=' Logout']")
    public WebElement logoutButton;
    @FindBy(xpath = "//button[.='Test Cases']")
    public WebElement testCaseButton;

}
