package com.sprint2.pages;


import com.sprint2.utilities.BrowserUtils;
import com.sprint2.utilities.ConfigurationReader;
import com.sprint2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.Utilities;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement userName;



    @FindBy(name="USER_PASSWORD")
    public WebElement password;

    @FindBy(id="USER_REMEMBER")
    public WebElement checkBox;
    @FindBy(css = ".login-text.login-item")
    public WebElement checkBoxDiv;

    @FindBy(className = "login-btn")
    public WebElement submit;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordHidden;


    public void login(String userNameStr) {

        userName.sendKeys(userNameStr);
        password.sendKeys(ConfigurationReader.getProperty("password"));
        submit.click();
        // verification that we logged
    }

    public void login(String userNameStr,String password) {

        userName.sendKeys(userNameStr);
        this.password.sendKeys(password);
        submit.click();
        // verification that we logged
    }

    public void loginWithUserType(String usertype){
        if (usertype.equalsIgnoreCase("hr")){
            login(ConfigurationReader.getProperty("hr_username"));
        }
        else if (usertype.equalsIgnoreCase("helpdesk")){
            login(ConfigurationReader.getProperty("helpdesk_username"));
        }
        else if (usertype.equalsIgnoreCase("marketing")){
            login(ConfigurationReader.getProperty("marketing_username"));
        }
    }

}
