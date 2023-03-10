package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.EmployeesPage;
import org.junit.Assert;

public class US84_EmployeesPage_StepDefinitions {
    EmployeesPage employeesPage = new EmployeesPage();

    @When("the user clicks on {string} module on the left hand side")
    public void the_user_clicks_on_module_on_the_left_hand_side(String moduleName) {
        employeesPage.clickOnOption(employeesPage.menuOptions, moduleName);
    }

    @Then("the user sees all the {string} list in this page")
    public void the_user_sees_all_the_list_in_this_page(String expectedTitle) {
        Assert.assertEquals(employeesPage.employeesTitle.getText(), expectedTitle);
    }

}
