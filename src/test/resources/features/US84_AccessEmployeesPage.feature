@regression @employees

Feature: Verify user can access Employees page.
  User Story: As a user, I want to access the Employees page.

  Background: User is already logged in to Crmly
    Given the user is on the login page
    And the user logged in with username as "helpdesk2@cybertekschool.com" and password as "UserUser"
  #And the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"
  #And the user logged in with username as "marketing1@cybertekschool.com" and password as "UserUser"

  Scenario: Verify users can click on Employees page on the left column and reach Employees page
    When the user clicks on "Employees" module on the left hand side
    Then the user sees all the "Employees" list in this page