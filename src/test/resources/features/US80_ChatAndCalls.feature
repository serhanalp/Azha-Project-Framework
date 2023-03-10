@regression @chatAndCalls
Feature: Crmly Chat and Calls feature access
  User Story: As a user, I should be able to access the Chat and Calls module.

  Background: User is already logged in to Crmly
    Given the user is on the login page
    And the user logged in with username as "helpdesk1@cybertekschool.com" and password as "UserUser"
  #And the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"
  #And the user logged in with username as "marketing1@cybertekschool.com" and password as "UserUser"
  @B28G9-108
  Scenario: Verify access to "Chat and Calls" module and its sub-modules
    When the user clicks on Chat and Calls module
    Then the user sees sub-modules below
      | Message(s)      |
      | Notifications   |
      | Settings        |
      | Activity Stream |

