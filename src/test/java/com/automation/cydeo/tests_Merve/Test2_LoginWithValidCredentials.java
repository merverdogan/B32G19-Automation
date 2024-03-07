package com.automation.cydeo.tests_Merve;

import com.automation.cydeo.utilities.BrowserUtils;
import com.automation.cydeo.utilities.ConfigurationReader;
import com.automation.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2_LoginWithValidCredentials extends testBase_Merve {




    @Test
    public void createNewUser() {



        //4. Click on 'Signup / Login' button

      loginPage.signupLoginButton.click();
        //5. Verify 'New User Signup!' is visible
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//div[@class='signup-form']//h2")).getText(), "New User Signup!", "New User Signup! is not visible");

        Faker faker = new Faker();

        loginPage.signupName.sendKeys(ConfigurationReader.getProperty("username_login_delete"));

        loginPage.signupEmail.sendKeys(ConfigurationReader.getProperty("email_login_delete"));

        //7. Click 'Signup' button
        Driver.getDriver().findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
       Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//h2[@class='title text-center']")).getText(), "ENTER ACCOUNT INFORMATION", "ENTER ACCOUNT INFORMATION is not visible!");



        //9. Fill details: Title, Name, Email, Password, Date of birth
        Driver.getDriver().findElement(By.id("id_gender1")).click();
        String password = faker.internet().password();
        Driver.getDriver().findElement(By.id("password")).sendKeys(ConfigurationReader.getProperty("password"));

        Select dayDropdown = new Select(Driver.getDriver().findElement(By.id("days")));
        dayDropdown.selectByIndex(5);
        Select monthDropdown = new Select(Driver.getDriver().findElement(By.id("months")));
        monthDropdown.selectByIndex(5);
        Select yearDropdown = new Select(Driver.getDriver().findElement(By.id("years")));
        yearDropdown.selectByIndex(15);

        //10. Select checkbox 'Sign up for our newsletter!'
        Driver.getDriver().findElement(By.id("newsletter")).click();

        //11. Select checkbox 'Receive special offers from our partners!'
        Driver.getDriver().findElement(By.id("optin")).click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        Driver.getDriver().findElement(By.id("first_name")).sendKeys(faker.name().firstName());
        Driver.getDriver().findElement(By.id("last_name")).sendKeys(faker.name().lastName());
        Driver.getDriver().findElement(By.id("company")).sendKeys(faker.company().name());
        Driver.getDriver().findElement(By.id("address1")).sendKeys(faker.address().streetAddress());
        Driver.getDriver().findElement(By.id("address2")).sendKeys(faker.address().secondaryAddress());
        Select countryDropdown = new Select(Driver.getDriver().findElement(By.id("country")));
        countryDropdown.selectByValue("United States");
        Driver.getDriver().findElement(By.id("state")).sendKeys(faker.address().state());
        Driver.getDriver().findElement(By.id("city")).sendKeys(faker.address().city());
        Driver.getDriver().findElement(By.id("zipcode")).sendKeys(faker.address().zipCode());
        Driver.getDriver().findElement(By.id("mobile_number")).sendKeys(faker.phoneNumber().cellPhone());

        //13. Click 'Create Account button'
        Driver.getDriver().findElement(By.xpath("//button[@data-qa='create-account']")).click();

    }


    @Test
    public void loginWithValidCredentials() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        //3. Verify that home page is visible successfully

        utility_Merve.verifyHomePageVisible();

        //4. Click on 'Signup / Login' button
        loginPage.signupLoginButton.click();


        //5. Verify 'Login to your account' is visible
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//h2[.='Login to your account']")).getText(), "Login to your account", "Login to your account is NOT visible!!!");

        //6. Enter correct email address and password
        loginPage.loginEmail.sendKeys(ConfigurationReader.getProperty("email_login_delete"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));

        BrowserUtils.sleep(1);

        //7. Click 'login' button
        loginPage.loginButton.click();

        //8. Verify that 'Logged in as username' is visible

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//a[text()=' Logged in as ']")).getText().equals("Logged in as " + ConfigurationReader.getProperty("username_login_delete")));

        //9. Click 'Delete Account' button
        Driver.getDriver().findElement(By.xpath("//i[@class='fa fa-trash-o']/../.")).click();


        BrowserUtils.closeAds();

        //10. Verify that 'ACCOUNT DELETED!' is visible
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//h2[.='Account Deleted!']")).getText(), "ACCOUNT DELETED!", "ACCOUNT DELETED! is not visible");

    }
}
