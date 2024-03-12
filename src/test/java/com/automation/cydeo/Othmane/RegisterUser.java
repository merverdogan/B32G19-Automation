package com.automation.cydeo.Othmane;

import com.automation.cydeo.pagesOthmane.O_RegisterPage;
import com.automation.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterUser {

    O_RegisterPage oRegisterPage ;

    @BeforeMethod
    public void setup(){
        //Test Case 1: Register User
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        Driver.getDriver().get("https://automationexercise.com");
        oRegisterPage = new O_RegisterPage();
    }

    @Test
    public void RegisterUser(){

        //3. Verify that home page is visible successfully

        //4. Click on 'Signup / Login' button
        oRegisterPage.signupLogin.click();

        //5. Verify 'New User Signup!' is visible
        Assert.assertTrue(oRegisterPage.HeaderNewUserSignup.isDisplayed());

        //6. Enter name and email address
        oRegisterPage.inputName.sendKeys("ahmed");
        oRegisterPage.inputSingupEmail.sendKeys("exemple@gmail1.com");

        //7. Click 'Signup' button
        oRegisterPage.buttonSignup.click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible

        Assert.assertTrue(oRegisterPage.headerEnterInformation.isDisplayed());

        ////9. Fill details: Title, Name, Email, Password, Date of birth

        oRegisterPage.radioButtonMr.click();
        oRegisterPage.inputpassword.sendKeys("otman10");

        Select selectday = new Select(oRegisterPage.dropdownDay);
        selectday.selectByVisibleText("4");

        Select selectmonth = new Select(oRegisterPage.dropdownMonths);
        selectmonth.selectByVisibleText("May");

        Select selectyear = new Select(oRegisterPage.dropdownYears);
        selectyear.selectByVisibleText("1990");


        //10. Select checkbox 'Sign up for our newsletter!'

        oRegisterPage.checkboxNewLettre.click();

        //11. Select checkbox 'Receive special offers from our partners!'
        oRegisterPage.checkboxOptin.click();


        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        oRegisterPage.inputFirstName.sendKeys("othmane");
        oRegisterPage.inputLastName.sendKeys("othmane");
        oRegisterPage.inputCompany.sendKeys("os");
        oRegisterPage.inputAdress1.sendKeys("34 newark");
        oRegisterPage.inputAdress2.sendKeys("app 4");

        Select selectCountry = new Select(oRegisterPage.dropdownCountry);

        selectCountry.selectByVisibleText("United States");

        oRegisterPage.inputState.sendKeys("Maryland");

        oRegisterPage.inputCity.sendKeys("elkton");

        oRegisterPage.inputZipcode.sendKeys("12947");

        oRegisterPage.inputMobileNumber.sendKeys("667-365_3432");

        //13. Click 'Create Account button'
        oRegisterPage.buttonCreateAccount.click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        Assert.assertTrue(oRegisterPage.headerAcountCreated.isDisplayed());


        //15. Click 'Continue' button
        oRegisterPage.buttonContinue.click();

    }



    //16. Verify that 'Logged in as username' is visible
    //17. Click 'Delete Account' button
    //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

}
