package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ActivityStreamPage extends BasePage{

    //TODO: Feel free to add more Activity Stream Page locators or methods you need here under mine - Serhan

    public ActivityStreamPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Message']")
    public WebElement messageTab;

    @FindBy(xpath = "//div[@id='feed-add-post-form-tab']/span")
    public List<WebElement> topMidTabOptions;   // Message, Task, Event, Poll, More

    @FindBy(xpath = "//div[@id='divoPostFormLHE_blogPostForm']//div[@class='feed-add-post-text']")
    public WebElement messageBox;

    @FindBy(xpath = "//div[@id='feed-add-buttons-blockblogPostForm']/button[@id='blog-submit-button-save']")
    public WebElement sendMessageButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelMessageButton;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement messageError;

    @FindBy(xpath = "(//div[@class=' feed-post-contentview feed-post-text-block-inner']/div)[1]")
    public WebElement topMessage;

    public void clickTopMidTabOptions(List<WebElement> elements, String element){

        for (WebElement each : elements) {
            if (each.getText().equals(element.trim())){
                each.click();
                break;
            } } }

    public WebElement getElement() {  // this method prevents StaleElementReferenceException by relocating the same element
        try {
            return new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class=' feed-post-contentview feed-post-text-block-inner']/div)[1]")));
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            return new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class=' feed-post-contentview feed-post-text-block-inner']/div)[1]")));
        }
    }


    // DESKTOP CLIENT
    @FindBy(xpath = "(//*[contains(@class, 'b24-app-block-content-apps')])[1]")
    public WebElement macOS;

    @FindBy(xpath = "(//*[contains(@class, 'b24-app-block-content-apps')])[2]")
    public WebElement windows;

    @FindBy(xpath = "(//*[contains(@class, 'b24-app-block-content-apps')])[3]")
    public WebElement linux;


}
