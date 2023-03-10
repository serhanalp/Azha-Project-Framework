package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.MobileApplicationPage;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US87_MobileAppOptions_StepDefinitions {

MobileApplicationPage mobileApplication = new MobileApplicationPage();
Actions actions = new Actions(Driver.getDriver());
    @When("user scrolls down to Mobile Applications")
    public void user_scrolls_down_to_mobile_applications() {
        actions.moveToElement(mobileApplication.mobileApplication);
    }
    @Then("user sees mobile app options displayed below")
    public void user_sees_mobile_app_options_displayed_below(List<String> expectedOptions) {
        List<String> actualOptions = new ArrayList<>();
        actualOptions.add(mobileApplication.appleStore.getText().trim());
        actualOptions.add(mobileApplication.googlePlay.getText().trim());
        Assert.assertEquals(expectedOptions,actualOptions);
    }
}
