package com.automation.cydeo.tests_Mariia;

import com.automation.cydeo.base_Mariia.TestBase;
import com.automation.cydeo.pages_Mariia.*;
import com.automation.cydeo.utilities_Mariia.BrowserUtils;
import com.automation.cydeo.utilities_Mariia.ConfigurationReader;
import com.automation.cydeo.utilities_Mariia.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.NoSuchElementException;

public class TC2_Login_User_With_Correct_Email_And_Password extends TestBase {



    //Test Case 2: Login User with correct email and password
    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    @Test
    public void test1_register_user() {

        //3. Verify that home page is visible successfully

        String expectedURL = "https://automationexercise.com/";

        BrowserUtils.verifyURL(expectedURL);



        //4. Click on 'Signup / Login' button

        firstPage.signupLoginButton.click();

        //5. Verify 'New User Signup!' is visible

        softAssert.assertTrue(loginPage.newUserSignupText.isDisplayed());

        //6. Enter name and email address

        loginPage.signupName.sendKeys(ConfigurationReader.getProperty("username_login_delete"));
        loginPage.signupEmail.sendKeys(ConfigurationReader.getProperty("email_login_delete"));

        //7. Click 'Signup' button

        loginPage.signupButton.click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible

        softAssert.assertEquals(signupPage.enterAccountInformationText.getText(), "ENTER ACCOUNT INFORMATION");

        //9. Fill details: Title, Name, Email, Password, Date of birth

        signupPage.radioTitleMr.click();
        signupPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        Select selectDay = new Select(signupPage.selectDayDOB);
        Select selectMonth = new Select(signupPage.selectMonthDOB);
        Select selectYear = new Select(signupPage.selectYearDOB);

        selectDay.selectByIndex(5);
        selectMonth.selectByValue("5");
        selectYear.selectByVisibleText("1988");


        //10. Select checkbox 'Sign up for our newsletter!'

        signupPage.checkBoxSignUpForNews.click();

        //11. Select checkbox 'Receive special offers from our partners!'

        signupPage.checkBoxReceiveOffers.click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number

        signupPage.inputFirstName.sendKeys(faker.name().firstName());
        signupPage.inputLastName.sendKeys(faker.name().lastName());
        signupPage.inputCompany.sendKeys(faker.company().name());
        signupPage.inputFullAddress.sendKeys(faker.address().fullAddress());
        signupPage.inputAddress2.sendKeys(faker.address().secondaryAddress());

        Select selectCountry = new Select(signupPage.selectCountry);
        selectCountry.selectByValue("United States");

        signupPage.inputState.sendKeys(faker.address().state());
        signupPage.inputCity.sendKeys(faker.address().city());
        signupPage.inputZipcode.sendKeys(faker.address().zipCode());
        signupPage.inputMobileNumber.sendKeys(faker.phoneNumber().cellPhone());

        //13. Click 'Create Account button'

        signupPage.buttonCreateAccount.click();

        //14. Verify that 'ACCOUNT CREATED!' is visible

        softAssert.assertEquals(accountCreatedPage.accountCreatedText.getText(), "ACCOUNT CREATED!");

        //15. Click 'Continue' button

        accountCreatedPage.buttonContinue.click();

        softAssert.assertAll();

    }

    @Test
    public void test2_login_user_with_correct_credential(){
        //3. Verify that home page is visible successfully

        String expectedURL = "https://automationexercise.com/";

        BrowserUtils.verifyURL(expectedURL);

        //4. Click on 'Signup / Login' button


        firstPage.signupLoginButton.click();

        //5. Verify 'Login to your account' is visible

        softAssert.assertTrue(loginPage.loginToYourAccountText.isDisplayed());

        //6. Enter correct email address and password

        loginPage.loginEmail.sendKeys(ConfigurationReader.getProperty("email_login_delete"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));

        //7. Click 'login' button

        loginPage.loginButton.click();

        //8. Verify that 'Logged in as username' is visible

        softAssert.assertEquals(firstPage.loggedInAsUserName.getText(), "Logged in as "+ConfigurationReader.getProperty("username_login_delete"));

        //9. Click 'Delete Account' button

        firstPage.deleteAccountButton.click();

        try {
            BrowserUtils.closeAds();
        } catch (NoSuchElementException e){

        }

        //10. Verify that 'ACCOUNT DELETED!' is visible

        softAssert.assertEquals(deleteAccountPage.accountDeleted.getText(), "ACCOUNT DELETED!");

        deleteAccountPage.buttonContinue.click();

        softAssert.assertAll();


    }

}
