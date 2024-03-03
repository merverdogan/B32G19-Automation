package com.automation.cydeo.pages_Mariia;

import com.automation.cydeo.utilities_Mariia.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountPage {

    public DeleteAccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//h2[.='Account Deleted!']")
    public WebElement accountDeleted;

    @FindBy(xpath = "//a[.='Continue']")
    public WebElement buttonContinue;
}
