package com.automation.cydeo.tests_Mariia;

import com.automation.cydeo.base_Mariia.TestBase;
import com.automation.cydeo.utilities_Mariia.BrowserUtils;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class TC3_Login_User_With_Incorrect_Email_And_Password extends TestBase {

    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'

    @Test
    public void test_login_user_with_incorrect_credential(){
        //3. Verify that home page is visible successfully

        BrowserUtils.verifyURL("https://automationexercise.com/");

        //4. Click on 'Signup / Login' button

        firstPage.signupLoginButton.click();

        //5. Verify 'Login to your account' is visible

        BrowserUtils.verifyVisibleTextEqual(loginPage.loginToYourAccountText, "Login to your account");


        //6. Enter incorrect email address and password

        loginPage.password.sendKeys(faker.internet().password());
        loginPage.loginEmail.sendKeys(faker.internet().emailAddress());

        //7. Click 'login' button

        loginPage.loginButton.click();

        //8. Verify error 'Your email or password is incorrect!' is visible

        BrowserUtils.verifyVisibleTextEqual(loginPage.yourEmailOrPasswordIncorrectText, "Your email or password is incorrect!");

    }

}
