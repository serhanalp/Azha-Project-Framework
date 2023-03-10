@regression @messageFunction

Feature: Verify voting for a poll with one answer
  User Story: As a user, I should be able to vote for a poll with one answer.

  Background: User is already logged in to Crmly
    Given the user is on the login page
    And the user logged in with username as "helpdesk2@cybertekschool.com" and password as "UserUser"
  #And the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"
  #And the user logged in with username as "marketing1@cybertekschool.com" and password as "UserUser"

  @B28G9-150
  Scenario: Verify users can select one answer and click the “VOTE” button to vote for a poll.
    When user clicks on "Poll" module on Activity Stream Page
    And user writes a poll title
    And user types a poll question and two answers
    And user sees a poll on the page and chooses an answer
    And user clicks on Vote button
    Then user is able to successfully vote for an option




