Feature: As a user, I should be able to access to the Company page.


  Background: User is already logged in
    Given the user is on the login page
    When the user logged in as "help desk"

  @B28G23-95
  Scenario: Verify users see the 7 modules in the Company page shown as designed
    Given users are on the homepage
    When users click the Company module
    Then verify users see the the users see flowing seven options:
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News(RSS)   |
