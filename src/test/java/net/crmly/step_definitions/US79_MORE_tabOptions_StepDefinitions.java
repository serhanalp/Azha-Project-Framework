package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.BasePage;
import net.crmly.pages.ChatAndCallsPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US79_MORE_tabOptions_StepDefinitions extends BasePage {
    @When("the user clicks on MORE dropdown tab on top right on the homepage")
    public void the_user_clicks_on_more_dropdown_tab_on_top_right_on_the_homepage() {
    MORE_dropdownTop.click();
    }
    @Then("the user sees MORE_Dropdown_Options")
    public void the_user_sees_more_dropdown_options(List<String> Expected_MORE_Options) {
        List<String> Actual_MORE_dropdownOptions = new ArrayList<>();
        for (WebElement each : MORE_Dropdown_Options) {

             Actual_MORE_dropdownOptions.add(each.getText().trim());
        }
            Assert.assertEquals(Expected_MORE_Options, Actual_MORE_dropdownOptions);

    }

}
