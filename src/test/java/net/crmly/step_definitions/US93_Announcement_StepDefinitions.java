package net.crmly.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.ActivityStreamPage;
import net.crmly.pages.AnnouncementPage;
import net.crmly.pages.BasePage;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US93_Announcement_StepDefinitions extends AnnouncementPage {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    Faker faker = new Faker();
    String message = faker.backToTheFuture().quote();

    @When("clicks on Announcement button")
    public void clicks_on_announcement_button() {
        for (WebElement each : activityStreamPage.moreButtonOptions) {
            if (each.getText().equals("Announcement")) {
                each.click();
            }
        }
    }

    @When("user types text in Announcement box")
    public void user_types_text_in_announcement_box() {
        Driver.getDriver().switchTo().frame(frame);
        messageBox.sendKeys(message);
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("user sees announcement message displayed")
    public void user_sees_announcement_message_displayed() {
        Assert.assertTrue(firstMessage.getText().contains(message));
    }
}
