package com.CRM_project.pages;

import com.CRM_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoreTabPage extends BasePage{

    public MoreTabPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-more']")
    public WebElement moreDropdown;

    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-feed-add-post-form-popup']/div/div/span[1]/span[2]")
    public WebElement file;

    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-feed-add-post-form-popup']/div/div/span[2]/span[2]")
    public WebElement appreciation;

    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-feed-add-post-form-popup']/div/div/span[3]")
    public WebElement announcement;

    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-feed-add-post-form-popup']/div/div/span[4]/span[2]")
    public WebElement workflow;



}
