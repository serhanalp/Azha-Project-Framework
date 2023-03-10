
Feature: Accessing Driver Page

  Background: User is already logged in to Crmly
    Given the user is on the login page
    And the user logged in with username as "helpdesk1@cybertekschool.com" and password as "UserUser"

  @B28G9-117
  Scenario: Verify the users view all modules in the Drive page.
    Then Users clicks on the drive
    When Users sees "My Drive" first in the driver page
    Then Users sees "all documents" second in the driver page
    And Users sees  "Company Drive" third in the driver page
    And Users sees "Sales and Marketing" fourth in the driver page
    And  Users sees "Top Management's documents" fifth in the driver page
    Then Users sees "Drive Cleanup" sixth in the driver page

