@login
Feature: Users should be able to login

  #Background: User is already in the log in page

  @wip
  Scenario: Verify login with different er types
  Given the user is on the login page
  When the user logged in as "hr"
  #When the user logged in with username as "xxx" and password as "sddsds"
  #And user click the login button
  Then verify the user should be at the home page


