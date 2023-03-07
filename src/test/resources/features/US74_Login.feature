@regression @smoke
Feature: Crmly login feature

  Background: User is already in the login page
    Given the user is on the login page

  @B28G9-95 @login
  Scenario: Verify login with given credentials
    Given the user logged in with username as "helpdesk1@cybertekschool.com" and password as "UserUser"

  @B28G9-102 @negativeLogin
  Scenario: Verify login error message with invalid credentials provided
    When the user enters "wrong username" or "wrong password"
    Then the user should see "Incorrect username or password" message

  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"

    Examples:
      | userType        |
      | helpdesk        |
      | human resources |
      | marketing       |