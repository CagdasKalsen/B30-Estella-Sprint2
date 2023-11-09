package com.sprint2.step_definitions;

import com.sprint2.pages.ActivityPage_CK;
import com.sprint2.utilities.BrowserUtils;
import com.sprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.math3.analysis.function.Exp;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class B30G17_146_Upload_Step_Def_CK {
    ActivityPage_CK activityPage=new ActivityPage_CK();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
    @When("user clicks on Appreciation section")
    public void user_clicks_on_appreciation_section() {
        activityPage.appreciation.click();
    }
    @When("user clicks upload files section")
    public void user_clicks_upload_files_section() {

        wait.until(ExpectedConditions.elementToBeClickable(activityPage.uploadFile));
        activityPage.uploadFile.click();
    }
    @When("user sends file to Upload field")
    public void user_sends_file_to_upload_filed() {
        String path="/Users/cagdas/IdeaProjects/B30-Estella-Sprint2/screenshot.png";
        activityPage.uploadFileImagesField.sendKeys(path);
    }
    @When("user  Uploads files and images")
    public void selects_a_file_with_a() {
        Assert.assertTrue(activityPage.fileName.isDisplayed());
    }
    @Then("the file should be uploaded successfully and be displayed under Attached files and images section with  type")
    public void theFileShouldBeUploadedSuccessfullyAndBeDisplayedUnderAttachedFilesAndImagesSectionWithType(List<String> expectedFileType) {
        wait.until(ExpectedConditions.visibilityOf(activityPage.fileName));
        String formatType=activityPage.fileName.getText();
        formatType=formatType.substring(formatType.lastIndexOf("."));
        boolean fileTypeMatched = false;
        for (String each : expectedFileType) {
            if (each.equals(formatType)){
                fileTypeMatched=true;
            }
        }
        Assert.assertTrue(fileTypeMatched);

    }


    @Given("user is on the home page and and the file is uploaded successfully")
    public void userIsOnTheHomePageAndAndTheFileIsUploadedSuccessfully() {
        activityPage.moreBtn.click();
        activityPage.appreciation.click();
        wait.until(ExpectedConditions.elementToBeClickable(activityPage.uploadFile));
        activityPage.uploadFile.click();
        String path="/Users/cagdas/IdeaProjects/B30-Estella-Sprint2/screenshot.png";
        activityPage.uploadFileImagesField.sendKeys(path);
    }

    @When("the user clicks on the Insert in text section")
    public void theUserClicksOnTheInsertInTextSection() {
        activityPage.inTextBtn.click();

    }

    @Then("the file should be inserted into the text area")
    public void theFileShouldBeInsertedIntoTheTextArea() {

        Driver.getDriver().switchTo().frame(activityPage.iFrame);
        wait.until(ExpectedConditions.visibilityOf(activityPage.textArea));
        Assert.assertTrue(activityPage.textArea.isDisplayed());
    }

    @Given("user is on the home page and and the file is uploaded successfully and displayed in text area")
    public void userIsOnTheHomePageAndAndTheFileIsUploadedSuccessfullyAndDisplayedInTextArea() {
        userIsOnTheHomePageAndAndTheFileIsUploadedSuccessfully();
        theUserClicksOnTheInsertInTextSection();
    }

    @When("the user clicks on the X button next to the In text section")
    public void theUserClicksOnTheXButtonNextToTheInTextSection() {
        wait.until(ExpectedConditions.elementToBeClickable(activityPage.deleteBtn));
        try{
            activityPage.deleteBtn.click();
        }catch (ElementClickInterceptedException e){
            e.printStackTrace();
        }
        BrowserUtils.sleep(3);
//        wait.until(ExpectedConditions.invisibilityOf(activityPage.deleteBtn));


    }


    @Then("the file should be removed from the text area and Attached files and images area")
    public void theFileShouldBeRemovedFromTheTextAreaAndAttachedFilesAndImagesArea()
    {
        try{
//            Assert.assertTrue(!activityPage.fileName3.isDisplayed());
            Assert.assertFalse("failed",activityPage.fileName3.isDisplayed());
            throw new RuntimeException("Assertion failed , txt area is displayed ");
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("Assertion passed , text area is not displayed");
        }

//        try {
//            Assert.assertTrue(!activityPage.deleteBtn.isDisplayed());
//            throw new RuntimeException("Assertion failed, text area is displayed");
//        } catch (NoSuchElementException e) {
//            e.printStackTrace();
//            System.out.println("Assertion passed, text area is not displayed");
//        }


    }

    @When("the user click X button")
    public void theUserClickXButton() {
//        wait.until(ExpectedConditions.elementToBeClickable(activityPage.deleteBtn));
        try{
            activityPage.deleteBtn.click();
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }

    }

    @Then("the file should be remove")
    public void theFileShouldBeRemove() {
        Assert.assertTrue(!activityPage.fileName.isDisplayed());
    }
}
