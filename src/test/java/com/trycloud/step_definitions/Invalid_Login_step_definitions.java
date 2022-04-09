package com.trycloud.step_definitions;

import com.trycloud.pages.InvalidLoginPage;
import com.trycloud.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Invalid_Login_step_definitions {

    LoginPage loginPage = new LoginPage();
    InvalidLoginPage invalidLoginPage = new InvalidLoginPage();


    @When("user enter invalid {string} and {string} and user clicks the login button")
    public void user_enter_invalid_and_and_user_clicks_the_login_button(String username, String password) {
        loginPage.login(username,password);
    }

    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String message) {
        Assert.assertEquals(message,invalidLoginPage.warningMessage.getText());
    }

}
