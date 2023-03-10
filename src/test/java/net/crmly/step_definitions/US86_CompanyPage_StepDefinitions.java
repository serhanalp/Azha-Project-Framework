package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.CompanyPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US86_CompanyPage_StepDefinitions {
    CompanyPage companyPage = new CompanyPage();

    @When("user goes to the company page")
    public void user_goes_to_the_company_page() {
        companyPage.companyPageClick.click();
    }

    @Then("should see the seven module in the page")
    public void should_see_the_seven_module_in_the_page(List<String> companyPageMenu) {

        List<String> companyPageMenuTxt = new ArrayList<>();
        for (WebElement each : companyPage.companyPageMenue) {
            companyPageMenuTxt.add(each.getText());
        }

        System.out.println(companyPageMenuTxt);
        System.out.println(companyPageMenu);

        Assert.assertTrue(companyPageMenuTxt.containsAll(companyPageMenu));

    }
}


