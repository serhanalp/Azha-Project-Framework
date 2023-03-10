
Feature: Create Appreciation functionality
  User story: user should be able to make an Appreciation using the Appreciation tab

  Background: user is already logged in
    Given the user logged in with username as "helpdesk1@cybertekschool.com" and password as "UserUser"
    #And the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"
    #And the user logged in with username as "marketing1@cybertekschool.com" and password as "UserUser"
@B28G9-131
  Scenario:
    When user clicks on More button
    And clicks on Appreciation button
    When user types text in Appreciation box
    And user clicks on the Send button
    Then user sees appreciation message displayed
@B28G9-133
  Scenario:
    When user clicks on More button
    And clicks on Appreciation button
    And user clicks on the Send button
    Then user sees  The message title is not specified message

