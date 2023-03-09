package com.CRM_project.pages;

import com.CRM_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MobileAppOptionsPage extends BasePage{

    public MobileAppOptionsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='sidebar']/div[6]/div[2]")
    public List<WebElement> MobileAppOptions;

}
