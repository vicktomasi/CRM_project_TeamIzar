Feature: CRM user profile options feature

  Background:  User is already in the log in page
    Given the user is on the login page
    When the user logged in as "hr"

  @wip
  Scenario:
    Given users are on the homepage
    When users click the profile name
    Then verify the users see following options:
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |