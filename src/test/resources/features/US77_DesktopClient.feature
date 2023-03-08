@desktopDownloadOptions
Feature: See desktop options to download
  User story: B28-G9-77 As a user I should be able to see desktop options to download

  Background: User is already logged in to Crmly
    Given the user is on the login page
    And the user logged in with username as "helpdesk1@cybertekschool.com" and password as "UserUser"
  #And the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"
  #And the user logged in with username as "marketing1@cybertekschool.com" and password as "UserUser"

  Scenario: Check for desktop options to download
    When user sees DESKTOP CLIENT
    Then MAC OS option is displayed
    And WINDOWS option is displayed
    And Linux option is displayed