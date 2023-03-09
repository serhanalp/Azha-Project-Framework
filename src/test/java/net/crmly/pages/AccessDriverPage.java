package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessDriverPage {

    public AccessDriverPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement inputUserName;

    @FindBy(name= "USER_PASSWORD")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement logInButton;

   @FindBy(xpath = "(//span[@class='menu-item-link-text'])[5]")
    public WebElement DriverButton;


   @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[1]")
    public WebElement MyDriveButton;

   @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[2]")
    public WebElement AllDocumentsButton;



   @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[3]")
    public WebElement CompanyDriveButton;


    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[4]")
    public WebElement SalesAndMarketingButton;


    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[5]")
    public WebElement TopManagmentsDocumentsButton;


    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[6]")
    public WebElement DriveCleanUpButton;


}
