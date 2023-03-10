package com.CRM_project.pages;

import com.CRM_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeAndReportsPage extends BasePage {

    public TimeAndReportsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
