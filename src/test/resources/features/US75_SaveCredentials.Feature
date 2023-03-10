@regression  @saveCredentials
Feature: Save credentials feature
  User Story:

  Background: User is already in the login page
    Given the user is on the login page

  Scenario: Verify the users can check the "Remember me on this computer" checkbox on the login page.
    When the user clicks on "Remember me on this computer" checkbox
    Then the user sees the checkbox selected


