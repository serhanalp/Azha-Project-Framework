
Feature: Accessing Driver Page

  Background: User is already in the login page
    Given the user is on the login page

  Scenario: Verify the users view all modules in the Drive page.
    When The User Enters user name "helpdesk7@cybertekschool.com"
    Then The user Enters password "UserUser"
    Then Users click on the login button
    Then Users clicks on the drive
    When Users sees "My Drive" first in the driver page
    Then Users sees "all documents" second in the driver page
    And Users sees  "Company Drive" third in the driver page
    And Users sees "Sales and Marketing" fourth in the driver page
    And  Users sees "Top Management's documents" fifth in the driver page
    Then Users sees "Drive Cleanup" sixth in the driver page

