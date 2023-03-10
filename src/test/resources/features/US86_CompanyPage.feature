Feature: user should be able to log in to the company page

  Background: User is already in the login page
    Given the user is on the login page

  @B28G9-86
  Scenario: user should be able to access the Company page
    Given the user logged in with username as "helpdesk1@cybertekschool.com" and password as "UserUser"
    When user goes to the company page
    Then should see the seven module in the page
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | More                 |
      | Career               |

