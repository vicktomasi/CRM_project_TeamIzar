package com.CRM_project.step_definitions;

import com.CRM_project.pages.BasePage;
import com.CRM_project.pages.LoginPage;
import com.CRM_project.pages.TimeAndReportsPage;
import com.CRM_project.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.Time;
import java.util.List;

public class US61_TimeAndReports_StepDefs extends BasePage {

    // Constructor was created in order to use the method to login
    LoginPage loginPage = new LoginPage();

    TimeAndReportsPage timeAndReportsPage = new TimeAndReportsPage();

    /*@Given("user is on the homepage")
    public void user_is_on_the_homepage() {

        loginPage.the_user_logged_in_as("hr");
        BrowserUtils.sleep(2);

    }*/

    @When("user clicks the Time and Reports module")
    public void user_clicks_the_time_and_reports_module() {

        timeAndReportsPage.timeAndReports.click();

    }
    @Then("verify the user sees the following five options")
    public void verify_the_user_sees_the_following_five_options(List<String> listOfOptions) {

        Assert.assertTrue(timeAndReportsPage.absence.isDisplayed());
        Assert.assertTrue(timeAndReportsPage.worktime.isDisplayed());
        Assert.assertTrue(timeAndReportsPage.bitrix24.isDisplayed());
        Assert.assertTrue(timeAndReportsPage.workReport.isDisplayed());
        Assert.assertTrue(timeAndReportsPage.meetingAndBriefings.isDisplayed());

        System.out.println("listOfOptions = " + listOfOptions);
    }

}
