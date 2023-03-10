Feature: Crmly MORE tab Options visibility and functionality.
  User Story: As a user, I should be able to see all the options under the MORE tab on the homepage.

  Background: User is already logged in to Crmly
    Given the user is on the login page
    And the user logged in with username as "helpdesk1@cybertekschool.com" and password as "UserUser"
  #And the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"
  #And the user logged in with username as "marketing1@cybertekschool.com" and password as "UserUser"

  @B28G9-137 @v
  Scenario: Verify user is able to see all the options under the MORE tab on the homepage.
    When the user clicks on MORE dropdown tab on top right on the homepage
    Then the user sees MORE_Dropdown_Options
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |