@regression @messageFunction

Feature: Verify sending simple text messages using the message tab
  User Story: As a user, I should be able to send simple text messages using the message tab.

  Background: User is already logged in to Crmly
    Given the user is on the login page
    And the user logged in with username as "helpdesk2@cybertekschool.com" and password as "UserUser"
  #And the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"
  #And the user logged in with username as "marketing1@cybertekschool.com" and password as "UserUser"

  @B28G9-110
  Scenario: Verify user is be able to write on the message body and send a message after clicking the Message tab.
    When user clicks on the Message tab
    And user is able to write a text message on the message body
    Then user is able to send a message successfully clicking the Send button

  @B28G9-111
  Scenario: "The message title is not specified" is displayed when users try to send a message without content.
    When user clicks on the Message tab
    And user clicks on the Send button without writing a message
    Then user sees the "The message title is not specified" error message


