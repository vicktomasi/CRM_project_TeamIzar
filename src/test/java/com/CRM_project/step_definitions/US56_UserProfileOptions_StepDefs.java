package com.CRM_project.step_definitions;

import com.CRM_project.pages.BasePage;
import com.CRM_project.pages.DropdownsPage;
import com.CRM_project.pages.LoginPage;
import com.CRM_project.pages.ProfileNamePage;
import com.CRM_project.utilities.BrowserUtils;
import com.CRM_project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US56_UserProfileOptions_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("users are on the homepage")
    public void users_are_on_the_homepage() {
        loginPage.the_user_logged_in_as("hr");
    }

    ProfileNamePage profileNamePage = new ProfileNamePage();

    @When("users click the profile name")
    public void users_click_the_profile_name() {
        profileNamePage.profileButton.click();
    }

    DropdownsPage dropdownsPage = new DropdownsPage();

    @Then("verify the users see following options:")
    public void verify_the_users_see_following_options(io.cucumber.datatable.DataTable dataTable) {

        for (WebElement each : dropdownsPage.profileDropdownOptions) {
            Assert.assertTrue(each.isDisplayed());
        }

    }


}
