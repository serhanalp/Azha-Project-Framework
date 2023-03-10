package net.crmly.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.ActivityStreamPage;
import net.crmly.pages.AppreciationPage;
import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US94_Appreciation_StepDefinitions extends AppreciationPage {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    Faker faker = new Faker();
    String message = faker.backToTheFuture().quote();

    @When("user clicks on More button")
    public void user_clicks_on_more_button() {
        activityStreamPage.moreButton.click();
    }

    @When("clicks on Appreciation button")
    public void clicks_on_appreciation_button() {
        for (WebElement each : activityStreamPage.moreButtonOptions) {
            if (each.getText().equals("Appreciation")) {
                each.click();
            }
        }
    }

    @When("user types text in Appreciation box")
    public void user_types_text_in_appreciation_box() {
        Driver.getDriver().switchTo().frame(frame);
        messageBox.sendKeys(message);
        Driver.getDriver().switchTo().parentFrame();
    }

    @When("user clicks on the Send button")
    public void user_clicks_on_the_send_button() {
        sendButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("user sees appreciation message displayed")
    public void user_sees_appreciation_message_displayed() {
        Assert.assertEquals(message, firstMessage.getText());
    }

    @Then("user sees  The message title is not specified message")
    public void user_sees_the_message_title_is_not_specified_message() {
        String expectedErrorMessage = "The message title is not specified";
        Assert.assertEquals(expectedErrorMessage, errorMessage.getText().trim());
    }


}
