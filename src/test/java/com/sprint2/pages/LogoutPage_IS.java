package com.sprint2.pages;

import com.sprint2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

public class LogoutPage_IS {


    public LogoutPage_IS(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(id = "user-block")
    public WebElement userProfile;


    @FindBy(xpath = " (//a[@class='menu-popup-item menu-popup-no-icon '])[3]")
    public WebElement logOutBtn;


    @FindBy(xpath = "//*[@id=\"user-name\"]")
    public WebElement userNameDisplayed;

    @FindBy(xpath = "//div[@class='menu-popup']")
    public WebElement dropdownElement;

 @FindBy(xpath = "//span[@class='menu-popup-item-text']")
 public List<WebElement> DropDownMenu;
}


