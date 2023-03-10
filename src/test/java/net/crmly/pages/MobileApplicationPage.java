package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileApplicationPage extends BasePage {

    public MobileApplicationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[.='Mobile application']")
    public WebElement mobileApplication;

    @FindBy(xpath = "//span[.='App Store']")
    public WebElement appleStore;

    @FindBy(xpath = "//span[.='Google Play']")
    public WebElement googlePlay;
}
