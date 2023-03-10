@wip
Feature: Chat and Calls module accessibility
  Background:  User is already in the log in page
    Given the user is on the login page
    When the user logged in as "hr"

  Scenario: Chat and Calls module all options verification
    Given users are on the homepage
    When users click the Chat and Calls module
    Then verify users see following four options:
      | Message       |
      | Notification  |
      | Settings      |
      | Active Stream |


# This is the same Scenario that can be done this way too:
 # Scenario: Chat and Calls module all options verification
   # Given users are on the homepage
   # When users click the Chat and Calls module
   # Then verify users see following "<4>" options: "<Message Notification Settings Active Stream>"