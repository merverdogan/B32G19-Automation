package com.automation.cydeo.tests_Mariia;

import com.automation.cydeo.base_Mariia.TestBase;
import com.automation.cydeo.pages_Mariia.*;
import com.automation.cydeo.utilities_Mariia.BrowserUtils;
import com.automation.cydeo.utilities_Mariia.ConfigurationReader;
import com.automation.cydeo.utilities_Mariia.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TC1_Register_User extends TestBase {

    @Test
    public void register_user_test1() {

        //3. Verify that home page is visible successfully

        String expectedURL = "https://automationexercise.com/";

        softAssert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedURL);
        BrowserUtils.sleep(1);

        //4. Click on 'Signup / Login' button

        firstPage.signupLoginButton.click();

        //5. Verify 'New User Signup!' is visible

        softAssert.assertTrue(loginPage.newUserSignupText.isDisplayed());

        //6. Enter name and email address
        Faker faker = new Faker();

        String userName = faker.name().username();
        loginPage.signupName.sendKeys(userName);
        loginPage.signupEmail.sendKeys(faker.internet().emailAddress());

        //7. Click 'Signup' button

        loginPage.signupButton.click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible

        softAssert.assertEquals(signupPage.enterAccountInformationText.getText(), "ENTER ACCOUNT INFORMATION");

        //9. Fill details: Title, Name, Email, Password, Date of birth

        signupPage.radioTitleMr.click();
        signupPage.inputPassword.sendKeys(faker.internet().password());

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

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("aswift_1"));

        Driver.getDriver().findElement(By.cssSelector("div[role='button']")).click();

        Driver.getDriver().switchTo().defaultContent();

        //16. Verify that 'Logged in as username' is visible

        softAssert.assertEquals(firstPage.loggedInAsUserName.getText(), "Logged in as "+userName);

        //17. Click 'Delete Account' button

        firstPage.deleteAccountButton.click();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

        softAssert.assertEquals(deleteAccountPage.accountDeleted.getText(), "ACCOUNT DELETED!");

        deleteAccountPage.buttonContinue.click();

        softAssert.assertAll();

    }





}
