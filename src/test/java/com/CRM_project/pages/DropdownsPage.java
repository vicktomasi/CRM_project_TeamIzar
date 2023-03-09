package com.CRM_project.pages;

import com.CRM_project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownsPage extends BasePage {

    public DropdownsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Select userProfileDropdown = new Select(Driver.getDriver().findElement(By.xpath("//*[@id='popup-window-content-menu-popup-user-menu']/div")));


    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-user-menu']/div")
    public List <WebElement> profileDropdownOptions;

}
