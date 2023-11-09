package com.sprint2.step_definitions;

import com.sprint2.pages.ActivityPage_CK;
import com.sprint2.pages.LoginPage_CK;
import com.sprint2.utilities.ConfigurationReader;
import com.sprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class B30G17_143_Step_Def_Login_CK {
    LoginPage_CK loginPage=new LoginPage_CK();
    ActivityPage_CK activityPage=new ActivityPage_CK();
    @Given("{string} is on the login page")
    public void is_on_the_login_page(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("{string} enters valid credentials and logs in")
    public void enters_valid_credentials_and_logs_in(String user) {
       loginPage.loginWithUserType(user);
    }
    @Then("user should be on the Activity stream page")
    public void should_be_on_the_activity_stream_page() {
        Assert.assertTrue(activityPage.rm24.isDisplayed());
    }

    @Then("user should see the following options:")
    public void should_see_the_following_options(List<String>expected) {
        List<String> actual=new ArrayList<>();
        for (WebElement eachOption : activityPage.options) {
            actual.add(eachOption.getText());
        }


        Assert.assertTrue(expected.equals(actual));

    }
    @When("user clicks on the MORE tab")
    public void clicks_on_the_more_tab() {
       activityPage.moreBtn.click();
    }

    @Then("user should see the following:")
    public void userShouldSeeTheFollowing(List<String> expectedOptions) {
        List<String> actualOptions = new ArrayList<>();
        for (WebElement eachBtnOption : activityPage.moreBtnOptions) {
            actualOptions.add(eachBtnOption.getText());
        }
        Assert.assertTrue(expectedOptions.equals(actualOptions));
    }
}
