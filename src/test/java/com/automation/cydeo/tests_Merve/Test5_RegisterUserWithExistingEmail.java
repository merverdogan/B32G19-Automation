package com.automation.cydeo.tests_Merve;

import com.automation.cydeo.pages_Merve.LoginPage;
import com.automation.cydeo.utilities.ConfigurationReader;
import com.automation.cydeo.utilities.Driver;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.google.common.base.Verify;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5_RegisterUserWithExistingEmail extends LoginPage {

    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Click on 'Signup / Login' button
    //5. Verify 'New User Signup!' is visible
    @Test
    public void registerWithExistingEmail(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        //3. Verify that home page is visible successfully
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        utility_Merve.verifyHomePageVisible();

        //4. Click on 'Signup / Login' button
        signupLoginButton.click();

       // 5. Verify 'New User Signup!' is visible
        Assert.assertTrue(newUserSignUpText.getText().equals("New User Signup!"),"New User Signup! is not visible!!!");

        //6. Enter name and already registered email address
        signupName.sendKeys(ConfigurationReader.getProperty("username"));
       signupEmail.sendKeys(ConfigurationReader.getProperty("email"));


    //7. Click 'Signup' button
        signupButton.click();
    //8. Verify error 'Email Address already exist!' is visible

        Assert.assertEquals(emailAlreadyExistText.getText(),"Email Address already exist!","Email Address already exist! is not visible!!!");

        Driver.closeDriver();

}}
