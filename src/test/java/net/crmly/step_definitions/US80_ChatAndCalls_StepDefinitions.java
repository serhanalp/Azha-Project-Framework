package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.BasePage;
import net.crmly.pages.ChatAndCallsPage;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US80_ChatAndCalls_StepDefinitions extends BasePage {

    @When("the user clicks on Chat and Calls module")
    public void the_user_clicks_on_module() {
            clickOnOption(menuOptions, "Chat and Calls");
    }
    @Then("the user sees sub-modules below")
    public void the_user_sees_sub_modules_below(List<String> expectedSubModules) {

        List<String> actualSubModules = new ArrayList<>();

        ChatAndCallsPage chatAndCallsPage = new ChatAndCallsPage();

        for (WebElement each : chatAndCallsPage.subModules) {
            actualSubModules.add(each.getAttribute("title").trim());
        }
        Assert.assertTrue(actualSubModules.containsAll(expectedSubModules));
    }

}
