package com.sprint2.step_definitions;

import com.sprint2.pages.LoginPage;
import com.sprint2.pages.LogoutPage_IS;
import com.sprint2.utilities.BrowserUtils;
import com.sprint2.utilities.ConfigurationReader;
import com.sprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.handler.codec.http.CombinedHttpHeaders;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class B30G17_136_StepDef_Logout_IS {

    LoginPage loginPage = new LoginPage();

    LogoutPage_IS logoutPage = new LogoutPage_IS();



    @When("User clicks on user profile name")
    public void userClicksOnUserProfileName() {
        logoutPage.userProfile.click();
        BrowserUtils.sleep(2);
    }


    @And("User clicks on log out option")
    public void userClicksOnLogOutOption() {
        logoutPage.logOutBtn.click();
    }

    @Then("User can log out")
    public void userCanLogOut() {
        String expectedTitle = "Authorization";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }


    @Then("User sees the following options is displayed")
    public void userSeesTheFollowingOptionsIsDisplayed(List<String> expectedOptions) {
        logoutPage.userProfile.click();
        List<String> actualOptions = new ArrayList<>();


        for (WebElement eachdropDownMenu : logoutPage.DropDownMenu) {
            actualOptions.add(eachdropDownMenu.getText());


        }
        Assert.assertEquals(expectedOptions,actualOptions);

    }
}


