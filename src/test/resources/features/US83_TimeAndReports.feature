Feature: Crmly Time and Reports page access

  Background: User is already logged in to Crmly
    Given the user is on the login page
    And the user logged in with username as "helpdesk1@cybertekschool.com" and password as "UserUser"


  Scenario: Verify user is able to access the "Time and Reports" page
    When the user clicks on the Time and Reports module
    Then the users see sub-modules below
      | Absence Chart          |
      | Worktime               |
      | Bitrix24.Time          |
      | Work Reports           |
      | Meetings and Briefings |