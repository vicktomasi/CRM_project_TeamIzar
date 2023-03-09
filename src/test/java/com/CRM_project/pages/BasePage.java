package com.CRM_project.pages;




import com.CRM_project.utilities.BrowserUtils;
import com.CRM_project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.time.Duration;
import java.util.List;

public abstract class BasePage {
    

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutButton;

    @FindBy(id = "user-name")
    public WebElement profileButton;

    @FindBy(xpath = "//div[.='Desktop client']")
    public WebElement desktopClient;

    @FindBy(xpath = "//span[.='Mac OS']")
    public WebElement macOS;

    @FindBy(xpath = "//span[.='Windows']")
    public WebElement windows;

    @FindBy(xpath = "//span[.='Linux']")
    public WebElement linux;

    @FindBy(xpath = "/div[.='Mobile application']")
    public WebElement mobileApp;

    @FindBy(xpath = "//span[.='App Store']")
    public WebElement appStore;

    @FindBy(xpath = "//span[.='Google Play']")
    public WebElement googlePlay;

    @FindBy(xpath = "//span[.='My Profile']")
    public WebElement myProfile;

    @FindBy(xpath = "//span[.='Edit Profile Settings']")
    public WebElement editProfile;

    @FindBy(xpath = "//span[@class='menu-popup-item menu-popup-no-icon ']/span[.='Themes']")
    public WebElement themes;

    @FindBy(xpath = "//span[@class='menu-popup-item menu-popup-no-icon ']/span[.='Configure notifications']")
    public WebElement configureNotifications;


    @FindBy(xpath = "/span[@class='feed-add-post-more-icon']")
    public WebElement moreDropdown;

    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-feed-add-post-form-popup']/div/div/span[1]/span[2]")
    public WebElement file;

    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-feed-add-post-form-popup']/div/div/span[2]/span[2]")
    public WebElement appreciation;

    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-feed-add-post-form-popup']/div/div/span[3]")
    public WebElement announcement;

    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-feed-add-post-form-popup']/div/div/span[4]/span[2]")
    public WebElement workflow;

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

    @FindBy(xpath = "//*[@id='bx_left_menu_menu_files']/a/span")
    public WebElement drive;

    @FindBy(xpath = "//span[.='My Drive']")
    public WebElement myDrive;

    @FindBy(xpath = "//span[.='All Documents']")
    public WebElement allDocuments;

    @FindBy(xpath = "//span[.='Company Drive']")
    public WebElement companyDrive;

    @FindBy(xpath = "//span[.='Sales and Marketing']")
    public WebElement salesAndMarketing;

    @FindBy(xpath = "//*[@id='top_menu_id_docs_3526888156']/a/span[2]/span[2]")
    public WebElement topManagementAndDoc;

    @FindBy(xpath = "//*[@id='top_menu_id_docs_menu_my_disk_volume']/a/span[2]/span[2]")
    public WebElement driveCleanup;

    @FindBy(xpath = "//a[@title='Time and Reports']")
    public WebElement timeAndReports;

    @FindBy(id = "top_menu_id_timeman_menu_absence")
    public WebElement absence;

    @FindBy(id = "top_menu_id_timeman_menu_timeman")
    public WebElement worktime;

    @FindBy(id = "top_menu_id_timeman_menu_bitrix24time")
    public WebElement bitrix24;

    @FindBy(id = "top_menu_id_timeman_menu_work_report")
     public WebElement workReport;

    @FindBy(id = "top_menu_id_timeman_menu_meeting")
    public WebElement meetingAndBriefings;

    @FindBy(xpath = "//*[@id='content-table']/table/tbody/tr[1]/td/div/div[1]")
    public WebElement  timeAndReportsMainButtons;

    @FindBy(xpath = "//*[@id='bx_left_menu_menu_company']/a/span")
    public WebElement employees;

    @FindBy(xpath = "//*[@id='top_menu_id_company_3271504278']/a/span[2]/span[2]")
    public WebElement companyStructure;

    @FindBy(xpath = "//*[@id='top_menu_id_company_342409671']/a/span[2]/span[2]")
    public WebElement findEmployee;

    @FindBy(xpath = "//*[@id='top_menu_id_company_2000783151']/a/span[2]/span[2]")
    public WebElement telephoneDirectory;

    @FindBy(xpath = "//*[@id='top_menu_id_company_1210526945']/a/span[2]/span[2]")
    public WebElement staffChanges;

    @FindBy(xpath = "//*[@id='top_menu_id_company_3998073650']/a/span[2]/span[2]")
    public WebElement efficiencyReport;

    @FindBy(xpath = "//*[@id='top_menu_id_company_1597013884']/a/span[2]/span[2]" )
    public WebElement honoredEmployees;

    @FindBy(xpath = "//*[@id='top_menu_id_company_1125184122']/a/span[2]/span[2]")
    public WebElement birthdays;

    @FindBy(xpath = "//*[@id='top_menu_id_company_27577212']/a/span[2]/span[2]")
    public WebElement newPage;

    @FindBy(xpath = "//*[@id='content-table']/table/tbody/tr[1]/td/div/div[1]")
    public WebElement employeeMainButtons;

    //Locator for "Configure Menu":
    @FindBy(xpath = "//*[@id='left-menu-settings']")
    public WebElement configureMenu;

    //Locator for Configure Menu Option:
    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-leftMenuSettingsPopup']/div/div/span[1]/span[2]")
    public WebElement configureMenuItems;

    //Locator for "Collapse Menu":
    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-leftMenuSettingsPopup']/div/div/span[2]/span[2]")
    public WebElement collapseMenu;


    //Locator for "Remove current page from left menu":
    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-leftMenuSettingsPopup']/div/div/span[3]/span[2]")
    public WebElement removeCurrentPage;

    //Locator for "Add custom menu item":
    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-leftMenuSettingsPopup']/div/div/span[4]/span[2]")
    public WebElement addCustomItem;

    //Locator for "Change primary tool":
    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-leftMenuSettingsPopup']/div/div/span[5]/span[2]")
    public WebElement changePrimaryTool;

    //Locator for "Reset menu":
    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-leftMenuSettingsPopup']/div/div/span[6]/span[2]")
    public WebElement resetMenu;

    @FindBy(css = "a[title='Company']")
    public WebElement companyPageModule;

    @FindBy(xpath = "//div[@class='main-buttons-inner-container']/..")
    public WebElement companyPageModuleOptions;

    @FindBy(xpath = "//span[.='Official Information']/../..")
    public WebElement officialInformationLink;

    @FindBy(xpath = "//span[.='Our Life']/../..")
    public WebElement ourLifeLink;

    @FindBy(xpath = "//span[.='About Company']/../..")
    public WebElement aboutCompanyLink;

    @FindBy(xpath = "//span[.='Photo Gallery']/../..")
    public WebElement photoGalleryLink;

    @FindBy(xpath = "//span[.='Video']/../..")
    public WebElement videoLink;

    @FindBy(xpath = "//span[.='Career']/../..")
    public WebElement careerLink;

    @FindBy(xpath = "//span[.='Business News (RSS)']/../..")
    public WebElement businessNewsLink;


















}





