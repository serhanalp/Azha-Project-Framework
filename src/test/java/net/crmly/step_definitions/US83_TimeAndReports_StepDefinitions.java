package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.TimeAndReportsPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.*;

public class US83_TimeAndReports_StepDefinitions {

    TimeAndReportsPage timeAndReportsPage= new TimeAndReportsPage();

    @When("the user clicks on the Time and Reports module")
    public void the_User_Clicks_On_The_Time_And_Reports_Module(){

        timeAndReportsPage.timeAndReportsModule.click();

    }

    @Then("the users see sub-modules below")
    public void the_Users_See_SubModules_Below(List<String> expectedSubModules){

        List<String> actualModules = new ArrayList<>();

        for (WebElement each : timeAndReportsPage.subModules) {
            actualModules.add(each.getText());
        }
        Assert.assertEquals(actualModules,expectedSubModules);
    }
}
