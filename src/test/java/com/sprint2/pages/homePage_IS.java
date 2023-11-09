package com.sprint2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class homePage_IS extends BasePage{

   // @FindBy(id = "user-block")

    @FindBy(id = "*[@id = 'user-block']")
    public WebElement userProfile;

    @FindBy(id = "user-name")
    public WebElement userProfileName;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logout;


    //@FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div")
   // public WebElement menuDropdown;


}
