package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.ActivityStreamPage;
import net.crmly.utilities.BrowserUtils;
import org.junit.Assert;

public class US77_DesktopDownload_StepDefinitions {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();


    @When("user sees DESKTOP CLIENT")
    public void user_sees_desktop_client() {
        BrowserUtils.hover(activityStreamPage.macOS);
    }

    @Then("MAC OS option is displayed")
    public void mac_os_option_is_displayed() {
        Assert.assertEquals(true, activityStreamPage.macOS.isDisplayed());
    }

    @Then("WINDOWS option is displayed")
    public void windows_option_is_displayed() {
        Assert.assertEquals(true, activityStreamPage.windows.isDisplayed());
    }

    @Then("Linux option is displayed")
    public void linux_option_is_displayed() {
        Assert.assertEquals(true, activityStreamPage.linux.isDisplayed());
    }

}
