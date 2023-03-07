package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.BasePage;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US85_ConfigureMenu_StepDefinitions extends BasePage{


    @Then("user clicks on configure menu button")
    public void user_clicks_on_configure_menu_button() {
        configureMenu.click();
    }
    @When("user sees {int} options displayed")
    public void user_sees_options_displayed(Integer int1) {
        List<String> actualOptions = new ArrayList<>();
        List<String> expectedOptions = new ArrayList<>(Arrays.asList("Configure menu items", "Collapse menu",
                "Remove current page from left menu","Add custom menu item","Change primary tool","Reset menu"));
        for (WebElement eachOption : configureMenuOptions) {
           actualOptions.add(eachOption.getText());
        }
Assert.assertEquals(expectedOptions,actualOptions);
    }

}
