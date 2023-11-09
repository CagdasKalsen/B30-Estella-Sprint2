package com.sprint2.step_definitions;

import com.sprint2.pages.LoginPage_CK;
import com.sprint2.utilities.ConfigurationReader;
import com.sprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class B30G17_135_Step_Def_Login_CK {
    LoginPage_CK loginPage=new LoginPage_CK();
    @Given("user is on the login page")
    public void user_is_on_the_home_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user enters valid credentials {string} and {string}")
    public void user_enters_valid_credentials_and(String username, String password) {
       loginPage.login(username,password);
    }
    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        WebElement confirmationElement=Driver.getDriver().findElement(By.xpath("//span[@class='logo-text']"));
        Assert.assertTrue(confirmationElement.isDisplayed());

    }
    @When("user enters invalid credentials {string} and {string}")
    public void user_enters_invalid_credentials_and(String invalidUsername, String invalidPassword) {

        loginPage.login(invalidUsername,invalidPassword);

    }
    @Then("the user should see Incorrect login or password message")
    public void the_user_should_see_incorrect_login_or_password_message() {
        WebElement errorText= Driver.getDriver().findElement(By.xpath("//div[.='Incorrect login or password']"));

        Assert.assertTrue(errorText.isDisplayed());
    }
    @When("user click login button without credentials")
    public void user_click_login_button_without_credentials() {
        loginPage.login("","");
    }
    @Then("user should see Please fill out this field error message")
    public void user_should_see_please_fill_out_this_field_error_message() {

        WebElement errorText= Driver.getDriver().findElement(By.xpath("//div[.='Please fill out this field']"));

        Assert.assertFalse(errorText.isDisplayed());
    }
    @Then("user should see  Remember Me link and be able to click the box")
    public void user_should_see_remember_me_link_and_be_able_to_click_the_box() {
        Assert.assertTrue(loginPage.checkBoxDiv.isDisplayed());
        loginPage.checkBox.click();
        Assert.assertTrue(loginPage.checkBox.isEnabled());
    }
    @When("user enters {string}")
    public void user_enters(String password) {
       loginPage.password.sendKeys(password);
    }
    @Then("user should see the password in bullet signs")
    public void user_should_see_the_password_in_bullet_signs() {

        Assert.assertTrue(loginPage.passwordHidden.getAttribute("type").equals("password"));
    }

    @When("{string} user enters with valid credential")
    public void userEntersWithValidCredential(String usertype) {
        loginPage.loginWithUserType(usertype);
    }
}
