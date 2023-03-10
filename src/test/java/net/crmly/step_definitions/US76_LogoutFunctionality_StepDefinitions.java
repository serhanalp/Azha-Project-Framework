package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.LoginPage;
import net.crmly.utilities.BrowserUtils;
import org.junit.Assert;

public class US76_LogoutFunctionality_StepDefinitions {

LoginPage loginPage = new LoginPage();

    @When("user clicks on profile tab in the right corner")
    public void user_clicks_on_profile_tab_in_the_right_corner() {
       loginPage.userProfileDropdown.click();
    }
    @When("user clicks on Logout button")
    public void user_clicks_on_logout_button() {
      loginPage.clickOnOption(loginPage.userProfileDropdownOptions, "log out");
        BrowserUtils.waitFor(3);
    }
    @Then("user sees {string} page")
    public void user_sees_login_page(String login) {

        Assert.assertEquals(loginPage.submitButton.getAttribute("value").toLowerCase(), login);
    }

}
