package com.CRM_project.step_definitions;

import com.CRM_project.pages.Homepage;
import com.CRM_project.pages.LoginPage;
import com.CRM_project.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US62_accessTheEmpoyees_StepDefs {


        LoginPage loginPage = new LoginPage();
        Homepage Homepage = new Homepage();

/*
        @Given("users are on the homepage")
        public void users_are_on_the_homepage() {
            loginPage.the_user_logged_in_as("hr");

        }

 */
        @When("users click the Employees module")
        public void users_click_the_employees_module() {
                Homepage.employees.click();




        }
        @Then("verify the users see flowing options:")
        public void verify_the_users_see_flowing_options(List<String> listOfOptions) {



            Assert.assertTrue(Homepage.companyStructure.isDisplayed());
            BrowserUtils.sleep(3);
            Assert.assertTrue(Homepage.findEmployee.isDisplayed());
            BrowserUtils.sleep(3);
            Assert.assertTrue(Homepage.telephoneDirectory.isDisplayed());
            BrowserUtils.sleep(3);
            Assert.assertTrue(Homepage.staffChanges.isDisplayed());
            BrowserUtils.sleep(3);
            Assert.assertTrue(Homepage.efficiencyReport.isDisplayed());
            BrowserUtils.sleep(3);
            Assert.assertTrue(Homepage.honoredEmployees.isDisplayed());
            BrowserUtils.sleep(3);
            Homepage.moreDropdown.click();
            Assert.assertTrue(Homepage.birthdays.isDisplayed());
            BrowserUtils.sleep(3);
            Assert.assertTrue(Homepage.newPage.isDisplayed());



            BrowserUtils.sleep(3);

            System.out.println("listOfOptions = " + listOfOptions);




        }


    }



