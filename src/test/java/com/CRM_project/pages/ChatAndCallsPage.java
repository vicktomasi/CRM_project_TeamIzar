package com.CRM_project.pages;

import com.CRM_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatAndCallsPage {


   public ChatAndCallsPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }


    @FindBy(xpath = "//a[@title='Chat and Calls']")
    public WebElement chatAndCallLink;

    // Locator for: Message
    @FindBy(xpath= "//*[@id='bx-desktop-tab-im']/div")
    public WebElement messageLink;

    // Locator for: Notification
    @FindBy(xpath = "//*[@id='bx-desktop-tab-notify']/div")
    public WebElement notificationLink;

    // Locator for: Settings
    @FindBy(xpath = "//*[@id='bx-desktop-tab-config']/div")
    public WebElement settingsLink;

    // Locator for: Active Stream
    @FindBy(xpath = "//*[@id='bx-desktop-tab-im-lf']/div")
    public WebElement activityStreamLink;


}
