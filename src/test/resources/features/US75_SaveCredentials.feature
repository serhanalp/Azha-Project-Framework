@regression
Feature: Crmly Save credentials feature
  User Story: As a user I should be able to save my user credential on a computer.

  Background: User is already in the login page
    Given the user is on the login page

  @B28G9-143
  Scenario: Verify user can save credentials in login page
    When the user enters username as "helpdesk1@cybertekschool.com" and password as "UserUser"
    And the user clicks on Remember me on this computer checkbox
    Then the user is able to save their credentials
