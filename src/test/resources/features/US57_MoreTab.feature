Feature:  As a user, I should be able to see
  all the options under the MORE tab on the homepage.

  Background:  User is already in the log in page
    Given the user is on the login page
    When the user logged in as "help desk"

  @US57
  Scenario:  Verify the users view all options under the MORE tab
    Given users are on the homepage
    When user clicks the MORE tab
    Then verify the user sees the following four options:
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |