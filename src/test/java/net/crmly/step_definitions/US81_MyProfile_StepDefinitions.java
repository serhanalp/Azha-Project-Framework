package net.crmly.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.crmly.pages.MyProfile;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US81_MyProfile_StepDefinitions {

    MyProfile myProfile = new MyProfile();

    @Given("user click the my profile link")
    public void user_click_the_my_profile_link() {
        myProfile.myProfileLink.click();
    }

    @Then("user sees options displayed on below examples")
    public void user_sees_options_displayed_on_below_examples(List<String> expectedOptionOnMyProfile) {

        List<String> actualOptions = new ArrayList<>();

        for (WebElement element : myProfile.myProfileOptionList){

            actualOptions.add(element.getText());
        }

      //  System.out.println(expectedOptions); // for debug
      //  System.out.println(expectedOptionOnMyProfile); // for debug

        Assert.assertEquals(expectedOptionOnMyProfile,actualOptions);
    }
}
