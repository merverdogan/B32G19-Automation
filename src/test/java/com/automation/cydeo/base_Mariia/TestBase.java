package com.automation.cydeo.base_Mariia;

import com.automation.cydeo.pages_Mariia.*;
import com.automation.cydeo.utilities_Mariia.ConfigurationReader;
import com.automation.cydeo.utilities_Mariia.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class TestBase {
    protected FirstPage firstPage = new FirstPage();
    protected LoginPage loginPage = new LoginPage();
    protected SignupPage signupPage = new SignupPage();

    protected SoftAssert softAssert = new SoftAssert();
    protected AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
    protected DeleteAccountPage deleteAccountPage = new DeleteAccountPage();

    @BeforeMethod
    public void setupMethod(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }

    @AfterMethod
    public void teardownMethod(){
        Driver.closeDriver();
    }
}
