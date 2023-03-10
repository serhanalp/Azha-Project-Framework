package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyTasksPage {

    public MyTasksPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "tasks-buttonAdd")
    public WebElement newTaskButton;

    @FindBy(xpath = "//iframe[@src='/company/personal/user/491/tasks/task/edit/0/?IFRAME=Y&IFRAME_TYPE=SIDE_SLIDER']")
    public WebElement iframeTasks;


    @FindBy(xpath = "(//input[@placeholder='Things to do'])[1]")
    public WebElement titleBox;

    @FindBy(xpath = "//button[@class='ui-btn ui-btn-success']")
    public WebElement addTaskButton;

    @FindBy(xpath = "//div[.='Task has been created']")
    public WebElement popUpPanel;

    @FindBy(xpath = "//div[@class='task-message-label error']")
    public WebElement errorMessage;



}
