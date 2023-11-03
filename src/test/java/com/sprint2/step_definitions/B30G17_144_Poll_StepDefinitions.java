package com.sprint2.step_definitions;

import com.sprint2.pages.ActivityStreamPage;
import com.sprint2.utilities.BrowserUtils;
import com.sprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class B30G17_144_Poll_StepDefinitions {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));



    @When("user click on Activity Stream")
    public void user_click_on_activity_stream() {

        activityStreamPage.hamburgerMenu.click();

        activityStreamPage.activityStreamButton.click();
    }


    @When("user click on Poll tab")
    public void user_click_on_poll_tab() {
       activityStreamPage.pollButton.click();
    }


    @Then("The delivery should be addressed to {string} by default")
    public void the_delivery_should_be_addressed_to_by_default(String expectedDefaultRecipient) {

       WebElement actualDefaultRecipient = activityStreamPage.defaultRecipient;

       Assert.assertTrue(actualDefaultRecipient.isDisplayed());
       Assert.assertEquals(expectedDefaultRecipient,actualDefaultRecipient.getText());

    }


    @When("user adds a message {string}")
    public void user_adds_a_message(String message) {

        Driver.getDriver().switchTo().frame(activityStreamPage.iFrameElement);

        activityStreamPage.textInput.clear();
        activityStreamPage.textInput.sendKeys(message);
    }


    @When("user removes the default recipient")
    public void user_removes_the_default_recipient() {

        Driver.getDriver().switchTo().parentFrame();

        wait.until(ExpectedConditions.visibilityOf(activityStreamPage.removeDefaultRecipient));
        //jsExecutor.executeScript("arguments[0].remove();",activityStreamPage.removeDefaultRecipient);
        activityStreamPage.removeDefaultRecipient.click();
        //clear();
        //sendKeys(Keys.DELETE);
        // activityStreamPage.removeDefaultRecipient.click();
    }

    @When("user adds a question {string}")
    public void user_adds_a_question(String question) {
       Driver.getDriver().switchTo().parentFrame();

        activityStreamPage.questionInput1.clear();
       activityStreamPage.questionInput1.sendKeys(question);
    }


    @When("user adds multiple answers {string} and {string}")
    public void user_adds_multiple_answers_and(String answer1, String answer2) {

        WebElement answer1Element =  activityStreamPage.answer1Input1;
        WebElement answer2Element =  activityStreamPage.answer2Input1;

        answer1Element.clear();
        answer2Element.clear();

       answer1Element.sendKeys(answer1);
       answer2Element.sendKeys(answer2);
    }


    @Then("user should be able to create a poll")
    public void user_should_be_able_to_create_a_poll() {

        String actualEmail = activityStreamPage.firstPostedEmail.getText();
        String expectedEmail = activityStreamPage.getUsername();


        wait.until(ExpectedConditions.textToBePresentInElement (activityStreamPage.firstPostedEmail, expectedEmail));



        Assert.assertEquals( expectedEmail, actualEmail);
        Assert.assertTrue(activityStreamPage.firstPostedVoteButton.isDisplayed());
    }


    @Then("user should be able to select -Allow multiple choice- checkbox")
    public void user_should_be_able_to_select_allow_multiple_choice_checkbox() {
        activityStreamPage.allowMultipleChoiceCheckBox.click();

        Assert.assertTrue(activityStreamPage.allowMultipleChoiceCheckBox.isSelected());
    }


    @When("user click the Send Button")
    public void user_click_the_send_button() {

        BrowserUtils.sleep(3);

        activityStreamPage.sendButton.click();
    }


    @When("user adds one recipient")
    public void user_adds_one_recipient() {
        user_removes_the_default_recipient();
        activityStreamPage.addNewRecipientButton.click();

        activityStreamPage.addNewRecipientInputBox.sendKeys("Maru" + Keys.ENTER);
    }


    @When("user adds one answer {string}")
    public void user_adds_one_answer(String answer1) {
        activityStreamPage.answer1Input1.clear();
        activityStreamPage.answer1Input1.sendKeys(answer1);
    }


    @Then("user should see Error message: {string}")
    public void user_should_see_error_message(String expectedErrorMsg) {



        WebElement actualErrorMsg = activityStreamPage.errorMessage;
        wait.until(ExpectedConditions.visibilityOf(actualErrorMsg));


       Assert.assertTrue(actualErrorMsg.isDisplayed());
       Assert.assertEquals(expectedErrorMsg , actualErrorMsg.getText());
    }




    @Then("user should be able to select multiple answers from the poll")
    public void user_should_be_able_to_select_multiple_answers_from_the_poll() {
        activityStreamPage.pollCheckBox1.click();
        activityStreamPage.pollCheckBox2.click();




        Assert.assertTrue(activityStreamPage.pollCheckBox1InputTag.isSelected());
        Assert.assertTrue(activityStreamPage.pollCheckBox2InputTag.isSelected());
    }


    @And("user adds a second question {string}")
    public void userAddsASecondQuestion(String question2) {

        activityStreamPage.addNewQuestion.click();


        activityStreamPage.questionInput2.sendKeys(question2);
    }

    @And("user adds multiple answers under the second question {string} and {string}")
    public void userAddsMultipleAnswersUnderTheSecondQuestion(String answer3, String answer4) {

        activityStreamPage.answer1Input2.clear();
        activityStreamPage.answer2Input2.clear();

        activityStreamPage.answer1Input2.sendKeys(answer3);
        activityStreamPage.answer2Input2.sendKeys(answer4);
    }

    @Then("user should be able to select multiple answers from the first question")
    public void userShouldBeAbleToSelectMultipleAnswersFromTheFirstQuestion() {
        user_should_be_able_to_select_multiple_answers_from_the_poll();
    }

    @Then("user should be able to select only one answer from the second question")
    public void userShouldBeAbleToSelectOnlyOneAnswerFromTheSecondQuestion() {

        activityStreamPage.pollRadioButton1.click();
        activityStreamPage.pollRadioButton2.click();

        Assert.assertFalse( activityStreamPage.pollRadioButton1InputTag.isSelected());
        Assert.assertTrue( activityStreamPage.pollRadioButton2InputTag.isSelected());

    }
}
