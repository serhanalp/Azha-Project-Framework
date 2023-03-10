package net.crmly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.LoginPage;
import net.crmly.utilities.ConfigurationReader;
import org.junit.Assert;

public class US74_Login_StepDefinitions {
    LoginPage loginPage=new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        //System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("helpdesk")){
            username = ConfigurationReader.getProperty("helpDesk_username");
            password = ConfigurationReader.getProperty("helpDesk_password");
        }else if(userType.equalsIgnoreCase("human resources")){
            username = ConfigurationReader.getProperty("humanResources_username");
            password = ConfigurationReader.getProperty("humanResources_password");
        }else if(userType.equalsIgnoreCase("marketing")){
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
        loginPage.login(username,password);
    }

    @When("the user enters {string} or {string}")
    public void theUserEntersOr(String username, String password) {
        loginPage.login(username,password);
    }

    @Then("the user should see {string} message")
    public void theUserShouldSeeMessage(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.errorMessage.getText();

        Assert.assertEquals("Messages DO NOT match!", expectedErrorMessage, actualErrorMessage);
    }
}
