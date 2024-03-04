package com.automation.cydeo.pages_Mariia;

import com.automation.cydeo.utilities_Mariia.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

    public ContactUsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[.='Get In Touch']")
    public WebElement getInTouchText;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputName;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement inputEmail;
    @FindBy(xpath = "//input[@name='subject']")
    public WebElement inputSubject;
    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement inputMessage;
  @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement chooseFile;
    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement successMessage;
    @FindBy(xpath = "//span[.=' Home']")
    public WebElement homeButton;

}
