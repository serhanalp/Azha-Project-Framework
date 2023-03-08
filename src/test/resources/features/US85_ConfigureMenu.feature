@regression
Feature: Configuration menu functionality
  Agile story: user should be able to configure the menu


  Scenario: 6 options under configure menu verification
    Given the user logged in with username as "helpdesk1@cybertekschool.com" and password as "UserUser"
    Then user clicks on configure menu button
    When user sees options displayed below
      | Configure menu items               |
      | Collapse menu                      |
      | Remove current page from left menu |
      | Add custom menu item               |
      | Change primary tool                |
      | Reset menu                         |
