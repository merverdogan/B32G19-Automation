package com.automation.cydeo.tests_Mariia;

import com.automation.cydeo.base_Mariia.TestBase;
import com.automation.cydeo.utilities_Mariia.BrowserUtils;
import org.testng.annotations.Test;

public class TC7_Verify_Test_Case_Page extends TestBase {

    //Test Case 7: Verify Test Cases Page
    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    @Test
    public void test_verify_test_case_page(){
        //3. Verify that home page is visible successfully

        BrowserUtils.verifyURL("https://automationexercise.com/");

        //4. Click on 'Test Cases' button

        firstPage.testCaseButton.click();

        //5. Verify user is navigated to test cases page successfully

        String expectedURL = "https://automationexercise.com/test_cases";

        BrowserUtils.verifyURL(expectedURL);
    }

}
