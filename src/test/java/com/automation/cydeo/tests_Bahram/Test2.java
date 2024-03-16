package com.automation.cydeo.tests_Bahram;

import com.automation.cydeo.utilities.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
    @BeforeMethod
   public void test2() {
        Driver.getDriver();
    }


}
