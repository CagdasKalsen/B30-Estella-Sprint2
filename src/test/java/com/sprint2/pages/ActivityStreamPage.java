package com.sprint2.pages;

import com.sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage {

    public ActivityStreamPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "div[id='sitemap-menu']")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//a[.='Activity Stream']")
    public WebElement activityStreamButton;

    @FindBy(xpath = "//span[.='Poll']")
    public WebElement pollButton;

    @FindBy (xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iFrameElement;

    @FindBy (xpath = "//body[@contenteditable='true']")
    public WebElement textInput;

    @FindBy (xpath = "(//span[.='All employees'])[3]")
    public WebElement defaultRecipient;

    @FindBy (xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement removeDefaultRecipient;


    @FindBy (xpath = "//a[@id='bx-destination-tag']")
    public WebElement addNewRecipientButton;

    @FindBy (xpath = "//input[@id='feed-add-post-destination-input']")
    public WebElement addNewRecipientInputBox;

    @FindBy (xpath = "//input[@id='question_0']")
    public WebElement questionInput1;

    @FindBy (xpath = "//input[@id='answer_0__0_']")
    public WebElement answer1Input1;


    @FindBy (xpath = "//a[.='Add question']")
    public WebElement addNewQuestion;

    @FindBy (xpath = "//input[@id='answer_0__1_']")
    public WebElement answer2Input1;

    @FindBy (xpath = "//input[@id='question_1']")
    public WebElement questionInput2;

    @FindBy (xpath = "//input[@id='answer_1__0_']")
    public WebElement answer1Input2;

    @FindBy (xpath = "//input[@id='answer_1__1_']")
    public WebElement answer2Input2;


    @FindBy (xpath = "//input[@id='multi_0']")
    public WebElement allowMultipleChoiceCheckBox;

    @FindBy (xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy (xpath = "//a[@class='feed-post-user-name']")
    public WebElement firstPostedEmail;


    @FindBy (xpath = "//button[.='Vote']")
    public WebElement firstPostedVoteButton;



    @FindBy (xpath = "//span[@class='user-name']")
    public WebElement username;



    @FindBy (xpath = "//span[@class='user-name']")
    public WebElement profileDropMenu;


    @FindBy (xpath = "//span[.='My Profile']")
    public WebElement myProfileTab;



    @FindBy (xpath = "//div[@class='feed-add-error']/span[2]")
    public WebElement errorMessage;



    @FindBy (xpath = "(//span[@class='bx-vote-block-inp-substitute'])[2]")
    public WebElement pollCheckBox2;

    @FindBy (xpath = "(//span[@class='bx-vote-block-inp-substitute'])[2]/../input")
    public WebElement pollCheckBox2InputTag;


    @FindBy (xpath = "(//span[@class='bx-vote-block-inp-substitute'])[1]")
    public WebElement pollCheckBox1;

    @FindBy (xpath = "(//span[@class='bx-vote-block-inp-substitute'])[1]/../input")
    public WebElement pollCheckBox1InputTag;


    @FindBy (xpath = "(//label[@class='bx-vote-block-input-wrap-inner'])[4]/span")
    public WebElement pollRadioButton2;

    @FindBy (xpath = "(//label[@class='bx-vote-block-input-wrap-inner'])[4]/input")
    public WebElement pollRadioButton2InputTag;


    @FindBy (xpath = "(//label[@class='bx-vote-block-input-wrap-inner'])[3]/span")
    public WebElement pollRadioButton1;

    @FindBy (xpath = "(//label[@class='bx-vote-block-input-wrap-inner'])[3]/input")
    public WebElement pollRadioButton1InputTag;


    public String getUsername(){

      return   username.getText();

    }





}
