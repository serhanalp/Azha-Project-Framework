package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.AccessDriverPage;
import org.junit.Assert;

public class US82_AccessDrivePage_stepDefinitions {

    AccessDriverPage accessDriverPage = new AccessDriverPage();


    @Then("Users clicks on the drive")
    public void users_clicks_on_the_drive() {
        accessDriverPage.DriverButton.click();
    }
    @When("Users sees {string} first in the driver page")
    public void users_sees_first_in_the_driver_page(String expectedMyDriveButton) {
       Assert.assertTrue(accessDriverPage.MyDriveButton.isDisplayed());
    }
    @Then("Users sees {string} second in the driver page")
    public void users_sees_second_in_the_driver_page(String expectedAllDocumentsButton) {
        Assert.assertTrue(accessDriverPage.AllDocumentsButton.isDisplayed());
    }
    @Then("Users sees  {string} third in the driver page")
    public void users_sees_third_in_the_driver_page(String expectedCompanyDriveButton ) {
        Assert.assertTrue(accessDriverPage.CompanyDriveButton.isDisplayed());
    }
    @Then("Users sees {string} fourth in the driver page")
    public void users_sees_fourth_in_the_driver_page(String expectedSalesAndMarketingButton) {
        Assert.assertTrue(accessDriverPage.SalesAndMarketingButton.isDisplayed());
    }
    @Then("Users sees {string} fifth in the driver page")
    public void users_sees_fifth_in_the_driver_page(String expectedTopManagmentsDocumentsButton) {
        Assert.assertTrue(accessDriverPage.TopManagmentsDocumentsButton.isDisplayed());
    }
    @Then("Users sees {string} sixth in the driver page")
    public void users_sees_sixth_in_the_driver_page(String expectedDriveCleanUpButton) {
        Assert.assertTrue(accessDriverPage.DriveCleanUpButton.isDisplayed());
    }
}
