package com.CRM_project.step_definitions;

import com.CRM_project.pages.BasePage;
import com.CRM_project.pages.LoginPage;
import com.CRM_project.pages.MoreTabPage;
import com.CRM_project.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US57_MoreTab_StepDefs {

    LoginPage loginPage = new LoginPage();
    MoreTabPage moreTabPage = new MoreTabPage();

    @When("user clicks the MORE tab")
    public void userClicksTheMORETab() {

        moreTabPage.moreDropdown.click();
        BrowserUtils.sleep(3);
    }

    @Then("verify the user sees the following four options:")
    public void verifyTheUserSeesTheFollowingFourOptions(List<String> ListOfOptions) {

        Assert.assertTrue(moreTabPage.file.isDisplayed());
        Assert.assertTrue(moreTabPage.appreciation.isDisplayed());
        Assert.assertTrue(moreTabPage.announcement.isDisplayed());
        Assert.assertTrue(moreTabPage.workflow.isDisplayed());

        System.out.println("ListOfOptions = " + ListOfOptions);


    }
}
