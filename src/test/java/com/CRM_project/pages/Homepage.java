package com.CRM_project.pages;

import com.CRM_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    public Homepage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
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

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-main_buttons_popup_top_menu_id_company\"]/div/div/a[7]/span[2]/span[1]/span[2]")
    public WebElement birthdays;



    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-main_buttons_popup_top_menu_id_company\"]/div/div/a[8]/span[2]/span[1]/span[2]")
    public WebElement newPage;


    @FindBy(xpath = "//*[@id=\"top_menu_id_company_more_button\"]/a/span[2]")
    public WebElement moreDropdown;





}
