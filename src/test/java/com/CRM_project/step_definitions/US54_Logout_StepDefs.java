package com.CRM_project.step_definitions;

import com.CRM_project.pages.BasePage;
import com.CRM_project.pages.LoginPage;
import com.CRM_project.pages.ProfileNamePage;
import com.CRM_project.utilities.BrowserUtils;
import com.CRM_project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US54_Logout_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the users are on the homepage")
    public void the_users_are_on_the_homepage() {
        loginPage.the_user_logged_in_as("hr");
    }

    ProfileNamePage profileNamePage = new ProfileNamePage();

    @When("users click the user profile name")
    public void users_click_the_user_profile_name() {
       profileNamePage.profileButton.click();
    }

    @When("users select the {string} option")
    public void users_select_the_option(String string) {
        loginPage.logoutButton.click();
    }


    @Then("verify the user back to the login page")
    public void verify_the_user_back_to_the_login_page() {
        BrowserUtils.verifyTitle("Authorization");
    }



}
