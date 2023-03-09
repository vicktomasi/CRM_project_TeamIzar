package com.CRM_project.step_definitions;

import com.CRM_project.pages.BasePage;
import com.CRM_project.pages.CompanyPage;
import com.CRM_project.pages.LoginPage;
import com.CRM_project.utilities.BrowserUtils;
import com.CRM_project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class US64_AccessCompanyPage_StepDefs {

    LoginPage loginPage = new LoginPage();
    CompanyPage companyPage = new CompanyPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get("https://login2.nextbasecrm.com/");
    }
    @When("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        loginPage.the_user_logged_in_as(userType);
    }
    @Given("users are on the homepage")
    public void users_are_on_the_homepage() {
        BrowserUtils.verifyTitle("Portal");
    }
    @When("users click the Company module")
    public void users_click_the_company_module() {
        companyPage.companyPageModule.click();
    }

    @Then("verify users see the the users see flowing seven options:")
    public void verifyUsersSeeTheTheUsersSeeFlowingSevenOptions(List<String> expectedOptions) {

        for (WebElement each : companyPage.companyPageModuleOptions) {
            Assert.assertTrue(each.isDisplayed());
        }

    }
}
