package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Valid_Login_step_definitions {

    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("user use username {string} and passcode {string} and user clicks the login button")
    public void user_use_username_and_passcode_and_clicks_log_in(String username, String password) {
        loginPage.login(username,password);
    }



    @Then("verify the user should be at the dashboard page")
    public void verifyTheUserShouldBeAtTheDashboardPage() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));
    }


}
