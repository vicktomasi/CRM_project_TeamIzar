package com.CRM_project.step_definitions;

import com.CRM_project.pages.ConfigureMenuPage;
import com.CRM_project.pages.LoginPage;
import com.CRM_project.utilities.BrowserUtils;
import com.CRM_project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US63_ConfigureMenu_StepDefs {


    LoginPage loginPage = new LoginPage();
    ConfigureMenuPage configureMenuPage = new ConfigureMenuPage();

  /*  @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get("https://login2.nextbasecrm.com/");
    }*/

    /*
    @When("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        loginPage.the_user_logged_in_as(userType);
    }
    @Given("users are on the homepage")
    public void users_are_on_the_homepage() {
        BrowserUtils.verifyTitle("Portal");
    }

     */
    @When("users click the Configure Menu module")
    public void usersClickTheConfigureMenuModule() {
        configureMenuPage.configureMenuPageModule.click();
    }

    @Then("verify users see the the users see flowing six options:")
    public void verifyUsersSeeTheTheUsersSeeFlowingSixOptions(io.cucumber.datatable.DataTable dataTable) {

        for (WebElement each : configureMenuPage.configureMenuPageOptions) {
            Assert.assertTrue(each.isDisplayed());
        }

    }


}
