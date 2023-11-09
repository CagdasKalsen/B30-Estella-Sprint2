@B30G17-158
Feature: Activity stream page feature

#  Background:
#    Given "<User>" is on the login page

  @B30G17-156
  Scenario Outline: Users Login and View Options
    When "<User>" enters valid credentials and logs in
    Then user should be on the Activity stream page
    And user should see the following options:
      | MESSAGE |
      | TASK    |
      | EVENT   |
      | POLL    |
      | MORE    |

    Examples:
      | User      |
      | hr        |
      | helpdesk  |
      | marketing |


  @B30G17-157
  Scenario Outline: Users View Options under the MORE Tab after Login
    When "<User>" enters valid credentials and logs in
    And user clicks on the MORE tab
    Then user should see the following:
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |

    Examples:
      | User      |
      | hr        |
      | helpdesk  |
      | marketing |