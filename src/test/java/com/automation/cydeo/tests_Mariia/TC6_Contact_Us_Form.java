package com.automation.cydeo.tests_Mariia;

import com.automation.cydeo.base_Mariia.TestBase;
import com.automation.cydeo.pages_Mariia.ContactUsPage;
import com.automation.cydeo.utilities_Mariia.BrowserUtils;
import com.automation.cydeo.utilities_Mariia.Driver;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

public class TC6_Contact_Us_Form extends TestBase {

    //Test Case 6: Contact Us Form
    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'

    @Test
    public void test_contact_us_form(){
        //3. Verify that home page is visible successfully

        BrowserUtils.verifyURL("https://automationexercise.com/");

        //4. Click on 'Contact Us' button

        firstPage.contactUsButton.click();

        //5. Verify 'GET IN TOUCH' is visible

        BrowserUtils.verifyVisibleTextEqual(contactUsPage.getInTouchText, "GET IN TOUCH");

        //6. Enter name, email, subject and message

        contactUsPage.inputName.sendKeys(faker.name().username());
        contactUsPage.inputEmail.sendKeys(faker.internet().emailAddress());
        contactUsPage.inputSubject.sendKeys(faker.letterify("?????"));
        contactUsPage.inputMessage.sendKeys(faker.lorem().characters());

        //7. Upload file

        contactUsPage.chooseFile.sendKeys("C:\\Users\\masha\\OneDrive\\Desktop\\Mariia.txt");

        //8. Click 'Submit' button

        contactUsPage.submitButton.click();

        //9. Click OK button

        Alert alert = Driver.getDriver().switchTo().alert();

        alert.accept();
//
//        BrowserUtils.sleep(3);
//        try {
//            BrowserUtils.closeAds();
//        } catch (NoSuchElementException e){
//
//        }

        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible

        BrowserUtils.verifyVisibleTextEqual(contactUsPage.successMessage, "Success! Your details have been submitted successfully.");

        //11. Click 'Home' button and verify that landed to home page successfully

        contactUsPage.homeButton.click();

        BrowserUtils.verifyTitleContains("Automation Exercise");
    }

}
