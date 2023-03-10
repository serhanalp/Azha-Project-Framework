@B28G9-112
Feature: My profile page to see 5 options
  Agile Story: As a user, I want to access my profile page.

  Background: User is already in the login page
    Given the user is on the login page
    And the user logged in with username as "helpdesk2@cybertekschool.com" and password as "UserUser"

  Scenario: Verify user should be able to see 5 options
    Given user click the profile module on the right side of page
    And user click the my profile link
    Then user sees options displayed on below examples
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |