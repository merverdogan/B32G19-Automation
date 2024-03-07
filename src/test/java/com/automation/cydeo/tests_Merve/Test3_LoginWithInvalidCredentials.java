package com.automation.cydeo.tests_Merve;

import com.automation.cydeo.pages_Merve.LoginPage;
import com.automation.cydeo.utilities.ConfigurationReader;
import com.automation.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3_LoginWithInvalidCredentials extends LoginPage {

    @Test
    public void LoginWithInvalidCredentials(){

        // Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        //3. Verify that home page is visible successfully
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        utility_Merve.verifyHomePageVisible();

        //4. Click on 'Signup / Login' button
        signupLoginButton.click();

        //5. Verify 'Login to your account' is visible
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//div[@class='login-form']//h2")).getText(),"Login to your account","Login to your account is NOT visible!!!");

        //6. Enter incorrect email address and password
        Faker faker = new Faker();
        loginEmail.sendKeys(faker.internet().emailAddress());
        password.sendKeys(faker.internet().password());

        //7. Click 'login' button
        loginButton.click();

        //8. Verify error 'Your email or password is incorrect!' is visible
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//p[.='Your email or password is incorrect!']")).getText(),"Your email or password is incorrect!");

        Driver.closeDriver();
    }
}
