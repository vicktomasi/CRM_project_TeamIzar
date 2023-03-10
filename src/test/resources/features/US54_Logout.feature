Feature: CRM logout feature

  Background:  User is already in the log in page
    Given the user is on the login page
    When the user logged in as "hr"


  @wip
  Scenario: Verify the users log out from the app
    Given users click the profile name
    When users click the user profile name
    And users select the Log Out option
    Then verify the user back to the login page