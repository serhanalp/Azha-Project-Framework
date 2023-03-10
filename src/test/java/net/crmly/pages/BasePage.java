package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    // This page contains common WebElements and methods for all pages.

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='menu-item-link']")
    public List<WebElement> menuOptions;    // left panel options as a List

    @FindBy(className = "menu-favorites-more-text")
    public WebElement moreTab; // "More..." button on left panel to be able to retrieve all options above

    @FindBy(className = "header-search-input")
    public WebElement searchBar;

    @FindBy(css = "#user-block")
    public WebElement userProfileDropdown;   // top right of the screen where user email is shown

    @FindBy(xpath = "//span[@class='menu-popup-item-text'][normalize-space()]")
    public List<WebElement> userProfileDropdownOptions;    // user profile dropdown options as a List

    @FindBy (xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement MORE_dropdownTop;

    @FindBy (xpath = "//span[starts-with(@class,\"menu-popup-item menu\")]")
    public List <WebElement> MORE_Dropdown_Options;


    /** This method lets us click on a desired Base Page WebElement contained in a List
     *  (such as Left panel options or user settings dropdown options)
     * @param options
     * @param optionName
     */
    public void clickOnOption(List<WebElement> options, String optionName){

        for (WebElement each : options) {
            if (each.getText().equalsIgnoreCase(optionName.trim())){
                each.click();
                break;
            }
        }
    }

    @FindBy(id = "left-menu-settings")
    public WebElement configureMenu;


    @FindBy(xpath = "//span[starts-with(@class,'menu-popup-item menu')]")
    public List<WebElement> configureMenuOptions;


}
