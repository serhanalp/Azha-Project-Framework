@login
Feature: Crmly login feature

  Background: User is already in the login page
    Given the user is on the login page

  @wip
  Scenario: Verify login with given credentials
    Given the user logged in with username as "helpdesk1@cybertekschool.com" and password as "UserUser"

  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"

    Examples:
      | userType        |
      | helpdesk        |
      | human resources |
      | marketing       |