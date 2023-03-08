package net.crmly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.ActivityStreamPage;
import net.crmly.pages.BasePage;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US78_ProfileDropDown extends BasePage{

    @Given("user is on the CRM home page")
    public void user_is_on_the_crm_home_page() {
        Driver.getDriver().get("https://qa.crmly.net/stream/");
    }



    @When("user click the profile module on the right side of page")
    public void user_click_the_profile_module_on_the_right_side_of_page() {
        userProfileDropdown.click();

    }

    @Then("user should see on the right side as sub-modules below")
    public void user_should_see_on_the_right_side_as_sub_modules_below(List<String> expectedModules) {
        List<WebElement> actualModules = userProfileDropdownOptions;
        List<String> actualModulesStr=new ArrayList<>();
        for (WebElement each : actualModules) {
            actualModulesStr.add(each.getText());
        }
        Assert.assertEquals(expectedModules,actualModulesStr);


    }
}
