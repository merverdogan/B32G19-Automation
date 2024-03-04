package com.automation.cydeo.tests_Mariia;

import com.automation.cydeo.base_Mariia.TestBase;
import com.automation.cydeo.utilities_Mariia.BrowserUtils;
import com.automation.cydeo.utilities_Mariia.ConfigurationReader;
import org.testng.annotations.Test;

public class TC5_Register_User_With_existing_Email extends TestBase {

    //Test Case 5: Register User with existing email
    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'

    @Test
    public void test_register_user_with_existing_email(){
        //3. Verify that home page is visible successfully

        BrowserUtils.verifyURL("https://automationexercise.com/");

        //4. Click on 'Signup / Login' button

        firstPage.signupLoginButton.click();

        //5. Verify 'New User Signup!' is visible

        BrowserUtils.verifyVisibleTextEqual(loginPage.newUserSignupText, "New User Signup!");

        //6. Enter name and already registered email address

        loginPage.signupName.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.signupEmail.sendKeys(ConfigurationReader.getProperty("email"));

        //7. Click 'Signup' button

        loginPage.signupButton.click();

        //8. Verify error 'Email Address already exist!' is visible

        BrowserUtils.verifyVisibleTextEqual(loginPage.emailAlreadyExistText, "Email Address already exist!");

        softAssert.assertAll();
    }

}
