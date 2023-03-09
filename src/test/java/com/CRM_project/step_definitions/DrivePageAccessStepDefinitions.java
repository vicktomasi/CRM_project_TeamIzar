package com.CRM_project.step_definitions;

import com.CRM_project.pages.BasePage;
import com.CRM_project.pages.DrivePageAccessPage;
import com.CRM_project.utilities.BrowserUtils;
import com.CRM_project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class DrivePageAccessStepDefinitions  {
 DrivePageAccessPage drivePageAccessPage=new DrivePageAccessPage();
LoginStepDefs loginStepDefs=new LoginStepDefs();
    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        BrowserUtils.sleep(3);

       loginStepDefs.the_user_logged_in_as("hr");


    }

    @When("user clicks the Drive option in the menu")
    public void user_clicks_the_drive_option_in_the_menu() {
       drivePageAccessPage.drive.click();
    }

    @Then("verify users see following options")
    public void verify_users_see_following_options(List<String>listOfModules) {
        Assert.assertTrue(drivePageAccessPage.myDrive.isDisplayed());
        Assert.assertTrue(drivePageAccessPage.allDocuments.isDisplayed());
        Assert.assertTrue(drivePageAccessPage.companyDrive.isDisplayed());
        Assert.assertTrue(drivePageAccessPage.salesAndMarketing.isDisplayed());
        Assert.assertTrue(drivePageAccessPage.topManagementAndDoc.isDisplayed());
        Assert.assertTrue(drivePageAccessPage.driveCleanup.isDisplayed());

    }


}
