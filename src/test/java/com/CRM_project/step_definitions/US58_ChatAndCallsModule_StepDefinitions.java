package com.CRM_project.step_definitions;

import com.CRM_project.pages.ChatAndCallsPage;
import com.CRM_project.pages.LoginPage;
import com.CRM_project.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
public class US58_ChatAndCallsModule_StepDefinitions {

   ChatAndCallsPage chatAndCallsPage = new ChatAndCallsPage();
    LoginPage loginPage = new LoginPage();

    @Given("users are on the homepage")
    public void users_are_on_the_homepage() {
        loginPage.the_user_logged_in_as("hr");
    }

    @When("users click the Chat and Calls module")
    public void users_click_the_chat_and_calls_module() {
       chatAndCallsPage.chatAndCallLink.click();

    }

    @Then("verify users see following four options:")
    public void verifyUsersSeeFollowingFourOptions(List<String> fourOptions) {

        Assert.assertTrue(chatAndCallsPage.messageLink.isDisplayed());
        BrowserUtils.sleep(3);
        Assert.assertTrue(chatAndCallsPage.notificationLink.isDisplayed());
        Assert.assertTrue(chatAndCallsPage.settingsLink.isDisplayed());
        Assert.assertTrue(chatAndCallsPage.activityStreamLink.isDisplayed());
        BrowserUtils.sleep(3);

        System.out.println("fourOptions = " + fourOptions);

    }


/*
    @Then("verify users see following {string} options: {string}")
    public void verifyUsersSeeFollowingOptions(String four, String options) {
        Assert.assertTrue(chatAndCallsPage.messageLink.isDisplayed());
        BrowserUtils.sleep(3);
        Assert.assertTrue(chatAndCallsPage.notificationLink.isDisplayed());
        Assert.assertTrue(chatAndCallsPage.settingsLink.isDisplayed());
        Assert.assertTrue(chatAndCallsPage.activityStreamLink.isDisplayed());
        BrowserUtils.sleep(3);

        System.out.println("These are the "+four+" options: "+options);

    }

 */

}




















