Feature: Logout Functionality
  Agile Story: User should be able to logout


  Background: user is already logged in
    Given the user logged in with username as "helpdesk1@cybertekschool.com" and password as "UserUser"
    #And the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"
    #And the user logged in with username as "marketing1@cybertekschool.com" and password as "UserUser"
  @B28G9-138
  Scenario:
    When user clicks on profile tab in the right corner
    And user clicks on Logout button
    Then user sees "log in" page