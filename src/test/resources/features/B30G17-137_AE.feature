@B30G17-137
Feature: As a user, I want to access my profile page

  Background: User is already in the log in page
    Given the user is on the login page
    Given the user logged in with username as "hr10@cydeo.com" and password as "UserUser"

  Scenario: User view the options on my profile page
    When user clicks My profile link from menu user block
    And user is on My Profile page
    Then  user should view the following options
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |

    Scenario: Verify the email address under the General tab
      When user clicks My profile link from menu user block
      And user is on My Profile page
      Then user should see email information as "hr10@cydeo.com"







