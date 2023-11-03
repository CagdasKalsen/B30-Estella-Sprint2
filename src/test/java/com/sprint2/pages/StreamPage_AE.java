package com.sprint2.pages;

import com.sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StreamPage_AE {

    public StreamPage_AE(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-block")
    public WebElement userBlock;

    @FindBy (linkText = "My Profile")
    public WebElement myProfile;
}
