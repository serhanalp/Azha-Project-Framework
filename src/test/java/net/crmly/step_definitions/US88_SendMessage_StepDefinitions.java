package net.crmly.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.ActivityStreamPage;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


import java.time.Duration;

public class US88_SendMessage_StepDefinitions {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("user clicks on the Message tab")
    public void user_clicks_on_the_message_tab() {

        Driver.getDriver().navigate().refresh();
        activityStreamPage.messageTab.click();

    }
    @When("user is able to write a text message on the message body")
    public void user_is_able_to_write_a_text_message_on_the_message_body() {

        //activityStreamPage.messageBox.click();

        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();

        actions.sendKeys(faker.harryPotter().quote());
    }
    @Then("user is able to send a message successfully clicking the Send button")
    public void user_is_able_to_send_a_message_successfully_clicking_the_send_button() {

        activityStreamPage.sendMessageButton.click();
        Assert.assertTrue(activityStreamPage.topMessage.isDisplayed());
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
