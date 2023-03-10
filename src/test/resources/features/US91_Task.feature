@US91
Feature: User task feature

  Background: User is already in the login page
    Given the user is on the login page
    And the user logged in with username as "helpdesk1@cybertekschool.com" and password as "UserUser"


  Scenario: Verify when user create a task successfully, user should see confirmation pop up
    Given User clicks "Tasks" on the left side bar
    When user on the tasks page user clicks New Task button
    And user write task title
    And user clicks ADD TASK button
    Then user should see "Task has been created" confirmation message as a popup on the task page right up side


  Scenario: Verify when user did not write the task title, user should see error message
    Given User clicks "Tasks" on the left side bar
    When user on the tasks page user clicks New Task button
    And user clicks ADD TASK button
    Then user should see "The task name is not specified." error message on the top
