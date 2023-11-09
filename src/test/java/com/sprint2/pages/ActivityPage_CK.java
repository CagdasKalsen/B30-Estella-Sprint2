package com.sprint2.pages;

import com.sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityPage_CK {

    public ActivityPage_CK(){
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

    @FindBy(xpath = "//div[@class='menu-popup-items']/span[.='Appreciation']")
    public WebElement appreciation;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFile;
    @FindBy(xpath = "//div[@class='diskuf-uploader']//input")
    public WebElement uploadFileImagesField;

    @FindBy(xpath = "//span[@class='f-wrap']")
    public WebElement fileName;
    @FindBy(xpath = "//img[@class='files-preview']")
    public WebElement fileName2;

//    public String getFileType(String fileName){
//
//    }

    @FindBy(xpath = "//span[@class='insert-btn-text']")
    public WebElement inTextBtn;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iFrame;

    @FindBy(xpath ="//img[contains(@id, 'bxid')]")
    public WebElement textArea;

    @FindBy(xpath = "//span[contains(text(), 'screenshot')]")
    public WebElement fileName3;

    @FindBy(xpath = "//td[@class='files-del-btn']/span")
    public WebElement deleteBtn;

    @FindBy(xpath = "//a[@class='files-path']")
    public WebElement filePath;



}
