Feature: CRM Mobile App Options to Download feature

  Background:  User is already in the log in page
    Given the user is on the login page
    When the user logged in as "hr"


  #User Story: As a user, I want to see mobile app options to download.

  Scenario: Verify user can see mobile app options
    Given users are on the homepage
    Then user should see the following mobile app options:
      |APP STORE|
      |GOOGLE PLAY|


