package com.sprint2.pages;

import com.sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage_AE {

    public MyProfilePage_AE(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "profile-menu-filter")
    public WebElement profileMenu;

    @FindBy (xpath = "//td[@class='user-profile-nowrap-second']/a")
    public WebElement email;

}
