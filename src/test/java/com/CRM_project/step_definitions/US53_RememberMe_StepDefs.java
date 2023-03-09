package com.CRM_project.step_definitions;

import com.CRM_project.pages.BasePage;
import com.CRM_project.pages.LoginPage;
import com.CRM_project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US53_RememberMe_StepDefs extends BasePage {

LoginPage loginPage = new LoginPage();
    @Given("the users go to the login page")
    public void theUsersGoToTheLoginPage() {
        Driver.getDriver().get("http://login2.nextbasecrm.com/");
    }

    @Then("Verify there is a “Remember me on this computer” message displayed")
    public void verify_there_is_a_remember_me_on_this_computer_message_displayed() {

    loginPage.checkboxText.isDisplayed();
    }
    @Then("verify the check box is clickable")
    public void verify_the_check_box_is_clickable() {
     loginPage.rememberMeCheckbox.click();


    Assert.assertTrue(loginPage.rememberMeCheckbox.isSelected());
    }



}
