package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.ActivityStreamPage;
import net.crmly.utilities.BrowserUtils;
import org.junit.Assert;

public class US77_DesktopDownloadOptions {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();


    @When("scrolling down lil")
    public void scrolling_down_lil() {
        BrowserUtils.hover(activityStreamPage.appStore);
    }

    @Then("app store option is displayed")
    public void app_store_option_is_displayed() {
        Assert.assertEquals(true, activityStreamPage.appStore.isDisplayed());
    }

    @Then("google play option is displayed")
    public void google_play_option_is_displayed() {
        Assert.assertEquals(true, activityStreamPage.googlePlay.isDisplayed());
    }

}
