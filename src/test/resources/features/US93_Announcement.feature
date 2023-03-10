Feature: Create Announcement functionality
  User story: user should be able to make an Announcement using the Announcement tab

  Background:

  Background: user is already logged in
    Given the user logged in with username as "helpdesk1@cybertekschool.com" and password as "UserUser"
    #And the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"
    #And the user logged in with username as "marketing1@cybertekschool.com" and password as "UserUser"
  @B28G9-140
  Scenario:
    When user clicks on More button
    And clicks on Announcement button
    When user types text in Announcement box
    And user clicks on the Send button
    Then user sees announcement message displayed
  @B28G9-141
  Scenario:
    When user clicks on More button
    And clicks on Appreciation button
    And user clicks on the Send button
    Then user sees  The message title is not specified message