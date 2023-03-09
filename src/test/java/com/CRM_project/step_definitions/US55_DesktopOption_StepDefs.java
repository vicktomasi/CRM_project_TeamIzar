package com.CRM_project.step_definitions;

import com.CRM_project.pages.BasePage;
import com.CRM_project.pages.DesktopOptionPage;
import com.CRM_project.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US55_DesktopOption_StepDefs extends BasePage {

    LoginPage loginPage = new LoginPage();

    DesktopOptionPage desktopOptionPage = new DesktopOptionPage();

    @Given("users are on the homepage")
    public void users_are_on_the_homepage() {
     loginPage.the_user_logged_in_as("hr");


    }
    @Then("verify the users see following three options:")
    public void verify_the_users_see_following_three_options(io.cucumber.datatable.DataTable dataTable) {

        for (WebElement each : desktopOptionPage.desktopDownloadOptions){
            Assert.assertTrue(each.isDisplayed());
        }

    }

}
