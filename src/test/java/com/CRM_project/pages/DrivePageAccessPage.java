package com.CRM_project.pages;

import com.CRM_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrivePageAccessPage {
    public DrivePageAccessPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@id='bx_left_menu_menu_files']/a/span")
    public WebElement drive;
    @FindBy(xpath = "//span[.='My Drive']")
    public  WebElement myDrive;

    @FindBy(xpath = "//span[.='All Documents']")
    public  WebElement allDocuments;

    @FindBy(xpath = "//span[.='Company Drive']")
    public  WebElement companyDrive;

    @FindBy(xpath = "//span[.='Sales and Marketing']")
    public  WebElement salesAndMarketing;

     @FindBy(xpath = "//*[@id='top_menu_id_docs_3526888156']/a/span[2]/span[2]")
    public  WebElement topManagementAndDoc;

     @FindBy(xpath = "//*[@id='top_menu_id_docs_menu_my_disk_volume']/a/span[2]/span[2]")
    public  WebElement driveCleanup;

}
