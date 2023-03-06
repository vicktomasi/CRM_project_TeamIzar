package com.CRM_project.pages;


import com.CRM_project.utilities.BrowserUtils;
import com.CRM_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="USER_LOGIN")
    public WebElement username;

    @FindBy(name="USER_PASSWORD")
    public WebElement password;

    @FindBy(className="login-btn")
    public WebElement loginButton;

    @FindBy(name= "USER_REMEMBER")
    public WebElement rememberMeCheckbox;

    @FindBy(className ="login-item-checkbox-label")
    public WebElement checkboxText;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutButton;

    @FindBy(id = "user-name")
    public WebElement profileButton;




    public void login(String userNameStr, String passwordStr) {
        username.sendKeys(userNameStr);
        BrowserUtils.sleep(5);
        password.sendKeys(passwordStr);
        BrowserUtils.sleep(5);

        loginButton.click();
        // verification that we logged
    }

}
