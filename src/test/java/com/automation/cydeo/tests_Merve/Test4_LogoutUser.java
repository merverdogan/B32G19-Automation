package com.automation.cydeo.tests_Merve;

import com.automation.cydeo.pages_Merve.LoginPage;
import com.automation.cydeo.utilities.BrowserUtils;
import com.automation.cydeo.utilities.ConfigurationReader;
import com.automation.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4_LogoutUser extends LoginPage {

    @Test
    public void LogoutUser(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        //3. Verify that home page is visible successfully
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        utility_Merve.verifyHomePageVisible();

        //4. Click on 'Signup / Login' button
        signupLoginButton.click();

        //5. Verify 'Login to your account' is visible
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//div[@class='login-form']//h2")).getText(),"Login to your account","Login to your account is NOT visible!!!");

        //6. Enter correct email address and password
        loginEmail.sendKeys(ConfigurationReader.getProperty("email"));
        password.sendKeys(ConfigurationReader.getProperty("password"));

        //7. Click 'login' button
        loginButton.click();

        //8. Verify that 'Logged in as username' is visible
        BrowserUtils.sleep(3);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//a[text()=' Logged in as ']")).getText().equals("Logged in as "+ConfigurationReader.getProperty("username")));

        //9. Click 'Logout' button
        logoutButton.click();

        //10. Verify that user is navigated to login page
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Automation Exercise - Signup / Login"),"User is not on the login page!!! ");

    }
}
