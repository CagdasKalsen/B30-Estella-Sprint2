package com.sprint2.pages;

import com.sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class B30G17_143_Activity_Page_CK {

    public B30G17_143_Activity_Page_CK(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='logo-text']")
    public WebElement rm24;

    @FindBy(xpath = "(//div[@id='feed-add-post-form-tab']/span)")
    public List<WebElement> options;

    @FindBy(id = "feed-add-post-form-link-more")
    public WebElement moreBtn;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span")
    public List<WebElement> moreBtnOptions;
}
