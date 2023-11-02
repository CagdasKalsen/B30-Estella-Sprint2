package com.sprint2.step_definitions;

import com.sprint2.pages.BasePage;
import com.sprint2.pages.MyProfilePage_AE;
import com.sprint2.pages.StreamPage_AE;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class B30G17_137_AE_MyProfile_StepDef {

    StreamPage_AE streamPage_ae = new StreamPage_AE();
    MyProfilePage_AE myProfilePage_ae = new MyProfilePage_AE();

    @When("user clicks My profile link from menu user block")
    public void user_clicks_my_profile_link_from_menu_user_block() {

        streamPage_ae.userBlock.click();
        streamPage_ae.myProfile.click();
    }

    @When("user is on My Profile page")
    public void user_is_on_my_profile_page() {

    }
    @Then("user should view the following options")
    public void user_should_view_the_following_options(List<String> expectedOptions) {

        List<WebElement> profileMenu = myProfilePage_ae.profileMenu.findElements(By.tagName("a"));

        List<String> actualOptions = new ArrayList<>();

        for (WebElement each : profileMenu) {
            actualOptions.add(each.getText());
        }

        Assert.assertEquals(actualOptions, expectedOptions);

    }

    @Then("user should see email information as {string}")
    public void user_should_see_email_information_as(String expectedEmail) {

        String actualEmailText = myProfilePage_ae.email.getText();

        Assert.assertEquals(actualEmailText, expectedEmail);

    }
}
