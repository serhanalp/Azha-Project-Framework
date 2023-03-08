@merve
Feature: User profile and options feature

  Background: User is already in the login page
    Given the user is on the login page
    And the user logged in with username as "helpdesk2@cybertekschool.com" and password as "UserUser"

  Scenario: Verify users should be able to see all the options under the user profile
   Given user click the profile module on the right side of page
    Then user should see on the right side as sub-modules below
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |


