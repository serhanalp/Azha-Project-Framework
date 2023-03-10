@B28G9-153
Feature: Access the correct modules

  Background: User is already logged in to Crmly
    Given the user is on the login page
    And the user logged in with username as "helpdesk1@cybertekschool.com" and password as "UserUser"

  @B28G9-152
  Scenario Outline: Verify Users should access the correct page when they click on any module
    When user click the "<module>"
    Then user should see the "<title>"
    Examples:
      | module           | title                   |
      | Activity Stream  | Portal                  |
      | Tasks            | My tasks                |
      | Chat and Calls   | Chat and Calls          |
      | Workgroups       | Workgroups and projects |
      | Drive            | My Drive                |
      | Calender         | Portal                  |
      | Mail             | Mailbox Integration     |
      | Contact Center   | Contact Center          |
      | CRM              | Portal                  |
      | Time and Reports | Absence Chart           |
      | Employees        | Company Structure       |
      | Services         | Meeting Rooms           |
      | Company          | Company                 |