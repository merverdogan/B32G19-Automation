package com.automation.cydeo.tests_Mariia;

import com.automation.cydeo.base_Mariia.TestBase;
import com.automation.cydeo.utilities_Mariia.BrowserUtils;
import com.automation.cydeo.utilities_Mariia.ConfigurationReader;
import org.testng.annotations.Test;

public class TC4_Logout_User extends TestBase {
    //Test Case 4: Logout User
    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    @Test
    public void test_logout_user(){
        //3. Verify that home page is visible successfully

        BrowserUtils.verifyURL("https://automationexercise.com/");

        //4. Click on 'Signup / Login' button

        firstPage.signupLoginButton.click();

        //5. Verify 'Login to your account' is visible

        BrowserUtils.verifyVisibleTextEqual(loginPage.loginToYourAccountText, "Login to your account");

        //6. Enter correct email address and password

        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginEmail.sendKeys(ConfigurationReader.getProperty("email"));

        //7. Click 'login' button

        loginPage.loginButton.click();

        //8. Verify that 'Logged in as username' is visible

        softAssert.assertEquals(firstPage.loggedInAsUserName.getText(), "Logged in as "+ConfigurationReader.getProperty("username"));

        //9. Click 'Logout' button

        firstPage.logoutButton.click();

        //10. Verify that user is navigated to login page

        BrowserUtils.verifyURL("https://automationexercise.com/login");

        softAssert.assertAll();
    }
}
