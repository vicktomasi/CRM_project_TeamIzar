Feature: As a user, I should be able to configure the menu.

  Background: User is already logged in
    Given the user is on the login page
    When the user logged in as "help desk"

  @B28G23-97
  Scenario: Verify users see the 7 modules in the Company page shown as designed
    Given users are on the homepage
    When users click the Configure Menu module
    Then verify users see the the users see flowing six options:
      | Configure menu items              |
      | Collapse menu                     |
      | Remove current page form left menu|
      | Add custom menu item              |
      | Change primary tool               |
      | Reset menu                        |
