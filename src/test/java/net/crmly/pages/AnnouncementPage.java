package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnnouncementPage extends BasePage{

    public AnnouncementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement frame;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBox;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;


    @FindBy(xpath = "(//div[starts-with(@id, 'blog_post_body_')])[1]")
    public WebElement firstMessage;

}
