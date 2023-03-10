package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeesPage extends BasePage{

    public EmployeesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "structure-employee-title")
    public WebElement employeesTitle;

    @FindBy(xpath = "//div[contains(@class,'main-buttons-item')]")
    public List<WebElement> employeesPageModules;
}
