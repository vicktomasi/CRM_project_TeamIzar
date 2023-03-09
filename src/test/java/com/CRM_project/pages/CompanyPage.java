package com.CRM_project.pages;

import com.CRM_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {

    public CompanyPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

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
