package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage extends BasePage{

    public ActivityStreamPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//body[@contenteditable]")
    public WebElement messageBox;

    @FindBy(xpath = "//div[@id='feed-add-buttons-blockblogPostForm']/button[@id='blog-submit-button-save']")
    public WebElement sendMessageButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelMessageButton;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement messageError;




}
