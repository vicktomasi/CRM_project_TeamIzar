package com.CRM_project.pages;

import com.CRM_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ConfigureMenuPage {


    public ConfigureMenuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='left-menu-settings']")
    public WebElement configureMenuPageModule;

    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-leftMenuSettingsPopup']")
    public List<WebElement> configureMenuPageOptions;

    @FindBy(xpath = "//span[.='Configure menu items']/../..")
    public WebElement configureMenuItemsLink;

    @FindBy(xpath = "//span[.='Collapse menu']/../..")
    public WebElement collapseMenuLink;

    @FindBy(xpath = "//span[.='About Company']/../..")
    public WebElement removeCurrentPageLink;

    @FindBy(xpath = "//span[.='Photo Gallery']/../..")
    public WebElement addCustomMenuItemLink;

    @FindBy(xpath = "//span[.='Video']/../..")
    public WebElement changePrimaryToolLink;

    @FindBy(xpath = "//span[.='Career']/../..")
    public WebElement resetMenuLink;


}
