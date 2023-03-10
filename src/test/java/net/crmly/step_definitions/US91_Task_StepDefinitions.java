package net.crmly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.BasePage;
import net.crmly.pages.MyTasksPage;
import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.Driver;
import org.junit.Assert;

public class US91_Task_StepDefinitions extends BasePage {

    @Given("User clicks {string} on the left side bar")
    public void user_clicks_task_on_the_left_side_bar(String option) {
        clickOnOption(menuOptions,option);

    }
    MyTasksPage myTasksPage=new MyTasksPage();
    @When("user on the tasks page user clicks New Task button")
    public void user_on_the_tasks_page_user_clicks_new_task_button() {
        myTasksPage.newTaskButton.click();

    }
    @When("user write task title")
    public void user_write_task_title() {
        BrowserUtils.sleep(5);
        Driver.getDriver().switchTo().frame(myTasksPage.iframeTasks);
        myTasksPage.titleBox.sendKeys("Hello we are here");
        Driver.getDriver().switchTo().parentFrame();

    }
    @When("user clicks ADD TASK button")
    public void user_clicks_add_task_button() {
        Driver.getDriver().switchTo().frame(myTasksPage.iframeTasks);
        myTasksPage.addTaskButton.click();

    }
    @Then("user should see {string} confirmation message as a popup on the task page right up side")
    public void user_should_see_confirmation_message_as_a_popup_on_the_task_page_right_up_side(String expectedPopUpText) {
        Driver.getDriver().switchTo().parentFrame();
        Assert.assertEquals(myTasksPage.popUpPanel.getText(),expectedPopUpText);
    }

    @Then("user should see {string} error message on the top")
    public void userShouldSeeErrorMessageOnTheTop(String actualErrorMessage) {
        Assert.assertEquals(myTasksPage.errorMessage.getText(),actualErrorMessage);


    }
}
