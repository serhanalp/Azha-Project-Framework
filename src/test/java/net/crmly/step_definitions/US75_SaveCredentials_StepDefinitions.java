package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.LoginPage;
import org.junit.Assert;

public class US75_SaveCredentials_StepDefinitions {
    LoginPage loginPage = new LoginPage();

    @When("the user enters username as {string} and password as {string}")
    public void the_user_enters_username_as_and_password_as(String username, String password) {
        loginPage.userNameBox.sendKeys(username);
        loginPage.passwordBox.sendKeys(password);
    }
    @When("the user clicks on Remember me on this computer checkbox")
    public void the_user_clicks_on_remember_me_on_this_computer_checkbox() {
       loginPage.rememberMeCheckBox.click();
    }
    @Then("the user is able to save their credentials")
    public void the_user_is_able_to_save_their_credentials() {
        Assert.assertTrue(loginPage.rememberMeCheckBox.isSelected());
    }
}
