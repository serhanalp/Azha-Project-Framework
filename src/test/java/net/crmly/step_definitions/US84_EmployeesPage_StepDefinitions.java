package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.EmployeesPage;
import net.crmly.utilities.BrowserUtils;
import org.junit.Assert;

import java.util.List;

public class US84_EmployeesPage_StepDefinitions {
    EmployeesPage employeesPage = new EmployeesPage();

    @When("the user clicks on {string} module on the left hand side")
    public void the_user_clicks_on_module_on_the_left_hand_side(String moduleName) {
        employeesPage.clickOnOption(employeesPage.menuOptions, moduleName);
    }


    @Then("the user sees modules below on the page")
    public void the_User_Sees_Modules_Below_On_The_Page(List<String> expectedModuleNames) {

        List<String> actualModuleNames = BrowserUtils.getElementsText(employeesPage.employeesPageModules);

        Assert.assertTrue(actualModuleNames.containsAll(expectedModuleNames));
    }
}
