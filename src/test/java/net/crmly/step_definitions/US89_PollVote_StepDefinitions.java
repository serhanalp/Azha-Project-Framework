package net.crmly.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.crmly.pages.ActivityStreamPage;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US89_PollVote_StepDefinitions {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    Faker faker = new Faker();

    @Given("user clicks on {string} module on Activity Stream Page")
    public void user_clicks_on_module_on_activity_stream_page(String moduleName) {

        activityStreamPage.clickTopMidTabOptions(activityStreamPage.topMidTabOptions, moduleName);
    }

    @And("user writes a poll title")
    public void userWritesAPollTitle() {
        Driver.getDriver().switchTo().frame(activityStreamPage.messageBoxIframe);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(faker.lordOfTheRings().location()).perform();

        Driver.getDriver().switchTo().defaultContent();
    }

    @And("user types a poll question and two answers")
    public void userTypesAPollQuestionAndTwoAnswers() {
        activityStreamPage.pollQuestionBox.sendKeys(faker.lordOfTheRings().character() + Keys.TAB +
                faker.harryPotter().character() + Keys.TAB + faker.harryPotter().character());
        activityStreamPage.sendMessageButton.click();
    }

    @Given("user sees a poll on the page and chooses an answer")
    public void user_sees_a_poll_on_the_page_and_chooses_an_answer() {
        activityStreamPage.getElement();
        activityStreamPage.pollOption.click();
    }

    @Given("user clicks on Vote button")
    public void user_clicks_on_vote_button() {
        activityStreamPage.voteButton.click();
    }

    @Then("user is able to successfully vote for an option")
    public void user_is_able_to_successfully_vote_for_an_option() {
        Assert.assertTrue(activityStreamPage.voteAgainButton.isEnabled());
    }


}
