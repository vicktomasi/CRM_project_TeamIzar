Feature: CRM user profile options feature

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