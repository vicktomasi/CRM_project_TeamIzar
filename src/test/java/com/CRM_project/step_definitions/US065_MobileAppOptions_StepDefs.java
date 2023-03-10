package com.CRM_project.step_definitions;

import com.CRM_project.pages.BasePage;
import com.CRM_project.pages.LoginPage;
import com.CRM_project.pages.MobileAppOptionsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US065_MobileAppOptions_StepDefs {

    LoginPage loginPage = new LoginPage();

    /*
    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        loginPage.the_user_logged_in_as("hr");
    }

     */

    MobileAppOptionsPage mobileAppOptionsPage = new MobileAppOptionsPage();

    @Then("user should see the following mobile app options:")
    public void user_should_see_the_following_mobile_app_options(io.cucumber.datatable.DataTable dataTable) {
        for (WebElement each : mobileAppOptionsPage.MobileAppOptions) {
            Assert.assertTrue(each.isDisplayed());
        }


    }
}
