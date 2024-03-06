package com.automation.cydeo.tests_Merve;

import com.automation.cydeo.pages_Merve.LoginPage;
import com.automation.cydeo.utilities.BrowserUtils;
import com.automation.cydeo.utilities.ConfigurationReader;
import com.automation.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1_RegisterUser extends LoginPage {

    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'

    @Test
    public void registerUser(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        utility_Merve.verifyHomePageVisible();

        //4. Click on 'Signup / Login' button
        signupLoginButton.click();

        //5. Verify 'New User Signup!' is visible
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//div[@class='signup-form']//h2")).getText(),"New User Signup!","New User Signup! is not visible");

        //6. Enter name and email address
        Faker faker = new Faker();
        String username= faker.name().username();
        signupName.sendKeys(username);
        signupEmail.sendKeys(faker.internet().emailAddress());

        //7. Click 'Signup' button
        signupButton.click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//h2[@class='title text-center']")).getText(),"ENTER ACCOUNT INFORMATION","ENTER ACCOUNT INFORMATION is not visible!");

        //9. Fill details: Title, Name, Email, Password, Date of birth
        Driver.getDriver().findElement(By.id("id_gender1")).click();
        Driver.getDriver().findElement(By.id("password")).sendKeys(faker.internet().password());

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

        //14. Verify that 'ACCOUNT CREATED!' is visible
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//h2[@data-qa='account-created']")).getText(),"ACCOUNT CREATED!","ACCOUNT CREATED! is not visible");

        //15. Click 'Continue' button
        Driver.getDriver().findElement(By.xpath("//a[@data-qa='continue-button']")).click();

        BrowserUtils.sleep(3);


        /* WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("aswift_1"));
        WebElement ad = Driver.getDriver().findElement(By.id("card"));

        if (ad.isDisplayed()){
            Driver.getDriver().findElement(By.cssSelector("div[role='button']")).click();
            Driver.getDriver().switchTo().defaultContent();
        }

         */

        BrowserUtils.closeAds();




        //16. Verify that 'Logged in as username' is visible

        BrowserUtils.sleep(3);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//a[text()=' Logged in as ']")).getText().equals("Logged in as "+username));

        //17. Click 'Delete Account' button
        Driver.getDriver().findElement(By.xpath("//i[@class='fa fa-trash-o']/../.")).click();






        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//h2[@data-qa='account-deleted']")).getText(),"ACCOUNT DELETED!","ACCOUNT DELETED! is not visible");

        Driver.getDriver().findElement(By.xpath("//a[.='Continue']")).click();

        Driver.closeDriver();


    }


}
