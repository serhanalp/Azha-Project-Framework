package net.crmly.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.ActivityStreamPage;
import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class US88_SendMessage_StepDefinitions {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    Faker faker = new Faker();
    String message = faker.harryPotter().quote();

    @When("user clicks on the Message tab")
    public void user_clicks_on_the_message_tab() {

        activityStreamPage.messageTab.click();
        BrowserUtils.waitFor(2);

    }
    @When("user is able to write a text message on the message body")
    public void user_is_able_to_write_a_text_message_on_the_message_body() {

        Driver.getDriver().switchTo().frame(activityStreamPage.messageBoxIframe);

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(message).perform();

        Driver.getDriver().switchTo().defaultContent();

    }
    @Then("user is able to send a message successfully clicking the Send button")
    public void user_is_able_to_send_a_message_successfully_clicking_the_send_button() {

        activityStreamPage.sendMessageButton.click();
        activityStreamPage.getElement();
        Assert.assertEquals(message, activityStreamPage.topMessage.getText().trim());
    }

    @When("user clicks on the Send button without writing a message")
    public void user_clicks_on_the_send_button_without_writing_a_message() {
        activityStreamPage.sendMessageButton.click();
    }
    @Then("user sees the {string} error message")
    public void user_sees_the_error_message(String expectedMessage) {

        String actualMessage =activityStreamPage.messageError.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

}
