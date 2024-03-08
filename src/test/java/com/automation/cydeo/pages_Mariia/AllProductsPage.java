package com.automation.cydeo.pages_Mariia;

import com.automation.cydeo.utilities_Mariia.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProductsPage {

    public AllProductsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div.features_items")
    public WebElement productListModule;

    @FindBy(xpath = "(//div[@class='choose'])[1]")
    public WebElement viewProduct1;


}
