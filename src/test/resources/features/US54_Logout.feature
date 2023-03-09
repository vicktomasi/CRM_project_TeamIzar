Feature: CRM logout feature

  @wip
  Scenario: Verify the users log out from the app
    Given the users are on the homepage
    When users click the user profile name
    And users select the "Log Out" option
    Then verify the user back to the login page