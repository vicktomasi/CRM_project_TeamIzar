package com.CRM_project.pages;

import com.CRM_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DesktopOptionPage extends BasePage{

    public DesktopOptionPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//div[.='Desktop client']")
    public WebElement desktopClient;

    @FindBy(xpath = "//span[.='Mac OS']")
    public WebElement macOS;

    @FindBy(xpath = "//span[.='Windows']")
    public WebElement windows;

    @FindBy(xpath = "//span[.='Linux']")
    public WebElement linux;

    @FindBy(xpath = "//*[@id='sidebar']/div[6]/div[2]")
    public List<WebElement> desktopDownloadOptions;


}
