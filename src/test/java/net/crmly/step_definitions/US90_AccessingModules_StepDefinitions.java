package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.BasePage;
import net.crmly.utilities.Driver;
import org.junit.Assert;

public class US90_AccessingModules_StepDefinitions extends BasePage {

    @When("user click the {string}")
    public void user_click_the(String link) {
        clickOnOption(menuOptions,link);


    }
    @Then("user should see the {string}")
    public void user_should_see_the(String title) {
        Assert.assertEquals(Driver.getDriver().getTitle(),"(1) "+title);
    }


}
