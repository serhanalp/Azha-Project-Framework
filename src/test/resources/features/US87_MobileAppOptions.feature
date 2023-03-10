Feature: Mobile App Options to download
  Agile Story: As a user, I want to see mobile app options to download.

  Background: user is already logged in
    Given the user logged in with username as "helpdesk1@cybertekschool.com" and password as "UserUser"
@B28G9-144
  Scenario:
    When user scrolls down to Mobile Applications
    Then  user sees mobile app options displayed below
      | APP STORE   |
      | GOOGLE PLAY |