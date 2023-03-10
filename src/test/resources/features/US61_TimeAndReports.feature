Feature: As a user I want to be able to access the Time and Report page.

  Background:  User is already in the log in page
    Given the user is on the login page
    When the user logged in as "hr"


  @US61
  Scenario: Verify the user views all modules on the Time and Reports page.
    Given users are on the homepage
    When user clicks the Time and Reports module
    Then verify the user sees the following five options
      | Absence Chart          |
      | Worktime               |
      | Bitrix.Time            |
      | Work Reports           |
      | Meetings and Briefings |