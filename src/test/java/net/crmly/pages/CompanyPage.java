package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class CompanyPage extends BasePage{
    public CompanyPage ()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[normalize-space()='Company']")
    public WebElement companyPageClick;

    @FindBy(xpath = "//span[contains(text(),'About Company')]")
    public WebElement aboutCompany ;

    @FindBy(xpath = "//span[contains(text(),'Official Information')]")
    public WebElement officialInformation;

    @FindBy(xpath = "//span[contains(text(),'Our Life')]")
    public  WebElement ourLife;

    @FindBy(xpath = "//span[contains(text(),'Photo Gallery')]\n")
    public  WebElement PhotoGallery;

    @FindBy(xpath ="//span[contains(text(),'Video')]" )
    public WebElement video;

    @FindBy(xpath = "//span[contains(text(),'Career')]")
    public WebElement career;

    @FindBy(xpath = "//span[contains(text(),'Career')]")
    public WebElement businessCareer;

    @FindBy(xpath = "//span[contains(text(),'Business News (RSS)')]")
    public WebElement businessNews;

   // @FindBy(xpath = "//div[@class='main-buttons-item']")
    @FindBy(xpath = "//div[@id='top_menu_id_about']//a")
    public List<WebElement> companyPageMenue;





}

