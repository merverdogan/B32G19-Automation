package com.automation.cydeo.base_Mariia;

import com.automation.cydeo.pages_Mariia.*;
import com.automation.cydeo.utilities_Mariia.ConfigurationReader;
import com.automation.cydeo.utilities_Mariia.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class TestBase {
    protected FirstPage firstPage;
    protected LoginPage loginPage;
    protected SignupPage signupPage;

    protected SoftAssert softAssert;
    protected AccountCreatedPage accountCreatedPage;
    protected DeleteAccountPage deleteAccountPage;

    @BeforeMethod
    public void setupMethod(){
        firstPage = new FirstPage();
        loginPage = new LoginPage();
        signupPage = new SignupPage();

       softAssert = new SoftAssert();
        accountCreatedPage = new AccountCreatedPage();
        deleteAccountPage = new DeleteAccountPage();
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }

    @AfterMethod
    public void teardownMethod(){
        Driver.closeDriver();
    }
}
